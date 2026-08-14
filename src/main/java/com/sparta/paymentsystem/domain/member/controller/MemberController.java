package com.sparta.paymentsystem.domain.member.controller;

import com.sparta.paymentsystem.domain.member.dto.MemberResponse;
import com.sparta.paymentsystem.domain.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/me")
    public ResponseEntity<MemberResponse> me(@AuthenticationPrincipal long memberId) {
        return ResponseEntity.ok(memberService.getMe(memberId));
    }
}

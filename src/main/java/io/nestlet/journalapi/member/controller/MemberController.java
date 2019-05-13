package io.nestlet.journalapi.member.controller;

import io.nestlet.journalapi.member.domain.Member;
import io.nestlet.journalapi.member.domain.dto.MemberFindByNameRequestDto;
import io.nestlet.journalapi.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/findByEmail")
    public ResponseEntity<MemberFindByNameRequestDto> findByEmail(@RequestParam String email) {
        return new ResponseEntity<>(memberService.findByEmail(email), HttpStatus.OK);
    }

}

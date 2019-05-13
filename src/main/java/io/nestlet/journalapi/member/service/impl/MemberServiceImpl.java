package io.nestlet.journalapi.member.service.impl;

import io.nestlet.journalapi.member.domain.dto.MemberFindByNameRequestDto;
import io.nestlet.journalapi.member.repository.MemberRepository;
import io.nestlet.journalapi.member.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public MemberFindByNameRequestDto findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }
}

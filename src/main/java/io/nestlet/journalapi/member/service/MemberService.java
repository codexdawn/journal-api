package io.nestlet.journalapi.member.service;

import io.nestlet.journalapi.member.domain.dto.MemberFindByNameRequestDto;

public interface MemberService {
    MemberFindByNameRequestDto findByEmail(String email);
}

package io.nestlet.journalapi.member.domain.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MemberFindByNameRequestDto {
    private final String name;
    private final String email;
}

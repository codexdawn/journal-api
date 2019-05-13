package io.nestlet.journalapi.member.repository;

import io.nestlet.journalapi.member.domain.Member;
import io.nestlet.journalapi.member.domain.dto.MemberFindByNameRequestDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface MemberRepository extends CrudRepository<Member,Long> {
    MemberFindByNameRequestDto findByEmail(@Param("email") String email);
}

package io.nestlet.journalapi.post.repository;

import io.nestlet.journalapi.post.domain.Post;
import io.nestlet.journalapi.post.domain.PostReadRequestDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface PostRepository extends CrudRepository<Post,Long> {
    Optional<PostReadRequestDto> findByPId(@Param("id") long id);
}


package io.nestlet.journalapi.post.repository;

import io.nestlet.journalapi.post.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PostRepository extends CrudRepository<Post,Long> {

}


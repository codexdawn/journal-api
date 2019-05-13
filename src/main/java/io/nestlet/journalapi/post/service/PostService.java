package io.nestlet.journalapi.post.service;

import io.nestlet.journalapi.post.domain.Post;

public interface PostService {

    Post getPostById(long id) throws Exception;

    Post savePost(Post post);


}

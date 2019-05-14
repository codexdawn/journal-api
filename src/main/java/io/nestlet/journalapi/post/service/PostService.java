package io.nestlet.journalapi.post.service;

import io.nestlet.journalapi.post.domain.Post;
import io.nestlet.journalapi.post.domain.PostReadRequestDto;

public interface PostService {

    PostReadRequestDto findByPId(long pid) throws Exception;

    Post savePost(Post post);


}

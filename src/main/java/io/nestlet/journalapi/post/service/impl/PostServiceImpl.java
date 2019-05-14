package io.nestlet.journalapi.post.service.impl;

import io.nestlet.journalapi.post.domain.Post;
import io.nestlet.journalapi.post.domain.PostReadRequestDto;
import io.nestlet.journalapi.post.repository.PostRepository;
import io.nestlet.journalapi.post.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostReadRequestDto findByPId(long id) throws RuntimeException {
        return postRepository.findByPId(id).orElseThrow(()->new RuntimeException("not found pid => " + id));
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }
}

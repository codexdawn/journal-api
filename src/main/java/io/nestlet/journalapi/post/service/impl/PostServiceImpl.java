package io.nestlet.journalapi.post.service.impl;

import io.nestlet.journalapi.post.domain.Post;
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
    public Post getPostById(long id) throws Exception {
        return postRepository.findById(id).orElseThrow(() -> new Exception("해당 아이디가 존재하지 않습니다."));
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }
}

package io.nestlet.journalapi.post.controller;

import io.nestlet.journalapi.category.domain.Category;
import io.nestlet.journalapi.member.domain.Member;
import io.nestlet.journalapi.post.domain.Post;
import io.nestlet.journalapi.post.domain.PostReadRequestDto;
import io.nestlet.journalapi.post.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<PostReadRequestDto> findByPId(@PathVariable long id) throws Exception {
        return new ResponseEntity<>(postService.findByPId(id), HttpStatus.OK);
    }


    /**
     * 임시로 저장하는 포스트
     * @return Post
     */
    @PostMapping("/posts/save")
    public Post savePost() {
        Member member = new Member();
        member.setMId(1L);

        Category category = new Category();
        category.setCId(1L);

        Post post = Post.builder().title("[20190514] 생각보다 쉽지않는 Java 와 JPA 의 길! ")
                .contents("JPA를 마스터 해보는것이 어떨지 심각하게 생각해 본다! 정독한번 갈까?")
                .member(member).category(category).build();

        return postService.savePost(post);
    }
}

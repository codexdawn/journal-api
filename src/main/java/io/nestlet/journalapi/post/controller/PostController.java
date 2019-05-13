package io.nestlet.journalapi.post.controller;

import io.nestlet.journalapi.category.domain.Category;
import io.nestlet.journalapi.member.domain.Member;
import io.nestlet.journalapi.post.domain.Post;
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

    @GetMapping("/posts/{pid}")
    public ResponseEntity<Post> getPostByPid(@PathVariable long pid) throws Exception {
        return new ResponseEntity<>(postService.getPostById(pid), HttpStatus.OK);
    }


    /**
     * 임시로 저장하는 포스트
     * @return
     */
    @PostMapping("/posts/save")
    public Post savePost() {
        Member member = new Member();
        member.setMId(1L);

        Category category = new Category();
        category.setCId(1L);

        Post post = Post.builder().title("[20190513] GitHub에 journal-api 업로드한날!")
                .contents("오늘은 Journal-api를 개발한지 얼마안된날 업로드를 하게 되었다! 기분이 너무 좋다!")
                .member(member).category(category).build();

        return postService.savePost(post);
    }
}

package io.nestlet.journalapi.category.controller;

import io.nestlet.journalapi.category.domain.Category;
import io.nestlet.journalapi.category.service.CategoryService;
import io.nestlet.journalapi.member.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/categories/save")
    ResponseEntity<Category> save(@RequestBody Category category) {
        log.info("Category : {}", category);
        /*Member member = new Member();
        member.setMId(1L);

        Category category = new Category();
        category.setName("DailyJournal");
        category.setMember(member);*/

        return new ResponseEntity<>(categoryService.save(category), HttpStatus.CREATED);
    }
}

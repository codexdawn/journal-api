package io.nestlet.journalapi.member.domain;

import io.nestlet.journalapi.category.domain.Category;
import io.nestlet.journalapi.post.domain.Post;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mId;

    private String email;

    private String name;

    private String phone;

    @CreationTimestamp
    private LocalDateTime regDt;

    @UpdateTimestamp
    private LocalDateTime uptDt;

//    @OneToMany(mappedBy = "member")
//    private List<Category> categories = new ArrayList<>();
//
//    @OneToMany(mappedBy = "member")
//    private List<Post> posts = new ArrayList<>();
}

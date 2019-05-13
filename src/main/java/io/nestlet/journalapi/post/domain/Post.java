package io.nestlet.journalapi.post.domain;

import io.nestlet.journalapi.category.domain.Category;
import io.nestlet.journalapi.member.domain.Member;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pId;

    private String title;

    private String contents;

    @CreationTimestamp
    private LocalDateTime regDt;

    @UpdateTimestamp
    private LocalDateTime uptDt;

    @ManyToOne
    @JoinColumn(name = "m_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "c_id")
    private Category category;
}

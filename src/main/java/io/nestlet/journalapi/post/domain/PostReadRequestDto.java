package io.nestlet.journalapi.post.domain;

import lombok.*;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class PostReadRequestDto {
    private final String title;
    private final String contents;
    private final LocalDateTime regDt;
}

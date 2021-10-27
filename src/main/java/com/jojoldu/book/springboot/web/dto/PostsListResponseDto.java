package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entiity){
        this.id = entiity.getId();
        this.title = entiity.getTitle();
        this.author = entiity.getAuthor();
        this.modifiedDate = entiity.getModifiedDate();
    }
}

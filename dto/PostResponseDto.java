package com.sparta.hanghaeboard.dto;


import com.sparta.hanghaeboard.entity.Post;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter

public class PostResponseDto {

    private String username;
    private String content;
    private String title;
    private LocalDateTime modifiedAt;
    private LocalDateTime createdAt;
    private Long id;


    public PostResponseDto(Post post) {
        this.username = post.getUsername();
        this.content = post.getContent();
        this.title = post.getTitle();
        this.createdAt = post.getCreatedAt();
        this. modifiedAt = post.getModifiedAt();
        this.id = post.getId();

    }
}
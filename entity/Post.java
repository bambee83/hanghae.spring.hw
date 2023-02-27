package com.sparta.hanghaeboard.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.hanghaeboard.dto.PostRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor

public class Post extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String content;
    @JsonIgnore
    @Column(nullable = false)
    private String password;


    @Column(nullable = false)
    private String title;


    public Post(PostRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.content = requestDto.getContent();
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
    }

    public void update(PostRequestDto postRequestDto) {
        this.username = postRequestDto.getUsername();
        this.content = postRequestDto.getContent();
        this.title = postRequestDto.getTitle();
        this.password = postRequestDto.getPassword();

    }
}
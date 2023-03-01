package com.sparta.hanghaeboard.dto;

// Dto : Controller > Model 계층으로 data 전송
import lombok.Getter;

@Getter
public class PostRequestDto { //id는 자동으로 생성된다 !
    private String username;
    private String content;
    private String password;
    private String title;

}



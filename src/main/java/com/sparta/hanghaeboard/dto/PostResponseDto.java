package com.sparta.hanghaeboard.dto;

// Dto : Model > Controller 계층으로 data 전송
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

//dto를 한개로 쓴다면 ?? api별로 (스펙이 다름) 만드는 것이 좋다  > 확장 업데시트시 관리하기 용이하다
// 기능별로 나누어서 사용 하는 게 좋다 (한개의 클래스에 너무 많은 기능 부여 x
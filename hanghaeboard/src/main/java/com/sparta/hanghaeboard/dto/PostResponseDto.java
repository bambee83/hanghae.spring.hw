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


    public PostResponseDto(Post post) { ///저도 몰라요...생성자 꼭? //계층간 간섭을 막기 위해서 !!
        this.username = post.getUsername();
        this.content = post.getContent();
        this.title = post.getTitle();
        this.createdAt = post.getCreatedAt();
        this. modifiedAt = post.getModifiedAt();
        this.id = post.getId();

    }
}

//dto를 한개로 쓴다면 ?? api별로 (스펙이 다름) 만드는 것이 좋다  > 확장 업데시트시 관리하기 용이하다
// 기능별로 나누어서 사용 하는 게 좋다 (한개의 클래스에 너무 많은 기능 부여 x)

// controller 계층과 mpdel 계층 사이의 를 이동할때
// 다른 게층을 이용하면 안되므로 2개 필요한게 맞는 거임
// > 통합시 보냈던 데이터를 그대로 반환하는 거임 ...!!


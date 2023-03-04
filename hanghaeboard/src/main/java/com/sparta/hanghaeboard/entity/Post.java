package com.sparta.hanghaeboard.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.hanghaeboard.dto.PostRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*; //임포트들

@Getter
@Entity // jpa > 유저의 테이블을 데이터베이스에 만들어준다 (id, username, content,password 는 database 의 테이블이 된다)
@NoArgsConstructor //기본생성자를 만들어준다, 초기값 세팅이 필요한 final 변수가 있을 경우 컴파일 에러가 발생함,
public class Post extends Timestamped {
    @Id //id가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)  // 생성타입이 자동으로 + type.IDENTIFY 차이  //pk 값이다 !
    private Long id; //id는 long 값으로 받아온다 (필드생성까지!)

    // nullable : null 허용 여부
    // unique : 중복 허용 여부 (false 일때 중복 허용)
    @Column(nullable = false) //컬럼 > 테이블의 열 (cf.row)
    private String username;

    @Column(nullable = false)
    private String content;

    @JsonIgnore // ??
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String title;

    //생성자
    public Post(PostRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.content = requestDto.getContent();
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
    }

    //매소드
    public void update(PostRequestDto postRequestDto) {
        this.username = postRequestDto.getUsername();
        this.content = postRequestDto.getContent();
        this.title = postRequestDto.getTitle();
        this.password = postRequestDto.getPassword();

    }
}
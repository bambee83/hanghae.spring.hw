package com.sparta.hanghaeboard.repository;

//Model 계층
import com.sparta.hanghaeboard.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

//  JpaRepository<Post, Long>  > @Entity의 테이블과 통신할 수 있다.
//jpa repo의 상속을 받는 Post repo 인터페이스, <Type, id > : 어떤 테이블과 연결하는지
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByModifiedAtDesc();
}


// @Repository 붙여주어야 하나?
// @Repository > 이 자바 객체가 서비스 역할을 하는 객체라는 것을 알려주는 어노테이션 입니다!**

//**#2 : 사실 리포지토리는 상당히 다양한 기술과 얽혀 있고 다양한 케이스가 있어 예시 코드를 보여드리기는 조금 어려운 것 같기도 합니다.
// 그중 우리가 직접 사용하게 될 SpringDataJpa 의 JpaRepository**
// public interface ContentRepository extends JpaRepository<Content, Long> {
//  }


//  IOC, DI 등 설계 철학
// private final ContentService contentService;
// private final ContentRepository contentRepository;
// 분명 해당 객체의 메서드도 호출하고 있는데, 해당 객체는 어디서 어떻게 들어와있을까요?

// Spring Data JPA 는? 스프링에서 jpa 를 편리하게 사용하기 위해서  JPA 를 wrapping 한 dependency 라고 생각하자
// 즉 반복가능한 코드들을 Spring Data JPA 가 대신 작성해준다.
// Repostiory 인터페이스만 작성하면, 필요한 구현은 스프링이 대신 알아서 척척!
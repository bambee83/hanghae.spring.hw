package com.sparta.hanghaeboard.entity;

// 상속을 이용하여 생성/수정시간을 관리한다
    // entity를 만들 때 객체인 Timestamped를 만들어 "extends Timestamped " 로 해당 객체를 상속받는다
    // 상속받는 entity 객체는 항상 @CreatedDate, @LastModifiedDate 칼럼들을 가지게 된다.
    // 즉 상속받는 객체들은 자동으로 수정/생성시간을 데이터베이스에 연결하고 필요시마다 해당 값을 편하게 get 하게 된다.
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 기능을 사용하기 위한 애노테이션으로 이해하자
@EntityListeners(AuditingEntityListener.class)  // 기능을 사용하기 위한 애노테이션으로 이해하자, 상품 Enitity 선언 ? @Entity가 포함된건가...?
// Spring Data JPA > 상품 Repository 생성
public class Timestamped {
    @CreatedDate
    private LocalDateTime createdAt; //데이터의 생성
    @LastModifiedDate
    private LocalDateTime modifiedAt; //데이터의 수정
} //이걸 왜 만든거죠...? 없어도된다 !!왠만하면 필요한 기능이다 ...! 걍 넣자 .....



// Enttity 는 가능하면 깨끗하게 의존성을 두지말고 생성해야 한다.
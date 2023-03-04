package com.sparta.hanghaeboard.controller;

//컨트롤러 계층을 통해 데이터(요청)를 수신한다
    //@RequestParam, @PathVariable, @RequestBody <jason 데이터를 컨드롤할때 주로 쓰이는 애노테이션(@)들
// request 의 방식(param, query, body) + CRUD(Create, Read, Update, Delete)기능/메소드(get, post, put, patch, delete 등)
    // @RequestParam : 클라이언트가 요청한 URL 의 쿼리 파라미터에 대한 값을 받아온다
    //@RequestParam > localhost:8080/course/update ? id =2 (쿼리방식) > ?뒤는 url 에 가져다 붙이는 거임
    // ex. (@RequestParam Long id, @RequestParam String query, Course course)
    //@RequestBody > 요청하는 body 내부에 있는 jason 타입의 형식을 변환(파싱)해서 넣어주라는 의미
    // 뷰까지 같이 반환하느냐, 혹은 JSON 형식으로 데이터만 반환하느냐의 차이
    //@PathVariable > {id}같은거, url 에서 /기준으로 값을 끊어서 가지고 옴 ,자동으로 일치하는 변수값을 메서드 호출되는 시점에 같이 넘겨줍니다
    //@RequestBody :  http 요청의 본문(body)이 그대로 전달된다
    //xml 이나 json 기반의 메시지를 사용하는 요청의 경우에 이 방법이 매우 유용하다.
    //HTTP 요청의 바디내용을 통째로 자바객체로 변환해서 매핑된 메소드 파라미터로 전달해준다.

// restfull 한 Api 란 ?
import com.sparta.hanghaeboard.dto.PostRequestDto;
import com.sparta.hanghaeboard.dto.PostResponseDto;
import com.sparta.hanghaeboard.service.PostService;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;      //이런저런임포트들


@RestController  // @Controller > 스프링이 Controller(유저의 요청을 수신하는 객체)로 인식 + jason 타입으로 반환
                //  responsebody (jason 타입(key:value)으로 반환하기 위한 애노테이션) + controller
@RequiredArgsConstructor //생성자만들어주는것 / autowired 사용없이 의존성 주입 가능
                        // final 이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
public class PostController {
    private final PostService postService;  //Model 계층의 service 를 이용하기 위한 선언
// 1. 사용자는 데이터를 보낸다 (Controller 게층)
// 2. 필요한 데이터를 받아서 postTable 에 저장할거에요
// 3. PostRequestDto 는 사용자가 보낸 데이터를 Model 계층(Service)으로 보내요

    //게시글 작성
    @PostMapping("/api/posts") //PostRequestDto 는 Post 의 내용을 값으로 가지고 있다
    public PostResponseDto createPost(@RequestBody PostRequestDto requestDto) {
        return postService.createPost(requestDto);} //계층이 다르기 때문에 어떤 계층에도 속하지 않은 requestDto 를 이용한다
    //전체 게시글 목록 조회
    @GetMapping("/api/posts") // > 데이터를 받아올 게 없음 (get 방식)
    public List<PostResponseDto> getListPosts() {
        return postService.getListPosts();
    } //자바컬랙션 <리스트부분> 공부해보세요
    //선택 게시글 조회 (게시글의 id를 특정하여 받아온다)
    @GetMapping("/api/posts/{id}")
    public PostResponseDto getPosts(@PathVariable Long id) {
        return postService.getPost(id);
    }
    //선택 게시글 수정 > id와 수정될 정보를 받아온다
    @PutMapping("/api/posts/{id}")
    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.update(id, requestDto);
    }
    //선택 게시글 삭제
    @DeleteMapping("/api/posts/{id}")
    public Map<String,Object> deletePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.deletePost(id, requestDto); // 자바컬랙션 <Map>
    }
}



//@PostMapping, @GetMapping, @PutMapping, @DeleteMapping > 톰캣과 서블릿의 기술을 이용하여 url 과 method 를 자동으로 파싱해서 클래스에 매칭
// 즉 특정요청에 호출될 메서드를 지정해주는 애노테이션이다 !

//@Getter,@Setter //getter,setter 자동으로 만들어주는 애노테이션 (롬복)

//@RequestMapping("/") > localhost8080/으로 들어오는 요청송수신
// @RequestMapping("/course")
// @GetMapping("/{id}") > localhost:8080/course/2
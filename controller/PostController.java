package com.sparta.hanghaeboard.controller;

import com.sparta.hanghaeboard.dto.PostRequestDto;
import com.sparta.hanghaeboard.dto.PostResponseDto;
import com.sparta.hanghaeboard.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;


    @PostMapping("/api/posts")
    public PostResponseDto createPost(@RequestBody PostRequestDto requestDto) {
        return postService.createPost(requestDto);
    }

    @GetMapping("/api/posts")
    public List<PostResponseDto> getListPosts() {
        return postService.getListPosts();
    }

    @GetMapping("/api/posts/{id}")
    public PostResponseDto getPosts(@PathVariable Long id) {
        return postService.getPost(id);
    }

    @PutMapping("/api/posts/{id}")
    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.update(id, requestDto);
    }

    @DeleteMapping("/api/posts/{id}")
    public Map<String,Object> deletePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.deletePost(id, requestDto);
    }
}
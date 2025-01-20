package com.duclan.post.repository.httpclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.duclan.post.dto.ApiResponse;
import com.duclan.post.dto.response.UserProfileRes;

@FeignClient(name = "profile-service", url = "http://localhost:8081/profile")
public interface ProfileClient {
    @GetMapping("/internal/users/{userId}")
    public ApiResponse<UserProfileRes> getProfile(@PathVariable String userId);

}

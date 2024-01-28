package com.project.webblog.user.controller;

import com.project.webblog.common.exception.ApiResponse;
import com.project.webblog.user.dto.SignupRequestDto;
import com.project.webblog.user.dto.UserResponseDto;
import com.project.webblog.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/signup")
    public ModelAndView mainPage() {
        return new ModelAndView("signup");
    }

    @PostMapping("/signup")
    @Operation(summary = "회원가입")
    public ResponseEntity<ApiResponse> signup(SignupRequestDto requestDto) {
        return userService.signup(requestDto);
    }
}

package com.project.webblog.post.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardResponseDto {
    private Long id;
    private String title;
    private String contents;
}

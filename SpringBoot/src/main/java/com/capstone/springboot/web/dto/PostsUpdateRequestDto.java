package com.capstone.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
/*    public PostsUpdateRequestDto(Posts entity){
        this.title = entity.getTitle();
        this.content = entity.getContent();
    }
}*/

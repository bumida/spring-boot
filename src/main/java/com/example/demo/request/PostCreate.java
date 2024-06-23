package com.example.demo.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class PostCreate {
    @NotBlank
    private String title;
    private String content;
}

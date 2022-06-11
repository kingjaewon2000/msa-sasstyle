package com.sasstyle.userservice.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Schema(description = "로그인 요청 DTO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

    @Schema(description = "아이디", example = "sasstyle", required = true)
    private String username;

    @Schema(description = "비밀번호", example = "test1234!", required = true)
    private String password;
}

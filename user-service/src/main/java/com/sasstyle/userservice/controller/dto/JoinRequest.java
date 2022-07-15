package com.sasstyle.userservice.controller.dto;

import com.sasstyle.userservice.entity.Gender;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Schema(description = "회원가입 요청 DTO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JoinRequest {

    @NotBlank(message = "프로필 이미지 주소를 입력해 주세요.")
    @Schema(description = "프로필 이미지", example = "https://picsum.photos/seed/picsum/200/300", required = true)
    private String profileUrl;

    @NotNull(message = "아이디를 입력해 주세요.")
    @Pattern(regexp = "^[A-Za-z0-9]{4,12}$", message = "아이디는 4~12자리로 입력해주세요.")
    @Schema(description = "아이디", example = "sasstyle", required = true)
    private String username;

    @NotNull(message = "비밀번호를 입력해 주세요.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,13}$",
            message = "비밀번호는 8자리 이상 13자리 이하여야 하며 숫자와 특수문자를 한 자리 이상 반드시 포함해야 합니다.")
    @Schema(description = "비밀번호", example = "test1234!", required = true)
    private String password;

    @NotNull(message = "이름을 입력해 주세요.")
    @Pattern(regexp = "^[ㄱ-ㅎ|가-힣|a-z|A-Z|0-9|]{2,10}$",
            message = "이름은 2자리 이상 6자리 이하여야 하며 특수문자는 입력할 수 없습니다.")
    @Schema(description = "이름", example = "이순신", required = true)
    private String name;

    @NotNull(message = "성별를 선택해 주세요.")
    @Schema(description = "성별", example = "MAN", required = true)
    private Gender gender;

    @NotNull(message = "이메일을 입력해 주세요.")
    @Email(message = "이메일이 형식이 유효하지 않습니다.")
    @Schema(description = "이메일", example = "lee@example.com", required = true)
    private String email;

    @NotNull(message = "전화번호를 입력해 주세요.")
    @Pattern(regexp = "^01([0|1|6|7|8|9])-([0-9]{3,4})-([0-9]{4})$", message = "전화번호 형식이 유효하지 않습니다.")
    @Schema(description = "전화번호", example = "010-1234-5678", required = true)
    private String phoneNumber;

    @NotNull(message = "주소를 입력해 주세요.")
    @Schema(description = "주소", example = "서울시 어딘가...", required = true)
    private String address;

    @NotNull(message = "권한을 입력해 주세요.")
    @Schema(description = "권한", example = "BRAND", required = true)
    private RoleRequest role;
}

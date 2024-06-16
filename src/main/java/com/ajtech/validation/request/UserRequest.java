package com.ajtech.validation.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;


@Data
@Setter
@Getter
@AllArgsConstructor
public class UserRequest {

    @NotNull
    private String name;

    @Email(message = "invalid email address")
    private String email;

    @NotNull
    private String gender;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String nationality;
}

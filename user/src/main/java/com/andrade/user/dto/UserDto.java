package com.andrade.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

@Builder
public record UserDto(
        @NotBlank(message = "Name cannot be blank") @NotEmpty(message = "Name cannot be empty") String name,
        @Positive(message = "Negative age invalid") @Max(100) int age,
        @Email String email) {

}

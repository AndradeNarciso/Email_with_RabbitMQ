package com.andrade.email.dto;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record EmailDto(
        @NotBlank @NotEmpty UUID id,
        String subject,
        String body) {

}

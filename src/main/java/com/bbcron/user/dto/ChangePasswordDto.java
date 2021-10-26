package com.bbcron.user.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ChangePasswordDto {

  @NotBlank @NotNull private String oldPassword;

  @NotBlank @NotNull private String newPassword;
}

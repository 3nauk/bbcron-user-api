package com.bbcron.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileDto {

  /** First name */
  private String firstName;

  /** Second Name */
  private String secondName;

  /** Avatar URL inside into BBCron */
  private String avatar;
}

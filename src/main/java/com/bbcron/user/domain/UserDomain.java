package com.bbcron.user.domain;

import com.bbcron.user.util.UserStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.time.Instant;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
@JsonPropertyOrder({"userId", "email", "username"})
public class UserDomain implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * User Id
   */
  @Id
  private String userId;

  /**
   * User email
   */
  private String email;
  /**
   * User Name
   */
  private String username;

  /**
   * TimeZone User
   */
  @Builder.Default
  private int timezone = 1;

  /**
   * Password
   */
  @NotBlank
  @NotNull
  private String password;

  /**
   * First Name
   */
  private String firstName;

  /**
   * Second Name
   */
  private String secondName;

  /**
   * User Status {@link UserStatus}
   */
  @Builder.Default
  private UserStatus status = UserStatus.active;

  /**
   * Creation date
   */
  @Builder.Default
  private Instant creation_time = Instant.now();

  /***
   * Update Date
   */
  @Builder.Default
  private Instant update_time = Instant.now();

  /**
   * Date to Deletion Account
   */
  private Instant deletion_time;

  @Builder.Default
  private boolean isRoot = false;

  @Builder.Default
  private int authType = 1;

  @Builder.Default
  private int typeAccount = 1;

  private String billingCompanyName;

  private String billingContactName;

  private String billingVatNumber;

  private String billingAddress;

  private String billingEmailAddress;

  @Builder.Default
  private int flavour = 1;

}

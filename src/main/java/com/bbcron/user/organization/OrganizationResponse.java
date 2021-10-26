package com.bbcron.user.organization;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationResponse extends RepresentationModel<OrganizationResponse> {

  /** Organization Id */
  @NotBlank
  private String id;

  /** Organization Name */
  @NotBlank
  private String name;
}

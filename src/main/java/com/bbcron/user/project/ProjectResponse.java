package com.bbcron.user.project;

import java.util.UUID;
import org.springframework.hateoas.EntityModel;

public class ProjectResponse extends EntityModel<ProjectResponse> {

  private UUID id;
  private String name;

}
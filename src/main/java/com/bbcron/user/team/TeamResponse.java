package com.bbcron.user.team;

import java.util.UUID;
import org.springframework.hateoas.EntityModel;

//TODO: LLevar a una clase principal de una librería común el uuid y el uniqueName
public class TeamResponse extends EntityModel<TeamResponse> {

  private UUID id;
  private String name;

}

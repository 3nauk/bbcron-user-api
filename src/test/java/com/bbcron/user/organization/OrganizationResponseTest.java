package com.bbcron.user.organization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import javax.validation.Validation;
import javax.validation.Validator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class OrganizationResponseTest {

  @org.junit.jupiter.api.BeforeEach
  void setUp() {}

  @org.junit.jupiter.api.AfterEach
  void tearDown() {}

  @org.junit.jupiter.api.Test
  void getId() {
    OrganizationResponse response = OrganizationResponse.builder().id("organizationId").name("organizationName").build();
    assertNotNull(response);
    assertTrue(response.getId().equals("organizationId"));
  }

  @org.junit.jupiter.api.Test
  void getName() {
    OrganizationResponse response = OrganizationResponse.builder().id("organizationId").name("organizationName").build();
    assertNotNull(response);
    assertTrue(response.getName().equals("organizationName"));

  }

  @org.junit.jupiter.api.Test
  void build_with_null() {
    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
    Set violations = validator.validate(OrganizationResponse.builder().build());
    assertFalse(violations.isEmpty());

  }
  @org.junit.jupiter.api.Test
  void testEquals() {

  }

  @org.junit.jupiter.api.Test
  void testToString() {
    OrganizationResponse response = OrganizationResponse.builder().id("organizationId").name("organizationName").build();
    assertEquals("OrganizationResponse(id=organizationId, name=organizationName)", response.toString());
  }
}

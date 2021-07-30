package com.sample.spring.basic.data.jpa.user.entity;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String userid;
  private String name;
  private String birth; // yyyyMMdd
  private String password; // TODO: hmac256
  private LocalDateTime since;
  private LocalDateTime dateOfModification;

  @Override
  public String toString() {
    return "User{"
        + "id="
        + id
        + ", userid='"
        + userid
        + '\''
        + ", name='"
        + name
        + '\''
        + ", birth='"
        + birth
        + '\''
        + ", password='"
        + password
        + '\''
        + ", since="
        + since
        + ", dateOfModification="
        + dateOfModification
        + '}';
  }
}

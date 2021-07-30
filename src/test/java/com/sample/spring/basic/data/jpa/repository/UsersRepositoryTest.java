package com.sample.spring.basic.data.jpa.repository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.sample.spring.basic.data.jpa.user.entity.User;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsersRepositoryTest {

  @Autowired
  UsersRepository usersRepository;

  @Test
  void findBySince() {
    User users = usersRepository.findById(1L);
    // assertj
    assertThat(users).isNotNull();
    // junit5
    assertNotNull(users);
  }

  @Test
  void findById() {
  }
}
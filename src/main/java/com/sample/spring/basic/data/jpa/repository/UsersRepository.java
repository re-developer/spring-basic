package com.sample.spring.basic.data.jpa.repository;

import com.sample.spring.basic.data.jpa.user.entity.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

// cf. https://spring.io/guides/gs/accessing-data-jpa/
public interface UsersRepository  extends CrudRepository<User, Long> {

  List<User> findBySince(final String since);

  User findById(final long id);


}

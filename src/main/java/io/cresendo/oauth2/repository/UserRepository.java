package io.cresendo.oauth2.repository;

import io.cresendo.oauth2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

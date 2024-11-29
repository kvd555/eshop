package ru.ystu.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ystu.eshop.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByEmail(String email);
    boolean existsByEmail(String email);
}

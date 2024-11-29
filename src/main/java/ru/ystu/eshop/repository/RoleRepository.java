package ru.ystu.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ystu.eshop.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}

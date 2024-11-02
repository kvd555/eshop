package ru.ystu.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ystu.eshop.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

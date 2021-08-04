package pl.coderslab.charity.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.domain.model.Category;

import java.util.LinkedList;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    LinkedList<Category> findAll();
}

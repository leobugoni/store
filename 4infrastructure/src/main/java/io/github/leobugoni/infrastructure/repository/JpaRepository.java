package io.github.leobugoni.infrastructure.repository;

import io.github.leobugoni.entities.model.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Configuration
public interface JpaRepository extends CrudRepository<Product, Long> {

}

package io.github.leobugoni.infrasctructure.repository;

import io.github.leobugoni.entities.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepository extends CrudRepository<Product, Long> {

}

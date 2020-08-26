package io.github.leobugoni.entities.model;

public interface ProductRepository {

    Product saveProduct(Product product);

    Product findProduct(Long id);

    Product updateProduct(Product product);

}

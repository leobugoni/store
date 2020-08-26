package io.github.leobugoni.infrastructure.repository;

import io.github.leobugoni.entities.model.Product;
import io.github.leobugoni.entities.model.ProductRepository;
import io.github.leobugoni.infrastructure.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Repository
@Configuration
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private JpaRepository repository;

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product findProduct(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}

package io.github.leobugoni.usecases.impl;

import io.github.leobugoni.entities.model.Product;
import io.github.leobugoni.entities.model.ProductRepository;
import io.github.leobugoni.usecases.SaveProduct;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SaveProductImpl implements SaveProduct {

    private ProductRepository productRepository;

    @Inject
    public SaveProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product execute(Product product) {
        return productRepository.saveProduct(product);
    }
}

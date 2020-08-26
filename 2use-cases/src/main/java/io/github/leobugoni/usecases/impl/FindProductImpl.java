package io.github.leobugoni.usecases.impl;

import io.github.leobugoni.entities.model.ProductRepository;
import io.github.leobugoni.usecases.FindProduct;
import io.github.leobugoni.usecases.response.ProductResonse;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class FindProductImpl implements FindProduct {

    private ProductRepository productRepository;

    @Inject
    public FindProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductResonse execute(Long id) {
        return ProductResonse.fromEntity(productRepository.findProduct(id));
    }
}

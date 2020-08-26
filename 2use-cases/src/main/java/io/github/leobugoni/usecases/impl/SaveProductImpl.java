package io.github.leobugoni.usecases.impl;

import io.github.leobugoni.entities.model.ProductRepository;
import io.github.leobugoni.usecases.SaveProduct;
import io.github.leobugoni.usecases.request.ProductRequest;
import io.github.leobugoni.usecases.response.ProductResonse;

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
    public ProductResonse execute(ProductRequest productRequest) {
        return ProductResonse.fromEntity(productRepository.saveProduct(productRequest.toEntity()));
    }
}

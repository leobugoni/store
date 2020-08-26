package io.github.leobugoni.usecases.impl;

import io.github.leobugoni.entities.model.ProductRepository;
import io.github.leobugoni.usecases.DeleteProduct;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class DeleteProductImpl implements DeleteProduct {

    private ProductRepository productRepository;

    @Inject
    public DeleteProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void execute(Long id) {
        productRepository.deleteProduct(id);
    }
}

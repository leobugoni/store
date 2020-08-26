package io.github.leobugoni.usecases.impl;

import io.github.leobugoni.entities.model.Product;
import io.github.leobugoni.entities.model.ProductRepository;
import io.github.leobugoni.usecases.UpdateProduct;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UpdateProductImpl implements UpdateProduct {

    private ProductRepository productRepository;

    @Inject
    public UpdateProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product execute(Long id, Product newProduct) {
        Product product = productRepository.findProduct(id);
        product.setDescription(newProduct.getDescription());
        product.setName(newProduct.getName());
        product.setQuantity(newProduct.getQuantity());
        return productRepository.saveProduct(product);
    }
}

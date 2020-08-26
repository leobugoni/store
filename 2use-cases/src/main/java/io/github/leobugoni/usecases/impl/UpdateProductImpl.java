package io.github.leobugoni.usecases.impl;

import io.github.leobugoni.entities.model.Product;
import io.github.leobugoni.entities.model.ProductRepository;
import io.github.leobugoni.usecases.UpdateProduct;
import io.github.leobugoni.usecases.request.ProductRequest;
import io.github.leobugoni.usecases.response.ProductResonse;

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
    public ProductResonse execute(Long id, ProductRequest productRequest) {
        Product product = productRepository.findProduct(id);
        product.setDescription(productRequest.getDescription());
        product.setName(productRequest.getName());
        product.setQuantity(productRequest.getQuantity());
        return ProductResonse.fromEntity(productRepository.saveProduct(product));
    }
}

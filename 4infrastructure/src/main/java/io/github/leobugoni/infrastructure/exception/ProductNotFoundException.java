package io.github.leobugoni.infrastructure.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(Long id) {
        super(String.format("Product id: %s not found", id.toString()));
    }
}

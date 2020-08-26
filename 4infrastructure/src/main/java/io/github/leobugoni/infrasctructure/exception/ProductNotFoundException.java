package io.github.leobugoni.infrasctructure.exception;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(Long id) {
        super(String.format("Product id: %s not found", id.toString()));
    }
}

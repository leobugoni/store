package io.github.leobugoni.usecases;

import io.github.leobugoni.entities.model.Product;

public interface UpdateProduct {

    Product execute(Long id, Product product);

}

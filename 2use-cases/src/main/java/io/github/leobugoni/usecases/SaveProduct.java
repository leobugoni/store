package io.github.leobugoni.usecases;

import io.github.leobugoni.entities.model.Product;

public interface SaveProduct {

    Product execute(Product product);

}

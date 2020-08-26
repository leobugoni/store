package io.github.leobugoni.usecases;

import io.github.leobugoni.entities.model.Product;

public interface FindProduct {

    Product execute(Long id);

}

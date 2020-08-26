package io.github.leobugoni.usecases;

import io.github.leobugoni.usecases.response.ProductResonse;

public interface FindProduct {

    ProductResonse execute(Long id);

}

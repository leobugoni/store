package io.github.leobugoni.usecases;

import io.github.leobugoni.usecases.request.ProductRequest;
import io.github.leobugoni.usecases.response.ProductResonse;

public interface UpdateProduct {

    ProductResonse execute(Long id, ProductRequest productRequest);

}

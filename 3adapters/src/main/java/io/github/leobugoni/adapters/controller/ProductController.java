package io.github.leobugoni.adapters.controller;


import io.github.leobugoni.usecases.SaveProduct;
import io.github.leobugoni.usecases.request.ProductRequest;
import io.github.leobugoni.usecases.response.ProductResonse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private SaveProduct saveProduct;

    @PostMapping
    public ProductResonse saveProduct(@RequestBody ProductRequest productRequest){
        return saveProduct.execute(productRequest);

    }
}

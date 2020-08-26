package io.github.leobugoni.adapters.controller;


import io.github.leobugoni.usecases.DeleteProduct;
import io.github.leobugoni.usecases.FindProduct;
import io.github.leobugoni.usecases.SaveProduct;
import io.github.leobugoni.usecases.UpdateProduct;
import io.github.leobugoni.usecases.request.ProductRequest;
import io.github.leobugoni.usecases.response.ProductResonse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private SaveProduct saveProduct;
    private UpdateProduct updateProduct;
    private FindProduct findProduct;
    private DeleteProduct deleteProduct;

    public ProductController(SaveProduct saveProduct, UpdateProduct updateProduct, FindProduct findProduct, DeleteProduct deleteProduct) {
        this.saveProduct = saveProduct;
        this.updateProduct = updateProduct;
        this.findProduct = findProduct;
        this.deleteProduct = deleteProduct;
    }

    @PostMapping
    public ProductResonse saveProduct(@RequestBody ProductRequest productRequest){
        return saveProduct.execute(productRequest);
    }

    @PutMapping(path = "/{id}")
    public ProductResonse updateProduct(@PathVariable Long id, @RequestBody ProductRequest productRequest){
        return updateProduct.execute(id, productRequest);
    }

    @GetMapping(path = "/{id}")
    public ProductResonse findProduct(@PathVariable Long id){
        return findProduct.execute(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProduct(@PathVariable Long id){
        deleteProduct.execute(id);
    }
}

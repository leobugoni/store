package io.github.leobugoni.adapters.controller;


import io.github.leobugoni.entities.model.Product;
import io.github.leobugoni.usecases.DeleteProduct;
import io.github.leobugoni.usecases.FindProduct;
import io.github.leobugoni.usecases.SaveProduct;
import io.github.leobugoni.usecases.UpdateProduct;
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
    public Product saveProduct(@RequestBody Product product){
        return saveProduct.execute(product);
    }

    @PutMapping(path = "/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return updateProduct.execute(id, product);
    }

    @GetMapping(path = "/{id}")
    public Product findProduct(@PathVariable Long id){
        return findProduct.execute(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProduct(@PathVariable Long id){
        deleteProduct.execute(id);
    }
}

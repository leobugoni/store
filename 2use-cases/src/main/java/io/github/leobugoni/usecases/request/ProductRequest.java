package io.github.leobugoni.usecases.request;

import io.github.leobugoni.entities.model.Product;
import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {

    private String name;
    private String description;
    private Integer quantity;

    public Product toEntity(){
        return new Product(this.name, this.description, this.quantity);
    }
}

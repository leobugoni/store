package io.github.leobugoni.usecases.response;

import io.github.leobugoni.entities.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductResonse {

    private String name;
    private String description;
    private Integer quantity;

    public static ProductResonse fromEntity(Product product){
        return new ProductResonse(product.getName(), product.getDescription(), product.getQuantity());
    }
}

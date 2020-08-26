package io.github.leobugoni.entities.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy= AUTO)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String description;

    @NonNull
    private Integer quantity;
}

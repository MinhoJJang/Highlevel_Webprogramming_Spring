package gcu.backend.productservice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Product implements Serializable {
    private Long id;
    private String productname;
    private Integer price;
}

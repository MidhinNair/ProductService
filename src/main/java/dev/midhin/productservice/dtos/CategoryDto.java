package dev.midhin.productservice.dtos;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryDto {
    private String name;

    private List<dev.midhin.productservice.dtos.ProductDto> products;

}

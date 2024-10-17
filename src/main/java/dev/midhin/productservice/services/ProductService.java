package dev.midhin.productservice.services;

import dev.midhin.productservice.dtos.GenericProductDto;
import dev.midhin.productservice.exceptions.NotFoundException;
import dev.midhin.productservice.security.JwtObject;

import java.util.List;

public interface ProductService {

    GenericProductDto createProduct(GenericProductDto product);

    GenericProductDto getProductById(Long id) throws NotFoundException;

    List<GenericProductDto> getAllProducts();

   GenericProductDto deleteProduct(Long id);
}

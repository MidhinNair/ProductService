package dev.midhin.productservice.dtos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Role  {
    private Long id;
    private String role;
}

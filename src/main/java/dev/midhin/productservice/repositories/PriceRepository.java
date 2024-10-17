package dev.midhin.productservice.repositories;

import dev.midhin.productservice.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository
extends JpaRepository<Price, Long> {
}

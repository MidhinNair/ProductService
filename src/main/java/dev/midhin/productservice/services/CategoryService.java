package dev.midhin.productservice.services;

import dev.midhin.productservice.models.Category;

import java.util.List;

public interface CategoryService {
    Category getCategory(String uuid);
    List<String> getProductTitles(List<String> categoryUUIDs);
}

package dev.midhin.productservice.repositories;

public interface CustomQueries {
    String FIND_ALL_BY_TITLE = "select * from product join product_orders " +
            "on product.id = product_orders.product_id where title = :midhin";
}

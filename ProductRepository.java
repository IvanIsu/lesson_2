package com.isupov.spring.test_lesson_2;

import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productRepository;

    public ProductRepository(List<Product> productRepository) {
        this.productRepository = productRepository;
    }


public void init(){
    productRepository.add(new Product(1, "Glue", 10.0));
    productRepository.add(new Product(2, "Lemon Tree", 25.0));
    productRepository.add(new Product(3, "Table", 22.0));
    productRepository.add(new Product(4, "Apple", 5.0));
    productRepository.add(new Product(5, "Orange", 6.0));
}

    public void addProductInRepository(Product product){
        productRepository.add(product);
    }

    public Product findProductId(int id) {
        for (Product o : productRepository) {
            if (o.getId() == id) {
                return o;
            }
        }
        return null;
    }

    public void showAllProduct() {
        for (Product o : productRepository) {
            System.out.println( o.print());
        }
    }
}

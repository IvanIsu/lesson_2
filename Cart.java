package com.isupov.spring.test_lesson_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
   private List<Product> productList;

    public Cart(){
        productList = new ArrayList<>();
    }

    public void addToCart(Product product){
        productList.add(product);
    }
    public boolean deleteFromCart(int id){
        for (Product o: productList) {
            if(id == o.getId()){
                productList.remove(o);
                return true;
            }
        }
        return false;
    }
    public void showCart(){
        for (Product o: productList) {
            System.out.println(o.print());
        }
    }
}

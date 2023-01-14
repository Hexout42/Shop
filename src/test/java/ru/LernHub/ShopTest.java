package ru.LernHub;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.TestInstance;


import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShopTest {
    Shop shop;
   HashMap<Integer,Product> all;
   Product product;
   Product product1 ;
   Product product2 ;

    @BeforeAll
    public  void initTest(){
        shop = new Shop();
        all = new HashMap<>();
        product = new Product("Soap",34.5,3);
        product1 = new Product("Soap",34.5,7);
        product2 = new Product("IceCream",23,4);

    }

    @Test
    void checkHash() {
        shop.checkHash(all,product);
        shop.checkHash(all,product1);
        shop.checkHash(all,product2);
        assertEquals(all.get(product.hashCode()).getQuantity(),10);

    }



}
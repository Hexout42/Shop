package ru.LernHub;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ProductTest  {
    Product product ;
   Product product2 ;
    Product product3 ;


    @BeforeAll
  public void initTest (){
        System.out.println("Before");
        product = new Product("Cost",34.5,4);
        product2 = new Product(null,34.5,4);
        product3 = new Product("Cost",34.5,4);
    }

    @Test
    void testEquals() {

        assertTrue(product.equals(product3));
        assertFalse(product.equals(product2));

    }

    @Test
    void testHashCode() {

        assertEquals(34,product2.hashCode());
        assertEquals(34+product.getName().hashCode(),product.hashCode());
    }

    @Test
    void testToString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name product =" + product.getName() + " Cost =" + product.getCost() + " Quantity =" +product.getQuantity());
        assertTrue(product.toString().equals(builder.toString()));
    }

}
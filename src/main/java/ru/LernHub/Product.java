package ru.LernHub;

public class Product {
    private String name;
    private double cost;
    private int quantity;


    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }
    public int getQuantity(){
        return quantity;
    }
    public Product(String name,double cost,int quantity){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product){
            Product prod = (Product) obj;
            return  name.equals(prod.name) && cost == prod.cost && quantity == prod.quantity;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int code = name == null? 0:name.hashCode();
        code += cost;
        return code;
    }
    public String toString(){
        return "Name product =" + getName() + " Cost =" + getCost() + " Quantity =" +getQuantity();
    }
}

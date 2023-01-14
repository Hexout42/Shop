package ru.LernHub;
import java.util.HashMap;
import java.util.Scanner;
public class Shop  {
    Scanner scanner =new Scanner(System.in);
    HashMap<Integer,Product> hash = new HashMap<>();
    public void startShop(){
        int in;
        do {
            System.out.println("\n" +"____МЕНЮ____"+"\n"+ "1.Добавить товар"+ "\n"+"2. вывести все товары"+ "\n"+"3. Выход");
            in =scanner.nextInt();
            if (in== 1){
                setProduct();
                continue;
            }
            if (in == 2){
                getShop();
                continue;
            }
            if (in == 3){
                scanner.close();
                break;
            }
        }
        while (true);
    }
    public void setProduct()  {
        System.out.println("Input name:");
        String name = scanner.next();
        System.out.println("Input cost:");
        double cost = Double.parseDouble(scanner.next());
        System.out.println("Input quantity:");
        int quantity = scanner.nextInt();
        checkHash(hash,new Product(name,cost,quantity));
    }
    public void checkHash(HashMap<Integer,Product> hasher,Product product){

        if( hasher.containsKey(product.hashCode())){
            Product product1;
            product1 = hasher.get(product.hashCode());
            hasher.put(product.hashCode(),new Product(product.getName(), product.getCost(), product.getQuantity() + product1.getQuantity()));
        }
        else{ hasher.put(product.hashCode(),product);}
    }



    public  void getShop(){
        for(Object value:hash.values()){
            System.out.println(value);}
    }
}
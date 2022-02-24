/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import cart.Cart;
import cashier.Cashier;
import java.util.Date;
import product.Appliance;
import product.Beverage;
import product.Clothes;
import product.Food;
import product.Size;

/**
 *
 * @author nikol
 */
public class Main {

    public static void main(String[] args) {
        
        Food apple= new Food();
        apple.setName("Apples");
        apple.setBrand("BrandA");
        apple.setPrice(1.5);
        apple.setExpirationDate("2021-06-14");
        
        Beverage milk = new Beverage();
        milk.setName("Milk");
        milk.setBrand("BrandM");
        milk.setPrice(0.99);
        milk.setExpirationDate("2022-02-02");
        
        Clothes shirt =new Clothes();
        shirt.setName("T-shirt");
        shirt.setPrice(15.99);
        shirt.setBrand("BrandT");
        shirt.setSize(Size.M);
        shirt.setColor("violet");
        
        Appliance laptop=new Appliance();
        laptop.setName("Laptop");
        laptop.setBrand("BrandL");
        laptop.setPrice(2345);
        laptop.setModel("ModelL");
        laptop.setProductionDate("2021-03-03");
        laptop.setWeight(1.25);
        
        Cart cart=new Cart();
        cart.add(apple,2.45);//adding object apple to cart and setting its quantity=2.45
        cart.add(milk,3);// adding object milk to cart and setting its quantity=3
        cart.add(shirt,2);// adding object shirt to cart and setting its quantity=2
        cart.add(laptop,1);// adding object laptop to cart and setting its quantity=1
        
        
        cart.printCart();// this method prints items in cart, i used it to check the receipt
        
        Cashier cashier = new Cashier();
        cashier.printReceipt(cart.getCart(), new Date());//printing receipt
        
        
    }
    
}

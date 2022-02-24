/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.text.DecimalFormat;
import java.time.LocalDate;


/**
 *
 * @author nikol
 */
public  class Product {
    
    private String name;
    private String brand;
    private double price;
    private int discount;
    private double quantity;

    public Product() {
        discount=0;
        quantity=0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    public int calculateDiscount(LocalDate purchaseDate){
        setDiscount(0);
        return 0;
    }

    public double getQuantity() {
        
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    public String info(){
        return "\n\n"+name+" "+ brand;
    }
    
    //method that returns String which is later used in class Cashier to print receipt
    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.##");
        String product=info()+"\n"+
               format.format(quantity)+" x $"+format.format(price)+" = $"+format.format(quantity*price);
        if(discount!=0){
            return product.concat("\n#discount " +discount+"% -$"+format.format(quantity*price*discount/100)+"\n");
        }
        return product;
    }
    
    
    //method that returns String which is later used in class Cart to print its contents
    public String toCart(){
        DecimalFormat format = new DecimalFormat("0.##");
        return getName()+ " x "+ format.format(quantity)+ "\n";
    }
    
}

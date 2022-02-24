/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author nikol
 */
public class Appliance extends Product{
    
    private String model;
    private LocalDate productionDate;
    private double weight;

    public Appliance() {
    }

    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = LocalDate.parse(productionDate);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String info() {
        return super.info() + " " + model; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    //method that returns int(discount) based on price of product and the day it was purchased
    @Override
    public int calculateDiscount(LocalDate purchaseDate) {
        
        
        if(getPrice()>999 && (purchaseDate.getDayOfWeek()==DayOfWeek.SATURDAY || purchaseDate.getDayOfWeek()==DayOfWeek.SUNDAY)){
            setDiscount(7);
            return 7;
        }
        setDiscount(0);
        return 0;
    }
    
    
    
    
}

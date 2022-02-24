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
public class Clothes extends Product{
    
    private Size size;
    private String color;

    public Clothes() {
    }

    public Clothes(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    //metohod that returns int(discount) based on the day of purchase
    @Override
    public int calculateDiscount(LocalDate purchaseDate) {
        
        if(purchaseDate.getDayOfWeek()==DayOfWeek.TUESDAY ||
           purchaseDate.getDayOfWeek()==DayOfWeek.WEDNESDAY || purchaseDate.getDayOfWeek()==DayOfWeek.THURSDAY ||
           purchaseDate.getDayOfWeek()==DayOfWeek.FRIDAY || purchaseDate.getDayOfWeek()==DayOfWeek.SATURDAY){
            setDiscount(10);
            return 10;
        }
        setDiscount(0);
        return 0;
        
    }

    
    
    @Override
    public String info() {
        return super.info() + " " + size + " " + color; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}

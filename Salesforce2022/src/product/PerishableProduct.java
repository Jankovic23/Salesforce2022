/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.time.LocalDate;

/**
 *
 * @author nikol
 */
public class PerishableProduct extends Product{
    
    LocalDate expirationDate;


    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate=LocalDate.parse(expirationDate);
    }

    //method that returns int(discount) based on expiration date of product
    @Override
    public int calculateDiscount(LocalDate purchaseDate){
        
        
        if(expirationDate.equals(purchaseDate)){
            setDiscount(70);
            return 70;
        }
        
        if(expirationDate.isAfter(purchaseDate) && expirationDate.minusDays(5).isBefore(purchaseDate)){
            setDiscount(30);
            return 30;
        }
        setDiscount(0);
        return 0;
    }
    
    
    
}

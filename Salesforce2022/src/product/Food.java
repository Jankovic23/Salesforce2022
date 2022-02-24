/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

/**
 *
 * @author nikol
 */
public class Food extends PerishableProduct{
    /**
     *
     * @return
     */
    @Override
    public String toCart(){
        return getName()+ " x "+ getQuantity()+" kg\n";
    }
    
}

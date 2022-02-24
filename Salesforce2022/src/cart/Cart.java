/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cart;

import java.util.ArrayList;
import java.util.List;
import product.Product;

/**
 *
 * @author nikol
 */
public class Cart {
    
    private List<Product> cart;

    public Cart() {
        this.cart=new ArrayList<>();
    }
    
    //add product to cart
    public void add(Product product,double quantity){
    
        //check to see if cart(list cart) is empty
        if(cart.isEmpty()){
            product.setQuantity(quantity);
            cart.add(product);
        }else{
            //checking if cart(list) already has that product, if it does just increse its quantity
            if(cart.contains(product)){
                for (Product p : cart) {
                    if(p.equals(product)){
                        p.setQuantity(quantity+p.getQuantity());
                        return;
                    }
                }
            }else{
                product.setQuantity(quantity);
                cart.add(product);
            }
        }
        
    }
    //print products in cart
    public void printCart(){
        String cartInfo="Cart:\n";
        for(Product p : cart) {
            cartInfo=cartInfo.concat(p.toCart());
        }
        System.out.println(cartInfo);
    }
    
    public void addList(List<Product> products){
        for (Product product : products) {
            cart.add(product);
        }
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cashier;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import product.Product;

/**
 *
 * @author nikol
 */
public class Cashier {
    
    public void printReceipt(List<Product> products, Date purchaseDate){
        DecimalFormat format = new DecimalFormat("0.##");
        LocalDate date= purchaseDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        double subtotal=0;
        double discount=0;
        double total=0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String receipt="Date: " + sdf.format(purchaseDate) + "\n\n"+
                "---Products---\n";
        for (Product product : products) {
            product.calculateDiscount(date);
            receipt=receipt.concat(product.toString());
            subtotal+=product.getPrice() * product.getQuantity();
            discount+=product.getDiscount() * product.getQuantity()*product.getPrice()/100;
        }
        total=subtotal-discount;
        receipt=receipt.concat("\n----------------------------------------\n\n"
                + "SUBTOTAL: $" + format.format(subtotal) + "\n"
                + "DISCOUNT: -$"+ format.format(discount) +"\n\n"
                + "TOTAL: $"+format.format(total)+"\n");
        System.out.println(receipt);
    }
    
}

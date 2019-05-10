package com.demo.assessment1.models;

import java.util.List;

public class Cart {

    List<LineItem> lineItems;

    public Cart(List<LineItem> items) {
        this.lineItems = items;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void addProduct(Product p){
        for(LineItem lineItem : lineItems){
            if(lineItem.getProduct().getName().equals(p.getName())){
                lineItem.increaseQuantity();
                return;
            }
        }

        lineItems.add(new LineItem(p, 1));
    }

    public void increaseQuantity(Product p){
        for(LineItem lineItem : lineItems){
            if(lineItem.getProduct().getName().equals(p.getName())){
                lineItem.increaseQuantity();
                return;
            }
        }
    }

    public void decreaseQuantity(Product p){
        for(LineItem lineItem : lineItems){
            if(lineItem.getProduct().getName().equals(p.getName())){
                lineItem.decreaseQuantity();
                if(lineItem.getQuantity() == 0){
                    lineItems.remove(lineItem);
                    return;
                }
            }
        }
    }

    public void showCart(){
        double total = 0;
        for(LineItem lineItem: lineItems){
            double price = lineItem.getProduct().getPrice();
            int quantity = lineItem.getQuantity();
            total +=  price * quantity;
            System.out.println(lineItem.getProduct().getName() + " ---- > " + price + " x " + quantity);
        }

        System.out.println("Total is: --------- > $" + total);
    }
}

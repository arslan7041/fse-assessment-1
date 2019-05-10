package com.demo.assessment1.models;

public class LineItem {

    Product product;
    int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increaseQuantity(){
        quantity += 1;
    }

    public void decreaseQuantity(){
        quantity -= 1;
    }
}

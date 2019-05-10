package com.demo.assessment1.models;

import java.util.List;

public class Cart {

    List<LineItem> items;

    public Cart(List<LineItem> items) {
        this.items = items;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }
}

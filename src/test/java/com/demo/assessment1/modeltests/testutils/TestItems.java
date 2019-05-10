package com.demo.assessment1.modeltests.testutils;

import com.demo.assessment1.models.LineItem;
import com.demo.assessment1.models.Product;

import java.util.ArrayList;
import java.util.List;

public class TestItems {

    public static List<LineItem> getLineItems(){
        List<LineItem> lineitems = new ArrayList<LineItem>();

        lineitems.add(new LineItem(new Product("shoes", 50), 2));
        lineitems.add(new LineItem(new Product("pants", 100), 1));
        lineitems.add(new LineItem(new Product("shirt", 80), 5));
        lineitems.add(new LineItem(new Product("bag", 150), 1));


    }
}

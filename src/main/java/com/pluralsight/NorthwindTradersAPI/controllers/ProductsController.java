package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Products;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Products> getAllProducts(){

        List<Products> products = new ArrayList<>();

        products.add(new Products(1, "Chai", 1, 18.0));
        products.add(new Products(2, "Chang", 1, 19.0));
        products.add(new Products(3, "Aniseed Syrup", 2, 10.0));
        products.add(new Products(4, "Chef Anton's Cajun Seasoning", 2, 22.0));
        products.add(new Products(5, "Chef Anton's Gumbo Mix", 2, 21.35));
        products.add(new Products(6, "Grandma's Boysenberry Spread", 2, 25.0));
        products.add(new Products(7, "Uncle Bob's Organic Dried Pears", 7, 30.0));
        products.add(new Products(8, "Northwoods Cranberry Sauce", 2, 40.0));
        products.add(new Products(9, "Mishi Kobe Niku", 6, 97.0));
        products.add(new Products(10, "Ikura", 8, 31.0));

        return products;

    }

}

package com.pluralsight.NorthwindTradersAPI.data;

import com.pluralsight.NorthwindTradersAPI.models.Products;

import java.util.List;

public interface ProductDao {
    public List<Products> getAll();
    Products getById(int id);
}

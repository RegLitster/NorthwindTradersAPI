package com.pluralsight.NorthwindTradersAPI.data;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import java.util.List;

public interface CategoryDao {
    List<Category> getAll();
    Category getById(int id);
}

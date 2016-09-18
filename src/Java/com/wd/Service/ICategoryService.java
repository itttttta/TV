package com.wd.Service;

import com.wd.Enity.Category;

import java.util.List;

/**
 * Created by wangda on 16/9/12.
 */
public interface ICategoryService {
    public Category getCategoryById(int categoryId);
    public List<Category> getCategoryList();
}

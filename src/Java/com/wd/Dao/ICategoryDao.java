package com.wd.Dao;

import com.wd.Enity.Category;

import java.util.List;

/**
 * Created by wangda on 16/9/12.
 */

public interface ICategoryDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    List<Category> selectAllCategorys();

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}

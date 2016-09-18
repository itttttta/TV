package com.wd.ServiceImpl;

import com.wd.Dao.ICategoryDao;
import com.wd.Enity.Category;
import com.wd.Service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wangda on 16/9/12.
 */
@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Resource
    private ICategoryDao categoryDao;

    public Category getCategoryById(int categoryId) {
        return this.categoryDao.selectByPrimaryKey(categoryId);
    }

    public List<Category> getCategoryList() {
        return this.categoryDao.selectAllCategorys();
    }

}

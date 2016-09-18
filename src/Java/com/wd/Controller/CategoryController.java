package com.wd.Controller;

import com.wd.Enity.Category;
import com.wd.Service.ICategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangda on 16/9/12.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private ICategoryService categoryService;

    @RequestMapping("/showcategory")
    public String toIndex(HttpServletRequest request, Model model){
        int categoryId  =  Integer.parseInt(request.getParameter("id"));
        Category category = categoryService.getCategoryById(categoryId);
        model.addAttribute("category",category);
        return "showCategory";
    }
}

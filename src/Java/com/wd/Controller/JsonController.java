package com.wd.Controller;

import com.wd.Enity.Category;
import com.wd.Service.ICategoryService;
import com.wd.Util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wangda on 16/9/13.
 */
@Controller
public class JsonController {
    @Resource
    private ICategoryService categoryService;
    @RequestMapping("/json")
    @ResponseBody
    public String toIndex(HttpServletRequest request, Model model){

        int categoryId  =  Integer.parseInt(request.getParameter("id"));
        List categoryList = categoryService.getCategoryList();
        return JsonUtil.toJson(categoryList);
    }
}

import com.alibaba.fastjson.JSON;
import com.wd.Enity.Category;
import com.wd.Service.ICategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by wangda on 16/9/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(String.valueOf(TestMyBatis.class));
    //	private ApplicationContext ac = null;
    @Resource(name = "categoryService")
    private ICategoryService categoryService = null;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
//        Category user = categoryService.getCategoryById(1);
        List<Category> categoryList = categoryService.getCategoryList();
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(categoryList));
    }
}

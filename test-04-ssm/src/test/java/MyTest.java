import com.qing.domain.Books;
import com.qing.domain.User;
import com.qing.service.BooksService;
import com.qing.service.UserService;
import com.qing.utils.SsmUtils;
import org.junit.Test;

import java.util.List;

/**
 * @author 卿
 * @create 2020-12-23 16:12
 */
public class MyTest {

    // 代码优化，将从spring容器中取出的数据提取出来
    private BooksService booksService = SsmUtils.getBean("booksService", BooksService.class);
    private UserService userService = SsmUtils.getBean("userService", UserService.class);

    @Test
    public void test1(){
        List<Books> books = booksService.queryAll();
        for (Books book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void test2(){
        List<User> users = userService.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test3(){
        User user = userService.queryUser(new User(1, "admin", "123"));
        if (user != null){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}

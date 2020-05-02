import com.ioc.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userService");
        userService.getUser();
    }
}

import com.di.pojo.Student;
import com.di.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user.xml");
        User user = (User)applicationContext.getBean("user2");
        System.out.println(user.toString());
    }
}

import com.autoconfig.config.AutoConfig;
import com.autoconfig.pojo.Student;
import com.autoconfig.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoConfig.class);
        Student user = (Student) applicationContext.getBean("student");
        System.out.println(user.toString());
    }
}

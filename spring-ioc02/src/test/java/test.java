import com.ioc.pojo.Hello;
import com.ioc.pojo.NextStep;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        NextStep next = (NextStep) applicationContext.getBean("nextStep");
        String str = next.getWord();
        System.out.println(str);
    }
}

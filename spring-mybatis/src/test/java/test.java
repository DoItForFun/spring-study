import com.mybatis.dao.User;
import com.mybatis.mapper.User2MapperImpl;
import com.mybatis.mapper.UserMapperImpl;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class test {
    @Test
    public void getUser() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        User2MapperImpl userMapper =  applicationContext.getBean("userMapper2" , User2MapperImpl.class);
        for (User user : userMapper.getUser()) {
            System.out.println(user);
        }
    }

    @Test
    public void getUser2() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        UserMapperImpl userMapper =  applicationContext.getBean("userMapper" , UserMapperImpl.class);
        for (User user : userMapper.getUser()) {
            System.out.println(user);
        }
    }
}

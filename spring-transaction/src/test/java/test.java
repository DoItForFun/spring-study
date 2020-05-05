import com.transaction.DAO.User;
import com.transaction.Mapper.UserMapperImpl;
import org.apache.ibatis.transaction.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void getUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapperImpl userMapper = applicationContext.getBean("userMapper" , UserMapperImpl.class);
        for (User user : userMapper.getUserList()) {
            System.out.println(user);
        }
    }

    @Test
    public void SaveUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapperImpl userMapper = applicationContext.getBean("userMapper" , UserMapperImpl.class);
        User user = new User();
        user.setId(10);
        user.setName("123");
        user.setPwd("777");
        int res = userMapper.addUser(user);
        System.out.println(res);
    }
}

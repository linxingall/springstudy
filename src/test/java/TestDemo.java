import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linx on 2016/10/21.
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("application.xml");
        TestStr testStr =(TestStr) bf.getBean("test");
        testStr.test();
    }
}

package ioc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringIoCRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext repo = new ClassPathXmlApplicationContext("repo.xml");
        ConfigurableApplicationContext service = new ClassPathXmlApplicationContext(new String[]{"service.xml"}, repo);
    }
}

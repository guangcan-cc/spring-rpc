package cc.blog;

import cc.blog.rmi.RMICalcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIClient {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        RMICalcService accountService = (RMICalcService) ctx.getBean("myCalcService");
        int result = accountService.add(1, 2);
        System.out.println(result);
    }
}

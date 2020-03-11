import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.service.OrderService;

import java.io.IOException;

/**
 * @author 喻浩
 * @create 2020-01-31-17:37
 */
public class MainApplication {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService bean = applicationContext.getBean(OrderService.class);

        bean.initOrder("1");
        System.out.println("调用完成...");
        
        System.in.read();
    }
}

package cn;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

/**
 * 1. 导入依赖
 *  1. 导入 dubbo-starter
 *  2. 导入 dubbo 的其他依赖
 *  
 *  springboot 与 dubbo 整合的三种方式
 *      1. 导入 dubbo-starter，在 application.properties 配置属性，
 *          使用 @Service 暴露服务，使用 @Reference 引用服务  
 *      2. 保留 dubbo.xml 配置文件
 *          导入 dubbo-starter，使用 @ImportResource 导入 dubbo 配置文件即可
 *      3. 使用注解 API 的方式：
 *          将每一个组件手动创建到容器中，让 dubbo 来扫描其他的组件
 */
@SpringBootApplication
//开启基于注解的 dubbo 功能
@EnableDubbo
//@ImportResource(locations="classpath:provider.xml")
//@EnableDubbo(scanBasePackages = "cn.config")
@EnableHystrix  //开启服务容错
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}

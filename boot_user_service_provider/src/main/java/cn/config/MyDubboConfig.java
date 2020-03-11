package cn.config;

import cn.service.UserService;
import com.alibaba.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-02-01-14:51
 */
@Configuration
public class MyDubboConfig {
    
//    @Bean
//    public ApplicationConfig applicationConfig(){
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("boot_user_service_provider");
//        
//        return applicationConfig;
//    }
//    
//    @Bean
//    public RegistryConfig registryConfig(){
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setProtocol("zookeeper");
//        registryConfig.setAddress("47.102.36.32:2181");
//        
//        return registryConfig;
//    }
//    
//    @Bean
//    public ProtocolConfig protocolConfig(){
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("dubbo");
//        protocolConfig.setPort(20880);
//        
//        return protocolConfig;
//    }
//    
//    @Bean
//    public ServiceConfig<UserService> serviceConfig(UserService userService){
//        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
//        serviceConfig.setInterface(UserService.class);
//        serviceConfig.setRef(userService);
//        serviceConfig.setVersion("1.0.0");
//        
//        //配置每一个 method 的信息
//        MethodConfig methodConfig = new MethodConfig();
//        methodConfig.setName("getUserAddressList");
//        methodConfig.setTimeout(1000);
//        
//        
//        //将 method 的设置关联到 service 配置中
//        List<MethodConfig> methods = new ArrayList<>();
//        methods.add(methodConfig);
//        serviceConfig.setMethods(methods);
//        
////        ProviderConfig
////        MonitorConfig
//        
//        return serviceConfig;
//    }
}

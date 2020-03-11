package cn.service.impl;

import cn.bean.UserAddress;
import cn.service.OrderService;
import cn.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 1. 将服务提供者注册到注册中心
 *      1. 导入dubbo依赖（2.6.2） \ 操作 zookeeper 的客户端（curator）
 *      2. 配置服务提供者
 * 2. 让服务消费者去注册中心订阅服务提供者的服务地址
 * @author 喻浩
 * @create 2020-01-31-14:45
 */
@Service
public class OrderServiceImpl implements OrderService {
    
//    @Reference(url = "127.0.0.1:2181") // dubbo 直连
    @Reference
    UserService userService;
    
    /**
     * 初始化订单
     * @param userId
     */
    @HystrixCommand(fallbackMethod = "test")
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+userId);
        //1.查询用户收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
//        for (UserAddress address : userAddressList) {
//            System.out.println(address);
//        }
        return userAddressList;
    }

    /**
     * 服务容错调用的方法
     * @param userId
     * @return
     */
    public List<UserAddress> test(String userId){
        UserAddress address1 = new UserAddress();
        address1.setUserAddress("服务容错调用的方法");
        return Arrays.asList(address1);
    }
}

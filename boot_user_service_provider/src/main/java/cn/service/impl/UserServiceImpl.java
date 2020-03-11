package cn.service.impl;

import cn.bean.UserAddress;
import cn.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author 喻浩
 * @create 2020-01-31-14:42
 */
@Service//暴露服务
@Component
public class UserServiceImpl implements UserService {
    /**
     * 按照用户id返回所有的地址
     *
     * @param userId
     * @return
     */
    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("调用成功");
        UserAddress address1 = new UserAddress();
        address1.setUserAddress("1111111111111");
        UserAddress address2 = new UserAddress();
        address2.setUserAddress("2222222222222");
        
        if (Math.random() > 0.5){
            throw new RuntimeException();
        }
        
        return Arrays.asList(address1,address2);
    }
}

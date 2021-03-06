package cn.service.impl;

import cn.bean.UserAddress;
import org.springframework.stereotype.Service;
import cn.service.UserService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 喻浩
 * @create 2020-01-31-14:42
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 按照用户id返回所有的地址
     *
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("调用成功....old...");
        UserAddress address1 = new UserAddress();
        address1.setUserAddress("111");
        UserAddress address2 = new UserAddress();
        address2.setUserAddress("222");

//        try {
//            TimeUnit.SECONDS.sleep(4);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        
        return Arrays.asList(address1,address2);
    }
}

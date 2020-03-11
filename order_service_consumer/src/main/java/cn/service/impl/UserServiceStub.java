package cn.service.impl;

import cn.bean.UserAddress;
import cn.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author 喻浩
 * @create 2020-02-01-14:32
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

    /**
     * 传入的是userService的远程代理对象
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    /**
     * 按照用户id返回所有的地址
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub....");
        if (!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}

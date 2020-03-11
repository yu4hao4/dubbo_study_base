package cn.service;

import cn.bean.UserAddress;

import java.util.List;

/**
 * 用户服务
 * @author 喻浩
 * @create 2020-01-31-14:40
 */
public interface UserService {

    /**
     * 按照用户id返回所有的地址
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}

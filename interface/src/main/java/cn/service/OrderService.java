package cn.service;

import cn.bean.UserAddress;

import java.util.List;

/**
 * @author 喻浩
 * @create 2020-01-31-14:44
 */
public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     */
    List<UserAddress> initOrder(String userId);
}

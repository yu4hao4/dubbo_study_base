package cn.controller;

import cn.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.service.OrderService;

import java.util.List;

/**
 * @author 喻浩
 * @create 2020-01-31-19:46
 */
@Controller
public class OrderController {
    
    @Autowired
    OrderService orderService;
    
    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId){
        return orderService.initOrder(userId);
    }
}

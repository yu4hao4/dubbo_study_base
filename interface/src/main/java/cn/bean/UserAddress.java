package cn.bean;

import lombok.*;

import java.io.Serializable;

/**
 * @author 喻浩
 * @create 2020-01-31-14:36
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress implements Serializable {
    private Integer id;
    //用户地址
    private String userAddress;
    //用户Id
    private String userId;
    //收货人
    private String consignee;
    //电话号码
    private String phoneNum;
    //是否为默认收货地址 Y-是  N-否
    private String isDefault;
}

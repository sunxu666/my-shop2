package com.sunxu.my.shop.web.admin.service;


import com.sunxu.my.shop.domain.User;

/**
 * 〈一句话功能简述〉<br>
 * 〈业务层〉
 *
 * @author sunxu
 * @create 2019/3/5
 * @since 1.0.0
 */
public interface UserService {
    /**
     * 登录
     * @param email
     * @param password
     * @return
     */
    public User login(String email, String password);
}

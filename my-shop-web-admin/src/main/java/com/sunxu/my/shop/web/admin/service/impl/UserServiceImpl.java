package com.sunxu.my.shop.web.admin.service.impl;

import com.sunxu.my.shop.domain.User;
import com.sunxu.my.shop.web.admin.dao.UserDao;
import com.sunxu.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈实现业务层〉
 *
 * @author sunxu
 * @create 2019/3/5
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    //private UserDao userDao = SpringContext.getBean("userDao");
    public User login(String email, String password) {
       // UserDao userDao = (UserDao) SpringContext.getBean("userDao");
        return userDao.getUserByEmailAndPassword(email,password);
    }
}

package com.sunxu.my.shop.web.admin.service.impl;

import com.sunxu.my.shop.domain.TbUser;
import com.sunxu.my.shop.web.admin.dao.TbUserDao;
import com.sunxu.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户查询〉
 *
 * @author sunxu
 * @create 2019/3/20
 * @since 1.0.0
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserDao tbUserDao;
    @Override
    public List<TbUser> selectAll() {
        return tbUserDao.selectAll();
    }
}

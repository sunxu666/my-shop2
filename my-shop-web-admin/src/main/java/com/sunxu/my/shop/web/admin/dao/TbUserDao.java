package com.sunxu.my.shop.web.admin.dao;

import com.sunxu.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈tbuserdao〉
 *
 * @author sunxu
 * @create 2019/3/20
 * @since 1.0.0
 */
@Repository
public interface TbUserDao {
    /**
     * 查询所有数据
     * @return
     */
    public List<TbUser> selectAll();
}

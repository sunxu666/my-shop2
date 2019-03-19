package com.sunxu.my.shop.web.admin.web.controller;


import com.funtl.my.shop.commons.constant.ConstantUtils;
import com.sunxu.my.shop.domain.User;
import com.sunxu.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br>
 * 〈登录控制层〉
 *
 * @author sunxu
 * @create 2019/3/5
 * @since 1.0.0
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 这边可以写多个value路径用{}包含：@RequestMapping(value = {"","login"},method = RequestMethod.GET)
     * 单个是@RequestMapping(value = "login",method = RequestMethod.GET)
     * @return
     */
    @RequestMapping(value = {"","login"},method = RequestMethod.GET)
    public String login(){

        return "login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestParam(required = true)String email, @RequestParam(required = true)String password, HttpServletRequest httpServletRequest){
        User user = userService.login(email, password);

        //登录失败
        if(user==null){
           return login();
        }
        //登录成功
        else{
            //将登陆信息放到session
            httpServletRequest.getSession().setAttribute(ConstantUtils.SESSION_USER,user);
            return "redirect:/main";
        }
    }


    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String Logout(HttpServletRequest httpServletRequest){
        //清除session
        httpServletRequest.getSession().invalidate();
        return login();
    }


}

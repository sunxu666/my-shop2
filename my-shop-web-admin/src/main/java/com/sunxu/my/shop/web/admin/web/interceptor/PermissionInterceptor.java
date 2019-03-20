package com.sunxu.my.shop.web.admin.web.interceptor;

import com.sunxu.my.shop.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br>
 * 〈权限拦截〉只用来拦截/login
 *
 * @author sunxu
 * @create 2019/3/20
 * @since 1.0.0
 */
public class PermissionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 如果请求来自登录页  -以login结尾的String字符串
        if (modelAndView.getViewName().endsWith("login")) {
            User user = (User) request.getSession().getAttribute("user");
            if(user != null){
                // 则直接重定向到首页不再显示登录页
                response.sendRedirect("/main");
            }

        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

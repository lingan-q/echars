package com.qing.web.controller;

import com.qing.domain.User;
import com.qing.service.UserService;
import com.qing.utils.SsmUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 卿
 * @create 2020-12-23 16:47
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService = SsmUtils.getBean("userService", UserService.class);


    @RequestMapping("/login.do")
    public String login(User user, Model model){
        User u = userService.queryUser(user);
        if (u != null){
            // 登录成功
        }else{
            // 登陆失败
            model.addAttribute("login","密码错误");
            return "index";
        }
        return null;
    }
}

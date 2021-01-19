package cn.kgc.controller;

import cn.kgc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author 王鑫
 * @Date 2021/1/19 9:58
 * @Version 1.0
 */
@Controller
public class IndexController {
        @RequestMapping("getMessage")
    public String getMessage(Model model){
        model.addAttribute("message","<h1>hello thymeleaf</h1>");
            User user1=new User(1,"张三","12345",new Date());
            User user2=new User(1,"张er","12345",new Date());
            User user3=new User(1,"张ui","12345",new Date());
            User user4=new User(1,"张wu","12345",new Date());
            List<User> userList =new ArrayList<>();
            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            User user5=new User(5,"张w2","12345",new Date());

            model.addAttribute("userList",userList);
            model.addAttribute("us",user5);
        return "main";
    }
    @RequestMapping(value = {"/","/index.html"})
    public String index(){
            return "index";
    }
}

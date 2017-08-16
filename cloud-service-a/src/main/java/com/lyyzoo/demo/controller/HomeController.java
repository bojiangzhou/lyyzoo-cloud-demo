package com.lyyzoo.demo.controller;

import com.lyyzoo.demo.dto.User;
import com.lyyzoo.demo.feign.serviceb.feign.IServiceaFeign;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-15 20:12
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    IServiceaFeign serviceaFeign;

    @RequestMapping("/index")
    public String index(HttpSession session){
        session.setAttribute("username", "bojiangzhou");

        return "user";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello Service A!!";

    }

    @RequestMapping("/users")
    @ResponseBody
    public List<User> list(){
        List<User> list = serviceaFeign.queryUsers();
        Logger.getLogger(getClass()).info("*************************** users list ***************************");
        return list;
    }

}

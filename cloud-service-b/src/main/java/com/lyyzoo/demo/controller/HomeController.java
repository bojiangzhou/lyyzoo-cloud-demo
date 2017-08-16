package com.lyyzoo.demo.controller;

import com.lyyzoo.demo.dto.User;
import com.lyyzoo.demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-13 19:06
 */
@Controller()
@RequestMapping("/users")
public class HomeController {

    private static List<User> users = new ArrayList<>();

    @Autowired
    private UserService userService;

    static {
        User user1 = new User(1L, "Tom", 19);
        User user2 = new User(2L, "Jane", 19);
        User user3 = new User(3L, "Miacle", 19);

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> query(){
        List<User> list = userService.select();
        Logger.getLogger(getClass()).info("============== HomeController list ====================");
        return list;
    }





}

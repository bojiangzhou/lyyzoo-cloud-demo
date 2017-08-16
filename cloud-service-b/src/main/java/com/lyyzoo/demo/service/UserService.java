package com.lyyzoo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyyzoo.demo.dto.User;
import com.lyyzoo.demo.mapper.UserMapper;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-15 18:10
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> select(){
        return userMapper.select();
    }

}

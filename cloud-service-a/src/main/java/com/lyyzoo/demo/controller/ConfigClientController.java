package com.lyyzoo.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-14 22:05
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${url}")
    private String url;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @RequestMapping("/config/data")
    public Map<String, String> data(){

        Map<String, String> dataSource = new HashMap<>();
        dataSource.put("url", url);
        dataSource.put("username", username);
        dataSource.put("password", password);

        return dataSource;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

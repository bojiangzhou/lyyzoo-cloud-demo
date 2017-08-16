package com.lyyzoo.demo.dto;

import javax.persistence.Table;

/**
 * <p>
 *
 * @author jiangzhou.bo@hand-china.com
 * @date 2017-08-13 21:28
 */
@Table(name = "user")
public class User {

    private Long id;

    private String username;

    private Integer age;

    public User() {
    }

    public User(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

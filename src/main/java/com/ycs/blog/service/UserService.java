package com.ycs.blog.service;

import com.ycs.blog.po.User;


public interface UserService {

    User checkUser(String username, String password);
}

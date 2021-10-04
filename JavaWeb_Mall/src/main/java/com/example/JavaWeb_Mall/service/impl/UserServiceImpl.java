package com.example.JavaWeb_Mall.service.impl;


import com.example.JavaWeb_Mall.dao.UserDao;
import com.example.JavaWeb_Mall.dao.impl.UserDaoImpl;
import com.example.JavaWeb_Mall.pojo.User;
import com.example.JavaWeb_Mall.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {

        if (userDao.queryUserByUsername(username) == null) {
           // 等于null,说明没查到，没查到表示可用
           return false;
        }

        return true;

    }
}

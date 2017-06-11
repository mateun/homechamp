package com.ttech.homechamp.services.impl;

import com.ttech.homechamp.dal.daos.UserDAO;
import com.ttech.homechamp.models.Role;
import com.ttech.homechamp.models.User;
import com.ttech.homechamp.services.UserService;

/**
 * Created by martin on 11/06/2017.
 */
public class UserServiceImpl implements UserService {

    private UserDAO userDao;

    public UserServiceImpl(UserDAO ud) {
        this.userDao = ud;
    }

    @Override
    public User createUser(String name, String pw) {
        return null;
    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public void assignRole(User u, Role r) {

    }
}

package com.ttech.homechamp.services;

import com.ttech.homechamp.models.Role;
import com.ttech.homechamp.models.User;

/**
 * Created by martin on 11/06/2017.
 */
public interface UserService {

    User createUser(String name, String pw);
    void deleteUser(int userId);
    void assignRole(User u, Role r);
}

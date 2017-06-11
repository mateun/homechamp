package com.ttech.homechamp.dal.daos;

/**
 * Created by martin on 11/06/2017.
 */
public interface UserDAO {

    int createUser(String name);
    void changeUserName(String name);
}

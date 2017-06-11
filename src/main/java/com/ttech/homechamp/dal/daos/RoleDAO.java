package com.ttech.homechamp.dal.daos;

/**
 * Created by martin on 11/06/2017.
 */
public interface RoleDAO {

    int createRole(String name);
    void changeRoleName(String name);
}

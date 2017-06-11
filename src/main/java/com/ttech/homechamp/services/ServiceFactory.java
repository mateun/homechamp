package com.ttech.homechamp.services;

import com.ttech.homechamp.dal.daos.RoleDAO;
import com.ttech.homechamp.dal.daos.UserDAO;
import com.ttech.homechamp.dal.daos.impl.RoleDAOImpl;
import com.ttech.homechamp.dal.daos.impl.UserDAOImpl;
import com.ttech.homechamp.services.impl.RoleServiceImpl;
import com.ttech.homechamp.services.impl.UserServiceImpl;

/**
 * Created by martin on 11/06/2017.
 */
public class ServiceFactory {

    public static UserService getUserService() {
        UserDAO ud = new UserDAOImpl();
        return new UserServiceImpl(ud);
    }

    public static RoleService getRoleService() {
        RoleDAO roleDAO = new RoleDAOImpl();
        return new RoleServiceImpl(roleDAO);
    }
}

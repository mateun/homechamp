package com.ttech.homechamp.services.impl;

import com.ttech.homechamp.dal.daos.RoleDAO;
import com.ttech.homechamp.models.Permission;
import com.ttech.homechamp.models.Role;
import com.ttech.homechamp.services.RoleService;

import java.util.List;

/**
 * Created by martin on 11/06/2017.
 */
public class RoleServiceImpl implements RoleService {

    private RoleDAO roleDAO;

    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Override
    public Role createRole(String name) {
        return null;
    }

    @Override
    public void assignPermissions(Role role, List<Permission> permissions) {

    }
}

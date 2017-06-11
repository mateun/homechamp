package com.ttech.homechamp.services;

import com.ttech.homechamp.models.Permission;
import com.ttech.homechamp.models.Role;

import java.util.List;

/**
 * Created by martin on 11/06/2017.
 */
public interface RoleService {

    Role createRole(String name);
    void assignPermissions(Role role, List<Permission> permissions);

}

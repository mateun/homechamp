package com.ttech.homechamp.models;

import java.util.List;

/**
 * Created by martin on 11/06/2017.
 */
public class AuthorizationInfo {

    private User user;
    private List<Permission> permissionList;

    public AuthorizationInfo(User user, List<Permission> permissionList) {
        this.user = user;
        this.permissionList = permissionList;
    }

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

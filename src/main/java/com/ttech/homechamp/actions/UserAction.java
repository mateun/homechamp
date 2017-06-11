package com.ttech.homechamp.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.ttech.homechamp.dal.daos.ConnFactory;
import org.mindrot.jbcrypt.BCrypt;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by martin on 11/06/2017.
 */
public class UserAction extends ActionSupport {

    private String userName;
    private String passWord;

    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    public String info() throws Exception {
        return INPUT;
    }

    public String create() throws Exception {
        System.out.println("creating user: " + userName);
        String salt = BCrypt.gensalt(12);
        String hashedPW = BCrypt.hashpw(passWord, salt);
        System.out.println("hashedPW: " + hashedPW);
        // TODO store in db
        Connection conn = ConnFactory.getConnection();
        String insertSQL = "INSERT into hc_user(name, password) VALUES(?, ?)";
        PreparedStatement stmt = conn.prepareStatement(insertSQL);
        stmt.setString(1, userName);
        stmt.setString(2, hashedPW);
        stmt.execute();
        conn.close();
        return SUCCESS;
    }

    public String delete() throws Exception {
        return SUCCESS;
    }

    public void setUserName(String un) {
        userName = un;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

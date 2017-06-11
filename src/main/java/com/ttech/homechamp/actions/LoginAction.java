package com.ttech.homechamp.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.ttech.homechamp.dal.daos.ConnFactory;
import com.ttech.homechamp.models.User;
import org.apache.struts2.interceptor.SessionAware;
import org.mindrot.jbcrypt.BCrypt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;


/**
 * Created by martin on 11/06/2017.
 */
public class LoginAction extends ActionSupport implements SessionAware {

    private Map<String, Object> sessionAttributes = null;
    String userName;
    String passWord;

    @Override
    public String execute() throws Exception {
        return INPUT;
    }

    public String doLogin() throws Exception {
        System.out.println("doing the login for " + userName);
        Connection conn = ConnFactory.getConnection();
        String query = "SELECT * FROM hc_user WHERE name = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, userName);
        ResultSet rs = stmt.executeQuery();
        String retval = SUCCESS;
        while (rs.next()) {
            System.out.println("found user!");
            String un = rs.getString("name");
            String pw = rs.getString("password");
            System.out.println("pw clear: " + passWord + " pw_hashed: " + pw);
            if (BCrypt.checkpw(passWord, pw)) {
                User user = new User();
                user.setUserName(userName);
                user.setScore("10");
                sessionAttributes.put("USER", user);
                System.out.println("user logged in ok!");
            } else {
                System.out.println("credentials wrong!");
                retval = INPUT;
            }
        }
        rs.close();
        conn.close();
        return retval;
    }


    @Override
    public void setSession(Map<String, Object> session) {
        this.sessionAttributes = session;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

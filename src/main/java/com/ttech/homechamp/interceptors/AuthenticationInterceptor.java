package com.ttech.homechamp.interceptors;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.ttech.homechamp.models.AuthorizationAware;
import com.ttech.homechamp.models.AuthorizationInfo;
import com.ttech.homechamp.models.User;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by martin on 11/06/2017.
 */
public class AuthenticationInterceptor implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("inside auth interceptor");
        Map<String, Object> sessionAttributes = invocation.getInvocationContext().getSession();

        User user = (User) sessionAttributes.get("USER");
        if (user == null) {
            return Action.LOGIN;
        } else {
            System.out.println("all good, user is logged in!");
            if (invocation.getAction() instanceof AuthorizationAware) {
                // TODO retrieve permissions from database
                AuthorizationInfo authorizationInfo = new AuthorizationInfo(user, new ArrayList<>());
                ((AuthorizationAware) invocation.getAction()).setAuthInfo(authorizationInfo);
            }
            return invocation.invoke();
        }
    }
}

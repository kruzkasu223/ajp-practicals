package com.mypackage;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MyStudBean {
    private String username;
    private String message = "";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setuscname(String username) {
        this.uscname = username;
    }

    public String login() {
        if (this.username.equals("kruz"))
            return "welcome";
        else {
            this.message = "Account is Invalis";
            return "myForm";
        }
    }
}
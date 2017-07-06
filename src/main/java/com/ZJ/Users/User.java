package com.ZJ.Users;

/**
 * Created by lenovo on 2017/3/16.
 */
public class User {
    private String name;
    private String password;
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getPassword()
    {
        return this.password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    @Override
    public String toString()
    {
        return "User[nam"+name+",password="+password+"]";
    }
}

package com.example.ayushi.loginregister;

/**
 * Created by ayushi on 07/04/2016.
 */
public class User
{
    String name,username,password;
    String privilege,club;
    public User(String name, String uName,String pass,String pvlg,String club)
    {
        this.name=name;
        username=uName;
        password=pass;
        privilege=pvlg;
        this.club=club;
    }
    public User(String uName,String pass)
    {
        username=uName;
        password=pass;
        privilege="";
        name="";
        club="";
    }
}

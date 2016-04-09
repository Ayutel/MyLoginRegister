package com.example.ayushi.loginregister;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ayushi on 07/04/2016.
 */
public class UserLocalStore
{
    public static final String SP_NAME="userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context)
    {
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }
    public void storeUserData(User user)
    {
        SharedPreferences.Editor spEditor=userLocalDatabase.edit();
        spEditor.putString("name",user.name);
        spEditor.putString("username",user.username);
        spEditor.putString("password",user.password);
        spEditor.putString("privilege",user.privilege);
        spEditor.putString("club",user.club);

        spEditor.commit();
    }
    public User getLoggedInUser()
    {
        String name=userLocalDatabase.getString("name", "");
        String username=userLocalDatabase.getString("username","");
        String password=userLocalDatabase.getString("password","");
        String privilege=userLocalDatabase.getString("privilege","");
        String club=userLocalDatabase.getString("club","");
        User storedUser;
        storedUser = new User(name,username,password,privilege,club);
        return storedUser;
    }
    public void setUserLoggedIn(boolean loggedIn)
    {
        SharedPreferences.Editor spEditor=userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn",loggedIn);
        spEditor.commit();
    }
    public boolean getUserLoggedIn()
    {
        if(userLocalDatabase.getBoolean("loggedIn",false))
            return true;
        else
            return false;

    }
    public void clearUserData()
    {
        SharedPreferences.Editor spEditor=userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}

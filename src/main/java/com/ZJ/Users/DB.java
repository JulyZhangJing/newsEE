package com.ZJ.Users;

import java.io.IOException;
import java.sql.*;
import java.util.PropertyResourceBundle;

/**
 * Created by lenovo on 2017/3/16.
 */
public class DB {
    private static  String driverClass;
    private static String url;
    private static String user;
    private static String password;
    static {
        try {
            PropertyResourceBundle resourceBundle = new PropertyResourceBundle(MyServletContextListener.context.getResourceAsStream("/WEB-INF/dbinfo.properties"));
            driverClass=resourceBundle.getString("driverClass");
            url=resourceBundle.getString("url");
            password=resourceBundle.getString("password");
            user=resourceBundle.getString("user");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            Class.forName(driverClass);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }
    public static Connection getConnect()throws SQLException
    {
        Connection conn= DriverManager.getConnection(url,user,password);
        return conn;
    }
    public static void closeAll(ResultSet rs, Statement stat,Connection conn)
    {
        if(rs!=null)
        {
            try{
                rs.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        if(stat!=null)
        {
            try{
                stat.close();

            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        if(conn!=null)
        {
            try{
                conn.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}

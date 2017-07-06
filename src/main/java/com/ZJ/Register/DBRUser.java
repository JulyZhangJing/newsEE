package com.ZJ.Register;

import com.ZJ.Users.DB;
import com.ZJ.Users.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//注销的方法
/**
 * Created by lenovo on 2017/3/17.
 */
public class DBRUser  {
    public User FindUser(String name, String pwd)
    {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        User u=null;
        try{
            conn= DB.getConnect();
            String sql="INSERT INTO users(NAME,PASSWORD) VALUES(?,?)";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,pwd);
            stmt.executeUpdate();



        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            {
                DB.closeAll(rs,stmt,conn);
            }
            return u;
        }
    }
}

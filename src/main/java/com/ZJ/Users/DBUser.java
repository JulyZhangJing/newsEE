package com.ZJ.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lenovo on 2017/3/16.
 */
public class DBUser {
    public User FindUser(String name,String pwd)
    {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        User u=null;
        try{
            conn=DB.getConnect();
            String sql="SELECT* FROM users WHERE NAME=? AND PASSWORD=?";
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,pwd);
            rs=stmt.executeQuery();
            if(rs.next())
            {
                u=new User();
                u.setName(rs.getString(1));
                u.setPassword(rs.getString(2));
            }


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

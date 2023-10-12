package yc.java.airafrika.DAO.impl;

import yc.java.airafrika.Database.Database;
import yc.java.airafrika.Entities.Admin;
import yc.java.airafrika.Utils.Session;

import java.sql.*;

public class AdminDAO {
    private final Connection CONNECTION = Database.getConnection();

    public Admin login(String email, String password) throws SQLException {
        Admin admin = null;
        String sql = "SELECT * FROM `admin` WHERE email = ? AND password = ? ";

        try{
            PreparedStatement preparedStatement = CONNECTION.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet res = preparedStatement.executeQuery();

            if (res.next()){
                admin = Admin.getInstance(
                        res.getString("id"), res.getString("fullName"),
                        res.getString("email"), res.getString("password") );
                Session.getInstance().set("Admin", admin);
            }else{
                return null;
            }
        }catch (SQLException e ){
            throw new SQLException();
        }

        return  admin;
    }

}


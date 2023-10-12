package yc.java.airafrika.Services;

import yc.java.airafrika.DAO.impl.AdminDAO;
import yc.java.airafrika.Entities.Admin;

import java.sql.SQLException;

public class AdminService {
    private final AdminDAO adminDAO = new AdminDAO();

    public Admin login(String email, String password) throws SQLException {
      Admin admin = adminDAO.login(email, password);
      if(admin != null){
          return admin;
      }else{
          return null;
      }

    }

}

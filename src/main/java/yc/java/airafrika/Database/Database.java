package yc.java.airafrika.Database;

import java.sql.Connection;

public interface Database{

    public Connection getConnection();

    public void closeConnection();
}
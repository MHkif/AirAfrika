package yc.java.airafrika.DAO;


import yc.java.airafrika.Database.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
    final Connection CONNECTION = Database.getConnection();

    T save(T t) throws SQLException;
    T update(T t) throws SQLException;
    boolean deactivate(String slag) throws SQLException;
    T findBy(String id) throws SQLException;
    List<T> getAll() throws SQLException;
}


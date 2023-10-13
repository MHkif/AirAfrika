package yc.java.airafrika.DAO;


import org.hibernate.boot.model.relational.Database;
import yc.java.airafrika.Database.PostrgreSQLDatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
    final PostrgreSQLDatabase database = new PostrgreSQLDatabase();
    final Connection CONNECTION = database.getConnection();

    T save(T t) throws SQLException;
    T update(T t) throws SQLException;
    boolean deactivate(String slag) throws SQLException;
    T findBy(String id) throws SQLException;
    List<T> getAll() throws SQLException;
}


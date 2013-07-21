package com.lf.bill.management.model.db.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;


public class DatabaseUtils {
    public DatabaseUtils() {
        super();
    }

    public Connection createConnection() throws SQLException {
        String user = "C##BILLDATA";
        String passWord = "welcome1";
        Connection connection;
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(passWord);
        dataSource.setURL("jdbc:oracle:thin:@localhost:1521:ORCL");
        connection = dataSource.getConnection();
        return connection;
    }

    public void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(Connection connection, String query) {
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet executeUpdate(String query) {
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            connection = createConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
        return resultSet;
    }

}

package com.ttech.homechamp.dal.daos;

import java.sql.*;

/**
 * Created by martin on 11/06/2017.
 */
public class ConnFactory {

    public static Connection getConnection() {
        String jdbcUrl = System.getenv("JDBC_DATABASE_URL");

        if (null == jdbcUrl) {
            jdbcUrl = "jdbc:postgresql://localhost:5432/hc_local1?user=mgr&password=bjoern36";
        }

        try {
            Connection conn = DriverManager.getConnection(jdbcUrl);
            return conn;
            /*String selectQuery = "SELECT id, name from hc_user";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);*/
            /*while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

            }*/

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}

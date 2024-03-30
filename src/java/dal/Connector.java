/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.*;

/**
 *
 * @author DELL
 */
public class Connector {
    public static final String URL = "jdbc:mysql://localhost:3306/atbm?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
//    protected static Connection con ;

    public Connector() {

    }
    public static Connection createConnection() {
        try {
            Connection connection=null;
            Class.forName(DRIVER_CLASS);
             connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to Database.");
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Cannot connect to database", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
                System.out.println("close successfully");
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
    public static void information(Connection c) throws SQLException {
        if (c != null) {
            DatabaseMetaData db = c.getMetaData();
            System.out.println(db.getDatabaseProductName());
            System.out.println(db.getDatabaseProductVersion());
        }


    }


    public static void main(String[] args) throws SQLException {
        Connection connection=Connector.createConnection();
        Connector.information(connection);
        Connector.closeConnection(connection);
//        try {
//            PreparedStatement st = con.prepareStatement(sql);
//            ResultSet rs = st.executeQuery();
//            if (rs.next()) {
//                System.out.println(rs.getString("fullname"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } String sql = "select * from users";

    }
}

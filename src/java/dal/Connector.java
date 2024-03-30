/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class Connector {
    protected static Connection con ;
    public Connector (){
        if(con == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/btlatbm?autoReconnect=true&useSSL=false";
                String username = "root";
                String password = "nvhanh263";
                con = DriverManager.getConnection(url,username,password);
                System.out.println("sucessfully");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Connector c = new Connector();
        String sql = "select * from users";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("fullname"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

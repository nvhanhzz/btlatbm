/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import Model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author DELL
 */
public class UserDao implements Dao<User>{

    @Override
    public Optional<User> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void save(User user) {
        try {
            Connection connection=Connector.createConnection();
            Statement statement=connection.createStatement();
            String sql = "INSERT INTO users (fullname,username, password,role) VALUES ('" +
                    user.getFullName() + "', '" +
                    user.getUsername()+ "', '" +
                    user.getPassword()+ "', '" +
                    user. + "')";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void update(User user, String[] params) {

    }

    @Override
    public void delete(User user) {

    }
}

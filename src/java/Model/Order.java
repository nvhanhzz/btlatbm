/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class Order {
    private int id;
    private String email, phone_number, address;
    private Date created_at;
    private User user;

    public Order() {
    }

    public Order(int id, String email, String phone_number, String address, Date created_at, User user) {
        this.id = id;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.created_at = created_at;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
//
//    @Override
//    public String toString() {
//        return "Order{" + "id=" + id + ", email=" + email + ", phone_number=" + phone_number + ", address=" + address + ", created_at=" + created_at + ", user=" + user + '}';
//    }
//    
//    public static void main(String[] args) {
//        Order o = new Order(1, "123@234.com", "0123456789", "hn", new Date(System.currentTimeMillis()), new User(1, "a1", "123", "123", true));
//        System.out.println(o);
//    }
}

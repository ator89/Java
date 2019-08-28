/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author angel
 */
public class User extends Person{

    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password, String name, String lastName, int age) {
        super(name, lastName, age);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", name= " + super.name+'}';
    }
    
    
}

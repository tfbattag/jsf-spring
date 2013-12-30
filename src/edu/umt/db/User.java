package edu.umt.db;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: tb189431e
 * Date: 12/30/13
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String username;
    private String role;

    public User(org.springframework.security.core.userdetails.User springUser){
        this.username = springUser.getUsername();
        Iterator it = springUser.getAuthorities().iterator();
        while(it.hasNext()){
            this.role = new String(((SimpleGrantedAuthority)it.next()).getAuthority().toCharArray());
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

package edu.umt.jsf.beans;

import edu.umt.db.User;

/**
 * Created with IntelliJ IDEA.
 * User: tb189431e
 * Date: 12/27/13
 * Time: 2:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginBackingBean extends BaseBackingBean{
    private User user;
    private boolean isAdmin;

    public boolean isAdmin() {
        return user.getRole().equals(("ROLE_ADMIN"));
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String secureTwoAction(){
        user = super.getUser();

        return "goto2";
    }


}

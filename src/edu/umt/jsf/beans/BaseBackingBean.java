package edu.umt.jsf.beans;

import com.sun.faces.context.SessionMap;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.core.userdetails.User;

import javax.faces.context.FacesContext;

/**
 * Created with IntelliJ IDEA.
 * User: tb189431e
 * Date: 12/30/13
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class BaseBackingBean {

    protected edu.umt.db.User user;

    protected edu.umt.db.User getUser(){
        SessionMap sm = (SessionMap) FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        SecurityContextImpl sci = (SecurityContextImpl)sm.get("SPRING_SECURITY_CONTEXT");
        User springUser = (User)sci.getAuthentication().getPrincipal();
        return new edu.umt.db.User(springUser);
    }
}

package net.therap.todo.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 8/28/13
 * Time: 3:03 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class User {

    @Pattern(regexp = "[A-Za-z0-9_-]+@[A-Za-z]+.[A-Za-z]+", message = "Invalid Email")
    @Size(min = 10, max = 50, message = "within 10 to 50 characters")
    private String emailID;

    @Size(min = 10, max = 50, message = "within 10 to 50 characters")
    private String userName;

    @Pattern(regexp = "[^\\s]*", message = "space is not allowed")
    @Size(min = 8, max = 30, message = "within 8 to 30 characters")
    private String password;


    List<Task> taskList = new ArrayList<Task>() ;

    @Id
    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(targetEntity = Task.class, mappedBy = "taskOwner",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}

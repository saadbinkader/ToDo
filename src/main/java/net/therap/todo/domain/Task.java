package net.therap.todo.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 8/28/13
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Task {
    private int taskID;
    private String taskTitle;
    private String taskDescription;
    private User taskOwner;

    @Id
    @GeneratedValue
    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @ManyToOne
    @JoinColumn(name = "TASK_OWER")
    public User getTaskOwner() {
        return taskOwner;
    }

    public void setTaskOwner(User taskOwner) {
        this.taskOwner = taskOwner;
    }
}

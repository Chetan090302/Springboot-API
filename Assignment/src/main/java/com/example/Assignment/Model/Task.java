package com.example.Assignment.Model;
import jakarta.persistence.*;
@Entity
@Table(name="Task1")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name = "Task_Name")
    private String taskname;
    @Column(name = "Task_Details")
    private String taskdetails;
    @Column(name="Task_Status")
    private String taskstatus;


    // define constructors
    public Task()
    {
    }

    public Task(String taskname, String taskdetails, String taskstatus) {
        this.taskname = taskname;
        this.taskdetails = taskdetails;
        this.taskstatus = taskstatus;
    }

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer taskid) {
        this.id = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTaskdetails() {
        return taskdetails;
    }

    public void setTaskdetails(String taskdetails) {
        this.taskdetails = taskdetails;
    }

    public String getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(String taskstatus) {
        this.taskstatus = taskstatus;
    }
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskname='" + taskname + '\'' +
                ", taskdetails='" + taskdetails + '\'' +
                ", taskstatus='" + taskstatus + '\'' +
                '}';
    }
}










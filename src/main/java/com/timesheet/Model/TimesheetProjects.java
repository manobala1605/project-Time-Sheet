package com.timesheet.Model;


public class TimesheetProjects {
    public String userId5 = null;
    public String userId;
    String projectCode;
    public String projectName;
    public String projectCreated;
    public String status;
    public String totalTasks;
    public String tasksCompleted;
    public String deadline;
    public String projectcode;

    public TimesheetProjects(String userId,String projectcode,String projectName,String projectCreated,String status,String totalTasks,String tasksCompleted,String deadline)
    {
        this.userId = userId;
        this.projectCode = projectcode;
        this.projectName = projectName;
        this.projectCreated = projectCreated;
        this.status = status;
        this.totalTasks= totalTasks;
        this.tasksCompleted=tasksCompleted;
        this.deadline = deadline;
    }

    public TimesheetProjects(String userId1, String projectName1) {
    }

    public TimesheetProjects(String userId5) {
        this.userId5 = userId5;
    }
    
}

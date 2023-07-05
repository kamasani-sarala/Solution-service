package com.ebug.solution.VO;

public class Ticket {
    private int ticketId;
    private  String projectName;
    private String bugName;
    private String bugDescription;
    private int customerId;
    public int getTicketId() {
        return ticketId;
    }
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getBugName() {
        return bugName;
    }
    public void setBugName(String bugName) {
        this.bugName = bugName;
    }
    public String getBugDescription() {
        return bugDescription;
    }
    public void setBugDescription(String bugDescription) {
        this.bugDescription = bugDescription;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
package com.ebug.solution.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Solution {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int solutionId;
private int ticketId;
private int staffId;
private String remedyDetails;
public Solution() {
	super();
}

public Solution(int solutionId, int ticketId, int staffId, String remedyDetails) {
	super();
	this.solutionId = solutionId;
	this.ticketId = ticketId;
	this.staffId = staffId;
	this.remedyDetails = remedyDetails;
}

public int getSolutionId() {
	return solutionId;
}
public void setSolutionId(int solutionId) {
	this.solutionId = solutionId;
}
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getStaffId() {
	return staffId;
}
public void setStaffId(int staffId) {
	this.staffId = staffId;
}
public String getRemedyDetails() {
	return remedyDetails;
}
public void setRemedyDetails(String remedyDetails) {
	this.remedyDetails = remedyDetails;
}

}
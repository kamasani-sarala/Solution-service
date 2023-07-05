package com.ebug.solution.VO;

import com.ebug.solution.entity.Solution;

public class ResponseTemplateVO {
private Solution solution;
private Ticket ticket;
private Staff staff;
public Solution getSolution() {
	return solution;
}
public void setSolution(Solution solution) {
	this.solution = solution;
}
public Staff getStaff() {
	return staff;
}
public void setStaff(Staff staff) {
	this.staff = staff;
}

public Ticket getTicket() {
	return ticket;
}
public void setTicket(Ticket ticket) {
	this.ticket = ticket;
}



}
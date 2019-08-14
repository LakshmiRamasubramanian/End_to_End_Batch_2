package com.spring.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainings")
public class Trainings {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

@Column(name = "user_id")
private int userId;

@Column(name = "mentor_id")
private int mentorId;

@Column(name = "skill_id")
private int skillId;

@Column(name = "status")
private boolean status;

@Column(name = "progress")
private String progress;

@Column(name = "rating")
private String rating;

@Column(name = "start_date")
private String startDate;

@Column(name = "end_date")
private String endDate;

@Column(name = "start_time")
private String startTime;

@Column(name = "end_time")
private String endTime;

@Column(name = "amount_received")
private double amountReceived;

public Trainings(int userId, int mentorId, int skillId, boolean status, String progress, String rating,
		String startDate, String endDate, String startTime, String endTime, double amountReceived) {
	super();
	this.userId = userId;
	this.mentorId = mentorId;
	this.skillId = skillId;
	this.status = status;
	this.progress = progress;
	this.rating = rating;
	this.startDate = startDate;
	this.endDate = endDate;
	this.startTime = startTime;
	this.endTime = endTime;
	this.amountReceived = amountReceived;
}
public Trainings() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getMentorId() {
	return mentorId;
}
public void setMentorId(int mentorId) {
	this.mentorId = mentorId;
}
public int getSkillId() {
	return skillId;
}
public void setSkillId(int skillId) {
	this.skillId = skillId;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getProgress() {
	return progress;
}
public void setProgress(String progress) {
	this.progress = progress;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}
public double getAmountReceived() {
	return amountReceived;
}
public void setAmountReceived(double amountReceived) {
	this.amountReceived = amountReceived;
}



}

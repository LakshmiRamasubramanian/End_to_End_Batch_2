package com.spring.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="payments")
public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "training_id")
	private int trainingId;
	@Column(name = "mentor_id")
	private int mentorId;

	@Column(name = "transaction_type")
	private String transactionType;

	@Column(name = "amount")
	private double amount;

	@Column(name = "date_time")
	private String dateTime;
	
	@Column(name = "remarks")
	private String remarks;
	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payments(int trainingId, int mentorId, String transactionType, double amount, String dateTime,
			String remarks) {
		super();
		this.trainingId = trainingId;
		this.mentorId = mentorId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


}

package com.miraclesoft.io.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PATIENT_CLAIM_DETAILS")
public class PatientClaimDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CLAIM_ID")
	private int claimId;
	@Column(name="PID")
	private int pId;
	@Column(name="PHY_ID")
	private int phyId;
	@Column(name="TOTAL_AMOUNT")
	private int totalAmount;
	@Column(name="PAID_AMOUNT")
	private int paidAmount;
	@Column(name="DATE")
	private String date;
	@Column(name="HOSPITAL")
	private String hospital;
	
	
	public PatientClaimDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "PatientClaimDetails [claimId=" + claimId + ", pId=" + pId + ", phyId=" + phyId + ", totalAmount="
				+ totalAmount + ", paidAmount=" + paidAmount + ", date=" + date + ", hospital=" + hospital + "]";
	}

	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getPhyId() {
		return phyId;
	}
	public void setPhyId(int phyId) {
		this.phyId = phyId;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	
	
}

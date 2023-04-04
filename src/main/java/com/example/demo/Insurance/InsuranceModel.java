package com.example.demo.Insurance;

import jakarta.persistence.Entity;

@Entity
public class InsuranceModel {
	public InsuranceModel(String id, String policy_number, String type, String coverage_amount, String premium,
			String start_date, String end_date) {
		super();
		Id = id;
		this.policy_number = policy_number;
		this.type = type;
		this.coverage_amount = coverage_amount;
		this.premium = premium;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPolicy_number() {
		return policy_number;
	}
	public void setPolicy_number(String policy_number) {
		this.policy_number = policy_number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCoverage_amount() {
		return coverage_amount;
	}
	public void setCoverage_amount(String coverage_amount) {
		this.coverage_amount = coverage_amount;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	@org.springframework.data.annotation.Id
 private String Id;
private String policy_number;
private String type;
private String coverage_amount;
private String premium;
private String start_date;
private String end_date;
}

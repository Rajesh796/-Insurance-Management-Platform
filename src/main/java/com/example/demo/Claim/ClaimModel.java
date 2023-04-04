package com.example.demo.Claim;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class ClaimModel {
@Id
	private String claim_number;
	private String description;
	private String claim_date;
	public ClaimModel(String claim_number, String description, String claim_date, String claim_status) {
		super();
		this.claim_number = claim_number;
		this.description = description;
		this.claim_date = claim_date;
		this.claim_status = claim_status;
	}
	public String getClaim_number() {
		return claim_number;
	}
	public void setClaim_number(String claim_number) {
		this.claim_number = claim_number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getClaim_date() {
		return claim_date;
	}
	public void setClaim_date(String claim_date) {
		this.claim_date = claim_date;
	}
	public String getClaim_status() {
		return claim_status;
	}
	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}
	private String claim_status;
}

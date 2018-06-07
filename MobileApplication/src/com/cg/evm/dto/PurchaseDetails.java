package com.cg.evm.dto;

import java.time.LocalDate;

public class PurchaseDetails {

	private int purchaseId;
	private String cname;
	private String mailId;
	private String phoneNo;
	private LocalDate pDate;
	private int mobileId;
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public LocalDate getpDate() {
		return pDate;
	}
	public void setpDate(LocalDate pDate) {
		this.pDate = pDate;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	
	
}

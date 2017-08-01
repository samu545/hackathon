package com.hcl.loan.quote.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the customer_profile database table.
 * 
 */
@Entity
@Table(name="customer_profile")
@NamedQuery(name="CustomerProfile.findAll", query="SELECT c FROM CustomerProfile c")
public class CustomerProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PROFILE_NUMBER")
	private long profileNumber;

	private String active;

	private String address;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREATED_TIME")
	private Timestamp createdTime;

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(name="DURATION_IN_MONTH")
	private long durationInMonth;

	@Column(name="EARNING_PER_MONTH")
	private BigDecimal earningPerMonth;

	@Column(name="EMAIL_ID")
	private String emailId;

	@Column(name="EXISTING_EMI_PER_MONTH")
	private BigDecimal existingEmiPerMonth;

	@Column(name="EXISTING_OTHER_EXPENSES")
	private BigDecimal existingOtherExpenses;

	@Column(name="EXISTING_RENT")
	private BigDecimal existingRent;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="LOAN_AMOUNT")
	private long loanAmount;

	@Column(name="LOAN_TYPE")
	private String loanType;

	private long mobile;

	@Column(name="POST_CODE")
	private String postCode;

	private String title;

	public CustomerProfile() {
	}

	public long getProfileNumber() {
		return this.profileNumber;
	}

	public void setProfileNumber(long profileNumber) {
		this.profileNumber = profileNumber;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getDurationInMonth() {
		return this.durationInMonth;
	}

	public void setDurationInMonth(long durationInMonth) {
		this.durationInMonth = durationInMonth;
	}

	public BigDecimal getEarningPerMonth() {
		return this.earningPerMonth;
	}

	public void setEarningPerMonth(BigDecimal earningPerMonth) {
		this.earningPerMonth = earningPerMonth;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public BigDecimal getExistingEmiPerMonth() {
		return this.existingEmiPerMonth;
	}

	public void setExistingEmiPerMonth(BigDecimal existingEmiPerMonth) {
		this.existingEmiPerMonth = existingEmiPerMonth;
	}

	public BigDecimal getExistingOtherExpenses() {
		return this.existingOtherExpenses;
	}

	public void setExistingOtherExpenses(BigDecimal existingOtherExpenses) {
		this.existingOtherExpenses = existingOtherExpenses;
	}

	public BigDecimal getExistingRent() {
		return this.existingRent;
	}

	public void setExistingRent(BigDecimal existingRent) {
		this.existingRent = existingRent;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanType() {
		return this.loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public long getMobile() {
		return this.mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
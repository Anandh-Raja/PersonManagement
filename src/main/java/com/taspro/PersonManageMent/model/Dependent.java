package com.taspro.PersonManageMent.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "dependents")
public class Dependent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dependent_id")
    private Long dependentId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_kyc_id", referencedColumnName = "kyc_id")
    private Customer customers;

    @Column(name = "relationship")
    private String relationship;

    @Column(name = "bday")
    private String bday;

    @Column(name = "nationality_code")
    private String nationalityCode;

    @Column(name = "nationality_others")
    private String nationalityOthers;

    @Column(name = "gender")
    private String gender;

    @Column(name = "name")
    private String name;

    @Column(name = "language_written")
    private String languageWritten;

    @Column(name = "smoker")
    private boolean smoker;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "nric_passport")
    private String nricPassport;

    @Column(name = "contact_no")
    private String contactNo;

	public Long getDependentId() {
		return dependentId;
	}

	public void setDependentId(Long dependentId) {
		this.dependentId = dependentId;
	}

	public Customer getCustomers() {
		return customers;
	}

	public void setCustomers(Customer customers) {
		this.customers = customers;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getNationalityCode() {
		return nationalityCode;
	}

	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
	}

	public String getNationalityOthers() {
		return nationalityOthers;
	}

	public void setNationalityOthers(String nationalityOthers) {
		this.nationalityOthers = nationalityOthers;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguageWritten() {
		return languageWritten;
	}

	public void setLanguageWritten(String languageWritten) {
		this.languageWritten = languageWritten;
	}

	public boolean isSmoker() {
		return smoker;
	}

	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNricPassport() {
		return nricPassport;
	}

	public void setNricPassport(String nricPassport) {
		this.nricPassport = nricPassport;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
    
}

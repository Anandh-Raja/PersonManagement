package com.taspro.PersonManageMent.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kyc_id")
    private Long kycId;

    public String getFaCode() {
		return faCode;
	}

	public void setFaCode(String faCode) {
		this.faCode = faCode;
	}

	public String getFaURL() {
		return faURL;
	}

	public void setFaURL(String faURL) {
		this.faURL = faURL;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNricPassport() {
		return nricPassport;
	}

	public void setNricPassport(String nricPassport) {
		this.nricPassport = nricPassport;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isSmoker() {
		return smoker;
	}

	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getLanguageWritten() {
		return languageWritten;
	}

	public void setLanguageWritten(String languageWritten) {
		this.languageWritten = languageWritten;
	}

	public String getLanguageSpoken() {
		return languageSpoken;
	}

	public void setLanguageSpoken(String languageSpoken) {
		this.languageSpoken = languageSpoken;
	}

	public String getLanguageSpokenOthers() {
		return languageSpokenOthers;
	}

	public void setLanguageSpokenOthers(String languageSpokenOthers) {
		this.languageSpokenOthers = languageSpokenOthers;
	}

	public String getLanguageWrittenOthers() {
		return languageWrittenOthers;
	}

	public void setLanguageWrittenOthers(String languageWrittenOthers) {
		this.languageWrittenOthers = languageWrittenOthers;
	}

	public String getNameOfCompanySchool() {
		return nameOfCompanySchool;
	}

	public void setNameOfCompanySchool(String nameOfCompanySchool) {
		this.nameOfCompanySchool = nameOfCompanySchool;
	}

	public String getNatureOfWork() {
		return natureOfWork;
	}

	public void setNatureOfWork(String natureOfWork) {
		this.natureOfWork = natureOfWork;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Dependent> getDependents() {
		return dependents;
	}

	public void setDependents(List<Dependent> dependents) {
		this.dependents = dependents;
	}

	@Column(name = "fa_code")
    private String faCode;

    @Column(name = "fa_url")
    private String faURL;

    @Column(name = "agent_code")
    private String agentCode;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "name")
    private String name;

    @Column(name = "nric_passport")
    private String nricPassport;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "gender_code")
    private String genderCode;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "weight")
    private double weight;

    @Column(name = "height")
    private double height;

    @Column(name = "smoker")
    private boolean smoker;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "education_level")
    private String educationLevel;

    @Column(name = "language_written")
    private String languageWritten;

    @Column(name = "language_spoken")
    private String languageSpoken;

    @Column(name = "language_spoken_others")
    private String languageSpokenOthers;

    @Column(name = "language_written_others")
    private String languageWrittenOthers;

    @Column(name = "name_of_company_school")
    private String nameOfCompanySchool;

    @Column(name = "nature_of_work")
    private String natureOfWork;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "address")
    private String address;

    public Long getKycId() {
		return kycId;
	}

	public void setKycId(Long kycId) {
		this.kycId = kycId;
	}

	@OneToMany(mappedBy = "customers", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    private List<Dependent> dependents;
}

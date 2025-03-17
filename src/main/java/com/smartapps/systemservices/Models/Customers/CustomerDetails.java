package com.smartapps.systemservices.Models.Customers;


import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "CUSTOMER_DETAILS")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_NUMBER", nullable = false)
    private Long customerNumber;

    @Column(name = "PAY_NUMBER", length = 16)
    private String payNumber;

    @Column(name = "MEMBER_NUMBER", columnDefinition = "BIGINT DEFAULT 0")
    private Long memberNumber;

    @Column(name = "FIRST_NAMES", length = 32)
    private String firstNames;

    @Column(name = "SURNAME", length = 32)
    private String surname;

    @Column(name = "CUSTOMER_STATUS", length = 3, columnDefinition = "VARCHAR(3) DEFAULT 'ACT'")
    private String customerStatus;

    @Column(name = "CUSTOMER_TYPE", length = 3, columnDefinition = "VARCHAR(3) DEFAULT 'FOS'")
    private String customerType;

    @Column(name = "CATEGORY_GROUP", length = 3, columnDefinition = "VARCHAR(3) DEFAULT 'GP1'")
    private String categoryGroup;

    @Column(name = "INCOME_ACTIVITY", length = 60)
    private String incomeActivity;

    @Column(name = "PIN_NUMBER", length = 16)
    private String pinNumber;

    @Column(name = "NATIONAL_ID", length = 16)
    private String nationalId;

    @Column(name = "ADDRESS1", length = 60)
    private String address1;

    @Column(name = "ADDRESS2", length = 60)
    private String address2;

    @Column(name = "ADDRESS3", length = 60)
    private String address3;

    @Column(name = "CITY", length = 60)
    private String city;

    @Column(name = "EMAIL_ADDRESS", length = 60)
    private String emailAddress;

    @Column(name = "HOME_TELEPHONE", length = 32)
    private String homeTelephone;

    @Column(name = "MOBILE_PHONE", length = 32)
    private String mobilePhone;

    @Column(name = "OFFICE_PHONE", length = 32)
    private String officePhone;

    @Column(name = "MULTISIGNATORY", columnDefinition = "CHAR(1) DEFAULT 'N'")
    private Character multiSignatory;

    @Column(name = "CAN_TAKE_LOAN", columnDefinition = "CHAR(1) DEFAULT 'Y'")
    private Character canTakeLoan;

    @Column(name = "LOAN_FACTOR", precision = 20, scale = 2, columnDefinition = "DECIMAL(20,2) DEFAULT 0")
    private BigDecimal loanFactor;

    @Column(name = "SAVING_FACTOR", precision = 20, scale = 2, columnDefinition = "DECIMAL(20,2) DEFAULT 0")
    private BigDecimal savingFactor;

    @Column(name = "SHARE_FACTOR", precision = 20, scale = 2, columnDefinition = "DECIMAL(20,2) DEFAULT 0")
    private BigDecimal shareFactor;

    @Column(name = "GENDER", columnDefinition = "CHAR(1) DEFAULT 'M'")
    private Character gender;

    @Column(name = "DATE_CREATED", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateCreated;

    @Column(name = "CREATED_BY", length = 16)
    private String createdBy;

    @Column(name = "DATE_MODIFIED", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateModified;

    @Column(name = "MODIFIED_BY", length = 16)
    private String modifiedBy;

    @Column(name = "MARITAL_STATUS", length = 10, columnDefinition = "VARCHAR(10) DEFAULT 'SINGLE'")
    private String maritalStatus;

    @Column(name = "PHOTO", length = 50)
    private String photo;

    @Column(name = "SIGNATURE", length = 50)
    private String signature;

    @Column(name = "BANK_ACCOUNT_NAME", length = 100, columnDefinition = "VARCHAR(100) DEFAULT ''")
    private String bankAccountName;

    @Column(name = "BANK_BRANCH", length = 50, columnDefinition = "VARCHAR(50) DEFAULT ''")
    private String bankBranch;

    @Column(name = "CAN_USE_APP", columnDefinition = "VARCHAR(1) DEFAULT 'N'")
    private Character canUseApp;

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(String payNumber) {
        this.payNumber = payNumber;
    }

    public Long getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(Long memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCategoryGroup() {
        return categoryGroup;
    }

    public void setCategoryGroup(String categoryGroup) {
        this.categoryGroup = categoryGroup;
    }

    public String getIncomeActivity() {
        return incomeActivity;
    }

    public void setIncomeActivity(String incomeActivity) {
        this.incomeActivity = incomeActivity;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public Character getMultiSignatory() {
        return multiSignatory;
    }

    public void setMultiSignatory(Character multiSignatory) {
        this.multiSignatory = multiSignatory;
    }

    public Character getCanTakeLoan() {
        return canTakeLoan;
    }

    public void setCanTakeLoan(Character canTakeLoan) {
        this.canTakeLoan = canTakeLoan;
    }

    public BigDecimal getLoanFactor() {
        return loanFactor;
    }

    public void setLoanFactor(BigDecimal loanFactor) {
        this.loanFactor = loanFactor;
    }

    public BigDecimal getSavingFactor() {
        return savingFactor;
    }

    public void setSavingFactor(BigDecimal savingFactor) {
        this.savingFactor = savingFactor;
    }

    public BigDecimal getShareFactor() {
        return shareFactor;
    }

    public void setShareFactor(BigDecimal shareFactor) {
        this.shareFactor = shareFactor;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public Character getCanUseApp() {
        return canUseApp;
    }

    public void setCanUseApp(Character canUseApp) {
        this.canUseApp = canUseApp;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "customerNumber=" + customerNumber +
                ", payNumber='" + payNumber + '\'' +
                ", memberNumber=" + memberNumber +
                ", firstNames='" + firstNames + '\'' +
                ", surname='" + surname + '\'' +
                ", customerStatus='" + customerStatus + '\'' +
                ", customerType='" + customerType + '\'' +
                ", categoryGroup='" + categoryGroup + '\'' +
                ", incomeActivity='" + incomeActivity + '\'' +
                ", pinNumber='" + pinNumber + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", city='" + city + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", homeTelephone='" + homeTelephone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", multiSignatory=" + multiSignatory +
                ", canTakeLoan=" + canTakeLoan +
                ", loanFactor=" + loanFactor +
                ", savingFactor=" + savingFactor +
                ", shareFactor=" + shareFactor +
                ", gender=" + gender +
                ", dateCreated=" + dateCreated +
                ", createdBy='" + createdBy + '\'' +
                ", dateModified=" + dateModified +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", photo='" + photo + '\'' +
                ", signature='" + signature + '\'' +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", bankBranch='" + bankBranch + '\'' +
                ", canUseApp=" + canUseApp +
                '}';
    }
}

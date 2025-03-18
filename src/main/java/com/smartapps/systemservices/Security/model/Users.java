package com.smartapps.systemservices.Security.model;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "USERS")

public class Users {

    @Id
    @Column(name = "USER_NUMBER", length = 16, nullable = false)
    private String username;

    @Column(name = "PROFILE_NAME", length = 60)
    private String profileName;

    @Column(name = "USE_GROUP_ACCESS", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String useGroupAccess;

    @Column(name = "GROUP_CODE", length = 3, columnDefinition = "VARCHAR(3) DEFAULT 'USR'")
    private String groupCode;

    @Column(name = "PASS_WORD", length = 500)
    private String password;

    @Column(name = "ACCESS_TYPE", length = 3)
    private String accessType;

    @Column(name = "LANGUAGE_CODE", length = 3)
    private String languageCode;

    @Column(name = "INITIAL_WINDOW", length = 32)
    private String initialWindow;

    @Column(name = "COMPANY_ACCESS", length = 16)
    private String companyAccess;

    @Column(name = "CUSTOMER_TYPE", length = 3)
    private String customerType;

    @Column(name = "MAIN_ACCOUNT", length = 3)
    private String mainAccount;

    @Column(name = "LOCATION_ACCESS", length = 16)
    private String locationAccess;

    @Column(name = "RESTRICT_COMPANY", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String restrictCompany;

    @Column(name = "RESTRICT_TYPE", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String restrictType;

    @Column(name = "RESTRICT_ACCOUNT", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String restrictAccount;

    @Column(name = "RESTRICT_LOCATION", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String restrictLocation;

    @Column(name = "TELLER_APPROVE", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String tellerApprove;

    @Column(name = "LOAN_APPROVE", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String loanApprove;

    @Column(name = "AMOUNT_LIMIT", columnDefinition = "BIGINT DEFAULT 0")
    private BigInteger amountLimit;

    @Column(name = "CAN_APPROVE", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String canApprove;

    @Column(name = "APPROVER_NUMBER", length = 16)
    private String approverNumber;

    @Column(name = "EXPIRED", length = 1)
    private String expired;

    @Column(name = "EXPIRY_DATE")
    private LocalDateTime expiryDate;

    @Column(name = "PASSWORD_DATE")
    private LocalDateTime passwordDate;

    @Column(name = "DISABLED", length = 1)
    private String disabled;

    @Column(name = "DISABLED_DATE")
    private LocalDateTime disabledDate;

    @Column(name = "FIRST_DAY", columnDefinition = "SMALLINT DEFAULT 1")
    private Integer firstDay;

    @Column(name = "ALLOW_WEEK_END", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String allowWeekend;

    @Column(name = "ALLOW_NIGHT_USE", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String allowNightUse;

    @Column(name = "LOG_ATTEMPTS", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String logAttempts;

    @Column(name = "LAST_USAGE")
    private LocalDateTime lastUsage;

    @Column(name = "COMPUTER", length = 60)
    private String computer;

    @Column(name = "EMAIL_ADDRESS", length = 60)
    private String emailAddress;

    @Column(name = "CAN_ROLL_PERIODS", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String canRollPeriods;

    @Column(name = "CURRENCY_CODE", length = 3)
    private String currencyCode;

    @Column(name = "COMPANY", length = 16)
    private String company;

    @Column(name = "WORK_LOCATION", length = 16)
    private String workLocation;

    @Column(name = "USER_TYPE", length = 3, columnDefinition = "VARCHAR(3) DEFAULT 'USE'")
    private String userType;

    @Column(name = "CAN_POST_BATCH", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String canPostBatch;

    @Column(name = "CUSTOMER_NUMBER", columnDefinition = "BIGINT DEFAULT 0")
    private BigInteger customerNumber;

    @Column(name = "DATE_MODIFIED", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateModified;

    @Column(name = "MODIFIED_BY", length = 16)
    private String modifiedBy;

    @Column(name = "EXPORT_INDICATOR", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String exportIndicator;

    @Column(name = "DATE_EXPORTED")
    private LocalDateTime dateExported;

    @Column(name = "EXPORTED_BY", length = 16)
    private String exportedBy;

    @Column(name = "PASSWORD", length = 200)
    private String passwordHash;

    @Column(name = "RESTRICT_WITHDRAWAL", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String restrictWithdrawal;

    @Column(name = "CAN_USE_APP", length = 1, columnDefinition = "CHAR(1) DEFAULT 'N'")
    private String canUseApp;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getUseGroupAccess() {
        return useGroupAccess;
    }

    public void setUseGroupAccess(String useGroupAccess) {
        this.useGroupAccess = useGroupAccess;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getInitialWindow() {
        return initialWindow;
    }

    public void setInitialWindow(String initialWindow) {
        this.initialWindow = initialWindow;
    }

    public String getCompanyAccess() {
        return companyAccess;
    }

    public void setCompanyAccess(String companyAccess) {
        this.companyAccess = companyAccess;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getMainAccount() {
        return mainAccount;
    }

    public void setMainAccount(String mainAccount) {
        this.mainAccount = mainAccount;
    }

    public String getLocationAccess() {
        return locationAccess;
    }

    public void setLocationAccess(String locationAccess) {
        this.locationAccess = locationAccess;
    }

    public String getRestrictCompany() {
        return restrictCompany;
    }

    public void setRestrictCompany(String restrictCompany) {
        this.restrictCompany = restrictCompany;
    }

    public String getRestrictType() {
        return restrictType;
    }

    public void setRestrictType(String restrictType) {
        this.restrictType = restrictType;
    }

    public String getRestrictAccount() {
        return restrictAccount;
    }

    public void setRestrictAccount(String restrictAccount) {
        this.restrictAccount = restrictAccount;
    }

    public String getRestrictLocation() {
        return restrictLocation;
    }

    public void setRestrictLocation(String restrictLocation) {
        this.restrictLocation = restrictLocation;
    }

    public String getTellerApprove() {
        return tellerApprove;
    }

    public void setTellerApprove(String tellerApprove) {
        this.tellerApprove = tellerApprove;
    }

    public String getLoanApprove() {
        return loanApprove;
    }

    public void setLoanApprove(String loanApprove) {
        this.loanApprove = loanApprove;
    }

    public BigInteger getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(BigInteger amountLimit) {
        this.amountLimit = amountLimit;
    }

    public String getCanApprove() {
        return canApprove;
    }

    public void setCanApprove(String canApprove) {
        this.canApprove = canApprove;
    }

    public String getApproverNumber() {
        return approverNumber;
    }

    public void setApproverNumber(String approverNumber) {
        this.approverNumber = approverNumber;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDateTime getPasswordDate() {
        return passwordDate;
    }

    public void setPasswordDate(LocalDateTime passwordDate) {
        this.passwordDate = passwordDate;
    }

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public LocalDateTime getDisabledDate() {
        return disabledDate;
    }

    public void setDisabledDate(LocalDateTime disabledDate) {
        this.disabledDate = disabledDate;
    }

    public Integer getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(Integer firstDay) {
        this.firstDay = firstDay;
    }

    public String getAllowWeekend() {
        return allowWeekend;
    }

    public void setAllowWeekend(String allowWeekend) {
        this.allowWeekend = allowWeekend;
    }

    public String getAllowNightUse() {
        return allowNightUse;
    }

    public void setAllowNightUse(String allowNightUse) {
        this.allowNightUse = allowNightUse;
    }

    public String getLogAttempts() {
        return logAttempts;
    }

    public void setLogAttempts(String logAttempts) {
        this.logAttempts = logAttempts;
    }

    public LocalDateTime getLastUsage() {
        return lastUsage;
    }

    public void setLastUsage(LocalDateTime lastUsage) {
        this.lastUsage = lastUsage;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCanRollPeriods() {
        return canRollPeriods;
    }

    public void setCanRollPeriods(String canRollPeriods) {
        this.canRollPeriods = canRollPeriods;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getCanPostBatch() {
        return canPostBatch;
    }

    public void setCanPostBatch(String canPostBatch) {
        this.canPostBatch = canPostBatch;
    }

    public BigInteger getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(BigInteger customerNumber) {
        this.customerNumber = customerNumber;
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

    public String getExportIndicator() {
        return exportIndicator;
    }

    public void setExportIndicator(String exportIndicator) {
        this.exportIndicator = exportIndicator;
    }

    public LocalDateTime getDateExported() {
        return dateExported;
    }

    public void setDateExported(LocalDateTime dateExported) {
        this.dateExported = dateExported;
    }

    public String getExportedBy() {
        return exportedBy;
    }

    public void setExportedBy(String exportedBy) {
        this.exportedBy = exportedBy;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getRestrictWithdrawal() {
        return restrictWithdrawal;
    }

    public void setRestrictWithdrawal(String restrictWithdrawal) {
        this.restrictWithdrawal = restrictWithdrawal;
    }

    public String getCanUseApp() {
        return canUseApp;
    }

    public void setCanUseApp(String canUseApp) {
        this.canUseApp = canUseApp;
    }
}

package com.fleetMall.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by beila on 2017/4/8.
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    @Column(name = "employee_name", length = 20)
    private String employeeName;
    @Column(name = "car_number", length = 20)
    private String carNumber;
    @Column(name = "employee_image_url", length = 50)
    private String employeeImageUrl;
    @Column(name = "employee_password", length = 20)
    private String employeePassword;
    @Column(name = "pay_password", length = 20)
    private String payPassword;
    @Column(name = "employee_telephone", length = 20)
    private String employeeTelephone;
    @Column(name = "employee_remain_money", length = 20)
    private String employeeRemainMoney;
    @Column(name = "register_date_time", length = 20)
    private String registerDateTime;
    @Column(name = "arrears", length = 20)
    private String arrears;

    @Column(name = "boss_uuid", length = 32)
    private String bossUUID;

    @Column(name = "isDelete", length = 2)
    private int isDelete;

    @Transient
    private List<BillRecords> billRecordsList;

    public Employee() {
        setIsDelete(0);
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getEmployeeImageUrl() {
        return employeeImageUrl;
    }

    public void setEmployeeImageUrl(String employeeImageUrl) {
        this.employeeImageUrl = employeeImageUrl;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getEmployeeTelephone() {
        return employeeTelephone;
    }

    public void setEmployeeTelephone(String employeeTelephone) {
        this.employeeTelephone = employeeTelephone;
    }

    public String getEmployeeRemainMoney() {
        return employeeRemainMoney;
    }

    public void setEmployeeRemainMoney(String employeeRemainMoney) {
        this.employeeRemainMoney = employeeRemainMoney;
    }

    public String getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(String registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public String getArrears() {
        return arrears;
    }

    public void setArrears(String arrears) {
        this.arrears = arrears;
    }

    public String getBossUUID() {
        return bossUUID;
    }

    public void setBossUUID(String bossUUID) {
        this.bossUUID = bossUUID;
    }

    public List<BillRecords> getBillRecordsList() {
        return billRecordsList;
    }

    public void setBillRecordsList(List<BillRecords> billRecordsList) {
        this.billRecordsList = billRecordsList;
    }
}

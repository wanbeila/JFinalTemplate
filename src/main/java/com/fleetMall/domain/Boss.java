package com.fleetMall.domain;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;

import javax.jms.TransactionInProgressRuntimeException;
import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * Created by beila on 2017/3/19.
 */
@Entity
@Table(name = "boss")
public class Boss {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    @Column(name = "boss_name", nullable = false, unique = true, length = 30)
    private String bossName;
    @Column(name = "car_number", length = 20)
    private String carNumber;
    @Column(name = "boss_img_url", length = 50)
    private String bossImageUrl;
    @Column(name = "boss_password", length = 20)
    private String bossPassword;
    @Column(name = "pay_password", length = 20)
    private String payPassword;
//    用手机号登录
    @Column(name = "boss_telephone", length = 20)
    private String bossTelephone;
//    余额
    @Column(name = "boss_remain_money", length = 20)
    private String bossRemainMoney;
//    注册时间包括日期和准确的时间
    @Column(name = "register_date_time", length = 20)
    private String registerDateTime;
//    欠款
    @Column(name = "arrears", length = 20)
    private String arrears;

    @Transient
    private Set<Employee> employeeSet;

    @Transient
    private List<BillRecords> billRecordsList;

    @Column(name = "isDelete", length = 2)
    private int isDelete;

    public List<BillRecords> getBillRecordsList() {
        return billRecordsList;
    }

    public void setBillRecordsList(List<BillRecords> billRecordsList) {
        this.billRecordsList = billRecordsList;
    }

    public Boss() {
        setIsDelete(0);
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getBossImageUrl() {
        return bossImageUrl;
    }

    public void setBossImageUrl(String bossImageUrl) {
        this.bossImageUrl = bossImageUrl;
    }

    public String getBossPassword() {
        return bossPassword;
    }

    public void setBossPassword(String bossPassword) {
        this.bossPassword = bossPassword;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getBossTelephone() {
        return bossTelephone;
    }

    public void setBossTelephone(String bossTelephone) {
        this.bossTelephone = bossTelephone;
    }

    public String getBossRemainMoney() {
        return bossRemainMoney;
    }

    public void setBossRemainMoney(String bossRemainMoney) {
        this.bossRemainMoney = bossRemainMoney;
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

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}

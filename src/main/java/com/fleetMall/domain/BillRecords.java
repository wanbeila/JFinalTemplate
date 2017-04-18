package com.fleetMall.domain;

import javax.persistence.*;
import javax.print.DocFlavor;

/**
 * Created by beila on 2017/4/8.
 */
@Entity
@Table(name = "bill_records")
public class BillRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    @Column(name = "bill_date", length = 20)
    private String billDate;
    @Column(name = "actual_outlay", length = 20)
    private String actualOutlay;
//    1：表示买家建立订单，2：表示卖家接收交易，3：表示交易完成 20：表示卖家取消交易， 30：表示买家取消交易
    @Column(name = "bill_status", length = 2)
    private String billStatus;

    @Column(name = "boss_uuid", length = 32)
    private String bossUUID;
    @Column(name = "employee_uuid", length = 32)
    private String employeeUUID;
    @Column(name = "commodity_uuid", length = 32)
    private long commodityUUID;
    @Column(name = "isDelete", length = 2)
    private int isDelete;

    public BillRecords() {
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

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getActualOutlay() {
        return actualOutlay;
    }

    public void setActualOutlay(String actualOutlay) {
        this.actualOutlay = actualOutlay;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getBossUUID() {
        return bossUUID;
    }

    public void setBossUUID(String bossUUID) {
        this.bossUUID = bossUUID;
    }

    public String getEmployeeUUID() {
        return employeeUUID;
    }

    public void setEmployeeUUID(String employeeUUID) {
        this.employeeUUID = employeeUUID;
    }

    public long getCommodityUUID() {
        return commodityUUID;
    }

    public void setCommodityUUID(long commodityUUID) {
        this.commodityUUID = commodityUUID;
    }
}

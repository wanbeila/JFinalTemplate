package com.fleetMall.domain;

import javax.persistence.*;

/**
 * Created by beila on 2017/4/8.
 */
@Entity
@Table(name = "price_alter")
public class PriceAlter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    @Column(name = "alter_date", length = 20)
    private String alterDate;
    @Column(name = "alter_money", length = 20)
    private String alterMoney;
    @Column(name = "commodity_uuid", length = 32)
    private String commodityUUID;

    @Column(name = "isDelete", length = 2)
    private int isDelete;

    public PriceAlter() {
        setIsDelete(0);
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getAlterDate() {
        return alterDate;
    }

    public void setAlterDate(String alterDate) {
        this.alterDate = alterDate;
    }

    public String getAlterMoney() {
        return alterMoney;
    }

    public void setAlterMoney(String alterMoney) {
        this.alterMoney = alterMoney;
    }

    public String getCommodityUUID() {
        return commodityUUID;
    }

    public void setCommodityUUID(String commodityUUID) {
        this.commodityUUID = commodityUUID;
    }

    public String getUuid() {

        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}

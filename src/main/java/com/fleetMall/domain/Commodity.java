package com.fleetMall.domain;

import com.fleetMall.domain.common.Photos;
import com.sun.xml.internal.ws.developer.UsesJAXBContext;

import javax.persistence.*;
import java.util.List;

/**
 * Created by beila on 2017/4/8.
 */
@Entity
@Table(name = "commodity")
public class Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    @Column(name = "commodity_name", length = 20)
    private String commodityName;
    @Column(name = "commodity_price", length = 20)
    private String commodityPrice;
    @Column(name = "commodity_type", length = 2)
    private String commodityType;
    @Column(name = "commodity_introduction", length = 100)
    private String commodityIntroduction;
    @Column(name = "store_uuid", length = 32)
    private String storeUUID;

    @Column(name = "is_delete", length = 2)
    private int isDelete;

    @Transient
    private List<Photos> photosList;
    @Transient
    private List<PriceAlter> priceAlterList;
    @Transient
    private List<Comment> commentList;

    public Commodity(){
        setIsDelete(0);
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(String commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
    }

    public String getCommodityIntroduction() {
        return commodityIntroduction;
    }

    public void setCommodityIntroduction(String commodityIntroduction) {
        this.commodityIntroduction = commodityIntroduction;
    }

    public String getStoreUUID() {
        return storeUUID;
    }

    public void setStoreUUID(String storeUUID) {
        this.storeUUID = storeUUID;
    }

    public List<Photos> getPhotosList() {
        return photosList;
    }

    public void setPhotosList(List<Photos> photosList) {
        this.photosList = photosList;
    }

    public List<PriceAlter> getPriceAlterList() {
        return priceAlterList;
    }

    public void setPriceAlterList(List<PriceAlter> priceAlterList) {
        this.priceAlterList = priceAlterList;
    }
}

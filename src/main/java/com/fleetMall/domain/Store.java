package com.fleetMall.domain;

import com.fleetMall.domain.common.Photos;

import javax.persistence.*;
import java.util.List;

/**
 * Created by beila on 2017/4/8.
 */
@Entity
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    @Column(name = "store_name", length = 20)
    private String storeName;
    @Column(name = "store_owner_name", length = 20)
    private String storeOwnerName;
    @Column(name = "store_owner_telephone", length = 20)
    private String storeOwnerTelephone;
    @Column(name = "store_position_x", length = 20)
    private String storePostionX;
    @Column(name = "store_position_y", length = 20)
    private String storePostionY;

    @Transient
    private List<Photos> storePhotosList;
    @Transient
    private List<Commodity> commodityList;

    @Column(name = "is_delete", length = 20)
    private int isDelete;

    public Store() {
        setIsDelete(0);
    }

    public List<Commodity> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<Commodity> commodityList) {
        this.commodityList = commodityList;
    }

    public List<Photos> getStorePhotosList() {
        return storePhotosList;
    }

    public void setStorePhotosList(List<Photos> storePhotosList) {
        this.storePhotosList = storePhotosList;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreOwnerName() {
        return storeOwnerName;
    }

    public void setStoreOwnerName(String storeOwnerName) {
        this.storeOwnerName = storeOwnerName;
    }

    public String getStoreOwnerTelephone() {
        return storeOwnerTelephone;
    }

    public void setStoreOwnerTelephone(String storeOwnerTelephone) {
        this.storeOwnerTelephone = storeOwnerTelephone;
    }

    public String getStorePostionX() {
        return storePostionX;
    }

    public void setStorePostionX(String storePostionX) {
        this.storePostionX = storePostionX;
    }

    public String getStorePostionY() {
        return storePostionY;
    }

    public void setStorePostionY(String storePostionY) {
        this.storePostionY = storePostionY;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}

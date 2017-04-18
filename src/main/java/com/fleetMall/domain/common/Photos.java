package com.fleetMall.domain.common;

import com.oracle.jrockit.jfr.UseConstantPool;
import com.sun.xml.internal.ws.developer.UsesJAXBContext;

import javax.persistence.*;

/**
 * Created by beila on 2017/4/8.
 */
@Entity
@Table(name = "photos")
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    @Column(name = "photo_url", length = 100)
    private String photoUrl;
    @Column(name = "parent_uuid", length = 32)
    private String parentUUID;
    @Column(name = "is_delete", length = 2)
    private int isDelete;

    public Photos(){
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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getParentUUID() {
        return parentUUID;
    }

    public void setParentUUID(String parentUUID) {
        this.parentUUID = parentUUID;
    }
}

package com.fleetMall.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by beila on 2017/4/8.
 */
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    //    配置字段为LongText类型(2G)
    @Column(name = "message_content", length = 16777216)
    private String mesageContent;
    @Column(name = "message_date_time", length = 20)
    private String messageDateTime;
    @Column(name = "has_read", length = 2)
    private boolean hasRead;

    @Column(name = "sender_uuid", length = 32)
    private String senderUUID;
    @Column(name = "receiver_uuid", length = 32)
    private String receiverUUID;

    @Column(name = "isDelete", length = 2)
    private int isDelete;

    public Message() {
        setIsDelete(0);
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getMesageContent() {
        return mesageContent;
    }

    public void setMesageContent(String mesageContent) {
        this.mesageContent = mesageContent;
    }

    public String getMessageDateTime() {
        return messageDateTime;
    }

    public void setMessageDateTime(String messageDateTime) {
        this.messageDateTime = messageDateTime;
    }

    public boolean isHasRead() {
        return hasRead;
    }

    public void setHasRead(boolean hasRead) {
        this.hasRead = hasRead;
    }

    public String getSenderUUID() {
        return senderUUID;
    }

    public void setSenderUUID(String senderUUID) {
        this.senderUUID = senderUUID;
    }

    public String getReceiverUUID() {
        return receiverUUID;
    }

    public void setReceiverUUID(String receiverUUID) {
        this.receiverUUID = receiverUUID;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}

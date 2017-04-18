package com.fleetMall.domain;

import javax.persistence.*;

/**
 * Created by beila on 2017/4/8.
 */
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    @Column(name = "comment_user_name", length = 20)
    private String commentUserName;
    @Column(name = "comment_date_time", length = 20)
    private String commentDateTime;
    @Column(name = "comment_content", length = 100)
    private String commentContent;
    @Column(name = "commodity_uuid", length = 32)
    private String commodityUUID;

    @Column(name = "is_delete", length = 2)
    private int isDelete;

    public Comment(){
        setIsDelete(0);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCommentUserName() {
        return commentUserName;
    }

    public void setCommentUserName(String commentUserName) {
        this.commentUserName = commentUserName;
    }

    public String getCommentDateTime() {
        return commentDateTime;
    }

    public void setCommentDateTime(String commentDateTime) {
        this.commentDateTime = commentDateTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommodityUUID() {
        return commodityUUID;
    }

    public void setCommodityUUID(String commodityUUID) {
        this.commodityUUID = commodityUUID;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}



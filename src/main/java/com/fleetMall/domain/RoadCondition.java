package com.fleetMall.domain;

import com.fleetMall.domain.common.Photos;

import javax.persistence.*;
import java.util.List;

/**
 * Created by beila on 2017/4/8.
 */
@Entity
@Table(name = "road_condition")
public class RoadCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuid", length = 32, unique = true, nullable = false)
    private String uuid;
    @Column(name = "road_position_x", length = 20)
    private String roadPositonX;
    @Column(name = "road_position_y", length = 20)
    private String roadPostionY;
    @Column(name = "road_condition_title", length = 20)
    private String RoadConditionTitle;
    @Column(name = "road_condition_content", length = 100)
    private String RoadConditionContent;
    @Column(name = "road_condition_date_time", length = 20)
    private String roadConditionDateTime;
    @Column(name = "parent_uuid", length = 32)
    private String parentUUID;

    @Transient
    private List<Photos> photosList;

    @Column(name = "isDelete", length = 2)
    private int isDelete;

    public RoadCondition() {
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

    public String getRoadPositonX() {
        return roadPositonX;
    }

    public void setRoadPositonX(String roadPositonX) {
        this.roadPositonX = roadPositonX;
    }

    public String getRoadPostionY() {
        return roadPostionY;
    }

    public void setRoadPostionY(String roadPostionY) {
        this.roadPostionY = roadPostionY;
    }

    public String getRoadConditionTitle() {
        return RoadConditionTitle;
    }

    public void setRoadConditionTitle(String roadConditionTitle) {
        RoadConditionTitle = roadConditionTitle;
    }

    public String getRoadConditionContent() {
        return RoadConditionContent;
    }

    public void setRoadConditionContent(String roadConditionContent) {
        RoadConditionContent = roadConditionContent;
    }

    public String getRoadConditionDateTime() {
        return roadConditionDateTime;
    }

    public void setRoadConditionDateTime(String roadConditionDateTime) {
        this.roadConditionDateTime = roadConditionDateTime;
    }

    public String getParentUUID() {
        return parentUUID;
    }

    public void setParentUUID(String parentUUID) {
        this.parentUUID = parentUUID;
    }

    public List<Photos> getPhotosList() {
        return photosList;
    }

    public void setPhotosList(List<Photos> photosList) {
        this.photosList = photosList;
    }
}

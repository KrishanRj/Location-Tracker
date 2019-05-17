package com.interview.LocationTracker.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String latitude;
    private String longitude;
    private Date createdAt;

    public Location(){}

//    public Location(Integer id, String latitude, String longitude){
//        this.id = id;
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }
    @PrePersist
    protected void  onCreate(){
        this.setCreatedAt(new Date());
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

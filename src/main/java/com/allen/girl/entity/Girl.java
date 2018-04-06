package com.allen.girl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by allen on 2017/7/17.
 */
@Entity(name = "girl")
public class Girl {
    @Id
    @GeneratedValue
    private String id;
    @Column(name = "cup_size")
    private String cupSize;
    @Column(name = "age")
    private Integer age;

    public Girl() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

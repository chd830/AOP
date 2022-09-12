package com.aop.history;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.*;

@Entity
public class History {

    @Id
    @GeneratedValue
    private long idx;

    @Column
    private long userIdx;

    @Column
    private Date updateDate;

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public long getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(long userIdx) {
        this.userIdx = userIdx;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public History() {
    }

    public History(long idx) {
        this.idx = idx;
    }
}

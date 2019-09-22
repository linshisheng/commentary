package com.oppo.entity;

import java.io.Serializable;
import java.util.List;

public class BusinessList implements Serializable {
    private  boolean hasMore;
    private List<Business> data;

    public BusinessList() {
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<Business> getData() {
        return data;
    }

    public void setData(List<Business> data) {
        this.data = data;
    }
}

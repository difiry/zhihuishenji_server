package com.sj.base;

import java.io.Serializable;

/**
 * Created by chenguang on 2019/11/8.
 */
public abstract class BaseSearchBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String order = "create_time desc" ;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

}

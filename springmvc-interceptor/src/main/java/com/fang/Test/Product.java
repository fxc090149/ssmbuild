package com.fang.Test;

/**
 * 销售产品
 * @author lis
 */
public class Product {
    /** ID */
    private String id;
    /** 总价值 ,每个产品的价值为10W */
    private Integer totalAmount = 10000;
    public Product(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }
}
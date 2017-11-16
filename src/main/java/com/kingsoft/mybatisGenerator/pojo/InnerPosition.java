package com.kingsoft.mybatisGenerator.pojo;

import java.util.Date;

public class InnerPosition {
    private String entrustid;

    private String accountid;

    private String commodityno;

    private String outersessionid;

    private String buyorsell;

    private Integer orderqty;

    private Integer openqty;

    private Integer closeqty;

    private Date createtime;

    public String getEntrustid() {
        return entrustid;
    }

    public void setEntrustid(String entrustid) {
        this.entrustid = entrustid == null ? null : entrustid.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getCommodityno() {
        return commodityno;
    }

    public void setCommodityno(String commodityno) {
        this.commodityno = commodityno == null ? null : commodityno.trim();
    }

    public String getOutersessionid() {
        return outersessionid;
    }

    public void setOutersessionid(String outersessionid) {
        this.outersessionid = outersessionid == null ? null : outersessionid.trim();
    }

    public String getBuyorsell() {
        return buyorsell;
    }

    public void setBuyorsell(String buyorsell) {
        this.buyorsell = buyorsell == null ? null : buyorsell.trim();
    }

    public Integer getOrderqty() {
        return orderqty;
    }

    public void setOrderqty(Integer orderqty) {
        this.orderqty = orderqty;
    }

    public Integer getOpenqty() {
        return openqty;
    }

    public void setOpenqty(Integer openqty) {
        this.openqty = openqty;
    }

    public Integer getCloseqty() {
        return closeqty;
    }

    public void setCloseqty(Integer closeqty) {
        this.closeqty = closeqty;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
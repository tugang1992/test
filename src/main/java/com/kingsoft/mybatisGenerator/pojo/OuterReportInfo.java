package com.kingsoft.mybatisGenerator.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OuterReportInfo {
    private String accountid;

    private String sessionid;

    private Integer qty;

    private BigDecimal price;

    private String innerentrustid;

    private String outerentrustid;

    private String streamid;

    private String matchno;

    private String orderstate;

    private BigDecimal matchfee;

    private String interfacename;

    private Integer errorcode;

    private String errortext;

    private Date createtime;

    private String outermsg;

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getInnerentrustid() {
        return innerentrustid;
    }

    public void setInnerentrustid(String innerentrustid) {
        this.innerentrustid = innerentrustid == null ? null : innerentrustid.trim();
    }

    public String getOuterentrustid() {
        return outerentrustid;
    }

    public void setOuterentrustid(String outerentrustid) {
        this.outerentrustid = outerentrustid == null ? null : outerentrustid.trim();
    }

    public String getStreamid() {
        return streamid;
    }

    public void setStreamid(String streamid) {
        this.streamid = streamid == null ? null : streamid.trim();
    }

    public String getMatchno() {
        return matchno;
    }

    public void setMatchno(String matchno) {
        this.matchno = matchno == null ? null : matchno.trim();
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate == null ? null : orderstate.trim();
    }

    public BigDecimal getMatchfee() {
        return matchfee;
    }

    public void setMatchfee(BigDecimal matchfee) {
        this.matchfee = matchfee;
    }

    public String getInterfacename() {
        return interfacename;
    }

    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename == null ? null : interfacename.trim();
    }

    public Integer getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(Integer errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrortext() {
        return errortext;
    }

    public void setErrortext(String errortext) {
        this.errortext = errortext == null ? null : errortext.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getOutermsg() {
        return outermsg;
    }

    public void setOutermsg(String outermsg) {
        this.outermsg = outermsg == null ? null : outermsg.trim();
    }
}
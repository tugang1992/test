package com.kingsoft.mybatisGenerator.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class InnerEntrustInfo {
    private String exchangecode;

    private String tradeserverip;

    private String accountid;

    private String entrustid;

    private Integer entruststate;

    private Integer entrusttype;

    private Integer operatortype;

    private String buyorsell;

    private BigDecimal entrustprice;

    private Integer entrustqty;

    private Date entrusttime;

    private String relationentrustid;

    private String innercommodityno;

    private String outercommodityno;

    private String outercontractno;

    private BigDecimal currentexchangerate;

    private BigDecimal outerentrustprice;

    private String outersessionid;

    private String outerentrustid;

    private Integer outerretcode;

    private Date createtime;

    private String entrustmsg;

    public String getExchangecode() {
        return exchangecode;
    }

    public void setExchangecode(String exchangecode) {
        this.exchangecode = exchangecode == null ? null : exchangecode.trim();
    }

    public String getTradeserverip() {
        return tradeserverip;
    }

    public void setTradeserverip(String tradeserverip) {
        this.tradeserverip = tradeserverip == null ? null : tradeserverip.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getEntrustid() {
        return entrustid;
    }

    public void setEntrustid(String entrustid) {
        this.entrustid = entrustid == null ? null : entrustid.trim();
    }

    public Integer getEntruststate() {
        return entruststate;
    }

    public void setEntruststate(Integer entruststate) {
        this.entruststate = entruststate;
    }

    public Integer getEntrusttype() {
        return entrusttype;
    }

    public void setEntrusttype(Integer entrusttype) {
        this.entrusttype = entrusttype;
    }

    public Integer getOperatortype() {
        return operatortype;
    }

    public void setOperatortype(Integer operatortype) {
        this.operatortype = operatortype;
    }

    public String getBuyorsell() {
        return buyorsell;
    }

    public void setBuyorsell(String buyorsell) {
        this.buyorsell = buyorsell == null ? null : buyorsell.trim();
    }

    public BigDecimal getEntrustprice() {
        return entrustprice;
    }

    public void setEntrustprice(BigDecimal entrustprice) {
        this.entrustprice = entrustprice;
    }

    public Integer getEntrustqty() {
        return entrustqty;
    }

    public void setEntrustqty(Integer entrustqty) {
        this.entrustqty = entrustqty;
    }

    public Date getEntrusttime() {
        return entrusttime;
    }

    public void setEntrusttime(Date entrusttime) {
        this.entrusttime = entrusttime;
    }

    public String getRelationentrustid() {
        return relationentrustid;
    }

    public void setRelationentrustid(String relationentrustid) {
        this.relationentrustid = relationentrustid == null ? null : relationentrustid.trim();
    }

    public String getInnercommodityno() {
        return innercommodityno;
    }

    public void setInnercommodityno(String innercommodityno) {
        this.innercommodityno = innercommodityno == null ? null : innercommodityno.trim();
    }

    public String getOutercommodityno() {
        return outercommodityno;
    }

    public void setOutercommodityno(String outercommodityno) {
        this.outercommodityno = outercommodityno == null ? null : outercommodityno.trim();
    }

    public String getOutercontractno() {
        return outercontractno;
    }

    public void setOutercontractno(String outercontractno) {
        this.outercontractno = outercontractno == null ? null : outercontractno.trim();
    }

    public BigDecimal getCurrentexchangerate() {
        return currentexchangerate;
    }

    public void setCurrentexchangerate(BigDecimal currentexchangerate) {
        this.currentexchangerate = currentexchangerate;
    }

    public BigDecimal getOuterentrustprice() {
        return outerentrustprice;
    }

    public void setOuterentrustprice(BigDecimal outerentrustprice) {
        this.outerentrustprice = outerentrustprice;
    }

    public String getOutersessionid() {
        return outersessionid;
    }

    public void setOutersessionid(String outersessionid) {
        this.outersessionid = outersessionid == null ? null : outersessionid.trim();
    }

    public String getOuterentrustid() {
        return outerentrustid;
    }

    public void setOuterentrustid(String outerentrustid) {
        this.outerentrustid = outerentrustid == null ? null : outerentrustid.trim();
    }

    public Integer getOuterretcode() {
        return outerretcode;
    }

    public void setOuterretcode(Integer outerretcode) {
        this.outerretcode = outerretcode;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getEntrustmsg() {
        return entrustmsg;
    }

    public void setEntrustmsg(String entrustmsg) {
        this.entrustmsg = entrustmsg == null ? null : entrustmsg.trim();
    }
}
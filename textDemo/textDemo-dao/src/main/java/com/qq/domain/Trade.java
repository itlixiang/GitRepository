package com.qq.domain;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 666
 * @Date: 2019/6/26
 * @Time: 20:23
 */

public class Trade {

    private int id;
    private String accountID;
    private String tradeType;
    private double tradeMoney;
    private Date tradeTime;
    private String tradeDigest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public double getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(double tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeDigest() {
        return tradeDigest;
    }

    public void setTradeDigest(String tradeDigest) {
        this.tradeDigest = tradeDigest;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", accountID='" + accountID + '\'' +
                ", tradeType='" + tradeType + '\'' +
                ", tradeMoney=" + tradeMoney +
                ", tradeTime=" + tradeTime +
                ", tradeDigest='" + tradeDigest + '\'' +
                '}';
    }
}

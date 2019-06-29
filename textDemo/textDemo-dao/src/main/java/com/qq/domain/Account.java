package com.qq.domain;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 666
 * @Date: 2019/6/26
 * @Time: 20:19
 */

public class Account {

    private String accountID;
    private String password;
    private double remaining;

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRemaining() {
        return remaining;
    }

    public void setRemaining(double remaining) {
        this.remaining = remaining;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID='" + accountID + '\'' +
                ", password='" + password + '\'' +
                ", remaining=" + remaining +
                '}';
    }
}

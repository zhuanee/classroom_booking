package com.network.booking.entities;

public class BillProvider extends Bill{
    private String providerName;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public String toString() {
        return "BillProvider{" +
                "bid=" + getBid() +
                ", billCode='" + getBillCode() + '\'' +
                ", billName='" + getBillName() + '\'' +
                ", billCom='" + getBillCom() + '\'' +
                ", billNum=" + getBillNum() +
                ", money=" + getMoney() +
                ", pid=" + getPid() +
                ", pay=" + getPay() +
                ", createDate=" + getCreateDate() +
                ", providerName=" + providerName +
                '}';
    }
}

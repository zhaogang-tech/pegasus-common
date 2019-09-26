package cn.tmxk.pegasuscommon.pojo;

import java.io.Serializable;

public class Send_type implements Serializable {
    private int senttype_id;//寄件类型id
    private String sendtype_name;//寄件类型名称
    private double rate;//寄件运费费率


    public Send_type() {
    }

    public Send_type(int senttype_id, String sendtype_name, double rate) {
        this.senttype_id = senttype_id;
        this.sendtype_name = sendtype_name;
        this.rate = rate;
    }

    public int getSenttype_id() {
        return senttype_id;
    }

    public void setSenttype_id(int senttype_id) {
        this.senttype_id = senttype_id;
    }

    public String getSendtype_name() {
        return sendtype_name;
    }

    public void setSendtype_name(String sendtype_name) {
        this.sendtype_name = sendtype_name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

package cn.tmxk.pegasuscommon.pojo;

import java.io.Serializable;

public class Worker implements Serializable {
    private int wo_id;//员工ID
    private String wo_num;//员工工号
    private String wo_name;//员工姓名
    private int wo_sex;//员工性别
    private String wo_address;//家庭住址
    private String wo_phone;//联系电话
    private String wo_identifyCard;//身份证号
    private int wt_id;//工种类型
    private int pid;//省区ID
    private int cid;//大区ID
    private int hid;//营业厅ID

    public Worker() {
    }

    public int getWo_id() {
        return wo_id;
    }

    public void setWo_id(int wo_id) {
        this.wo_id = wo_id;
    }

    public String getWo_num() {
        return wo_num;
    }

    public void setWo_num(String wo_num) {
        this.wo_num = wo_num;
    }

    public String getWo_name() {
        return wo_name;
    }

    public void setWo_name(String wo_name) {
        this.wo_name = wo_name;
    }

    public int getWo_sex() {
        return wo_sex;
    }

    public void setWo_sex(int wo_sex) {
        this.wo_sex = wo_sex;
    }

    public String getWo_address() {
        return wo_address;
    }

    public void setWo_address(String wo_address) {
        this.wo_address = wo_address;
    }

    public String getWo_phone() {
        return wo_phone;
    }

    public void setWo_phone(String wo_phone) {
        this.wo_phone = wo_phone;
    }

    public String getWo_identifyCard() {
        return wo_identifyCard;
    }

    public void setWo_identifyCard(String wo_identifyCard) {
        this.wo_identifyCard = wo_identifyCard;
    }

    public int getWt_id() {
        return wt_id;
    }

    public void setWt_id(int wt_id) {
        this.wt_id = wt_id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }
}

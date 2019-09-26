package cn.tmxk.pegasuscommon.pojo;

import java.io.Serializable;

public class Worktype implements Serializable{
    private int wt_id;//工种id
    private String wt_name;//工种名称

    public Worktype() {
    }

    public Worktype(int wt_id, String wt_name) {
        this.wt_id = wt_id;
        this.wt_name = wt_name;
    }

    public int getWt_id() {
        return wt_id;
    }

    public void setWt_id(int wt_id) {
        this.wt_id = wt_id;
    }

    public String getWt_name() {
        return wt_name;
    }

    public void setWt_name(String wt_name) {
        this.wt_name = wt_name;
    }
}

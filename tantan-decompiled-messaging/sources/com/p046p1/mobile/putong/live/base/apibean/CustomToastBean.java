package com.p046p1.mobile.putong.live.base.apibean;

/* JADX INFO: loaded from: classes13.dex */
public class CustomToastBean {
    private String color;
    private String content;
    private int count;
    private int displayTime;
    private String eid;
    private String icon;
    private String pid;

    public String getColor() {
        return this.color;
    }

    public String getContent() {
        return this.content;
    }

    public int getCount() {
        return this.count;
    }

    public int getDisplayTime() {
        int i = this.displayTime;
        return i < 500 ? i * 1000 : i;
    }

    public String getEid() {
        return this.eid;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getPid() {
        return this.pid;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setDisplayTime(int i) {
        this.displayTime = i;
    }

    public void setEid(String str) {
        this.eid = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setPid(String str) {
        this.pid = str;
    }

    public String toString() {
        return "CustomToastBean{content='" + this.content + "', count=" + this.count + ", icon='" + this.icon + "', displayTime=" + this.displayTime + ", color='" + this.color + "', pid='" + this.pid + "', eid='" + this.eid + "'}";
    }
}

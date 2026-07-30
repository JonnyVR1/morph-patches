package com.tencent.could.huiyansdk.operate;

/* JADX INFO: loaded from: classes12.dex */
public class CloudOperateItem {
    public String action;
    public int done = 0;
    public long value = 0;
    public String info = "";
    public long timestamp = 0;

    public CloudOperateItem(String str) {
        this.action = str;
    }

    public String getAction() {
        return this.action;
    }

    public int getDone() {
        return this.done;
    }

    public String getInfo() {
        return this.info;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public long getValue() {
        return this.value;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setDone(int i) {
        this.done = i;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public void updateInfo(int i, long j, long j2) {
        this.done = i;
        this.value = j;
        this.timestamp = j2;
    }
}

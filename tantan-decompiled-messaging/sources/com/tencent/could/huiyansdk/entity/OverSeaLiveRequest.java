package com.tencent.could.huiyansdk.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class OverSeaLiveRequest {
    public int platform = 2;

    @SerializedName("select_data")
    public String selectData = "";

    public int getPlatform() {
        return this.platform;
    }

    public String getSelectData() {
        return this.selectData;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setSelectData(String str) {
        this.selectData = str;
    }

    public String toString() {
        return "OverSeaLiveRequest{platform=" + this.platform + ", selectData='" + this.selectData + "'}";
    }
}

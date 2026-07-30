package com.tencent.could.huiyansdk.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class OverSeaResult {

    @SerializedName("validateData")
    public String validateData = "";

    public String getValidateData() {
        return this.validateData;
    }

    public void setValidateData(String str) {
        this.validateData = str;
    }

    public String toString() {
        return "OverSeaResult{validateData='" + this.validateData + "'}";
    }
}

package com.tencent.could.huiyansdk.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class LiveTypeResult {

    @SerializedName("action_data")
    public String actionData;

    @SerializedName("colorData")
    public String colorData;

    @SerializedName("errorcode")
    public int errorCode = 210;

    @SerializedName("errormsg")
    public String errorMsg;

    @SerializedName("select_data")
    public String selectData;

    public String getActionData() {
        return this.actionData;
    }

    public String getColorData() {
        return this.colorData;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getSelectData() {
        return this.selectData;
    }

    public void setActionData(String str) {
        this.actionData = str;
    }

    public void setColorData(String str) {
        this.colorData = str;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setSelectData(String str) {
        this.selectData = str;
    }

    public String toString() {
        return "LiveTypeResult{errorcode=" + this.errorCode + ", errormsg='" + this.errorMsg + "', colorData='" + this.colorData + "', action_data='" + this.actionData + "', select_data='" + this.selectData + "'}";
    }
}

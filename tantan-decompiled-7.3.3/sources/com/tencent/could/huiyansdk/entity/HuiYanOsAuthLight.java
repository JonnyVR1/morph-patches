package com.tencent.could.huiyansdk.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class HuiYanOsAuthLight {
    public int code = -1;
    public Data data;
    public String message;

    public class Data {

        @SerializedName("LightData")
        public String lightData;

        public Data() {
        }

        public String getLightData() {
            return this.lightData;
        }

        public void setLightData(String str) {
            this.lightData = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public Data getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}

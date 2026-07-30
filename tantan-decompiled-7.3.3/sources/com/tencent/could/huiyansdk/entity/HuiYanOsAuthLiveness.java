package com.tencent.could.huiyansdk.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class HuiYanOsAuthLiveness {
    public int code = -1;
    public Data data;
    public String message;

    public class Data {

        @SerializedName("BestFrame")
        public String bestFrame;

        @SerializedName("ResultCode")
        public String resultCode;

        public Data() {
        }

        public String getBestFrame() {
            return this.bestFrame;
        }

        public String getResultCode() {
            return this.resultCode;
        }

        public void setBestFrame(String str) {
            this.bestFrame = str;
        }

        public void setResultCode(String str) {
            this.resultCode = str;
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

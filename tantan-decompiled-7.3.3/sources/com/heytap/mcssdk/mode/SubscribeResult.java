package com.heytap.mcssdk.mode;

/* JADX INFO: loaded from: classes7.dex */
public class SubscribeResult {
    private String mContent;
    private String mSubscribeId;

    public String getContent() {
        return this.mContent;
    }

    public String getSubscribeId() {
        return this.mSubscribeId;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setSubscribeId(String str) {
        this.mSubscribeId = str;
    }

    public String toString() {
        return "SubscribeResult{mSubscribeId='" + this.mSubscribeId + "', mContent='" + this.mContent + "'}";
    }
}

package com.tencent.could.huiyansdk.entity;

/* JADX INFO: loaded from: classes12.dex */
public class CustomerTokenEntity {
    public long createTime;
    public String faceIdToken;
    public boolean isSuccess;

    public CustomerTokenEntity(boolean z, String str) {
        this.createTime = -1L;
        this.isSuccess = z;
        this.faceIdToken = str;
        this.createTime = System.currentTimeMillis();
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getFaceIdToken() {
        return this.faceIdToken;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void reset() {
        this.isSuccess = false;
        this.faceIdToken = "";
        this.createTime = -1L;
    }

    public void updateTokenEntity(boolean z, String str) {
        this.isSuccess = z;
        this.faceIdToken = str;
        this.createTime = System.currentTimeMillis();
    }
}

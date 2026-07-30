package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class HonorPushDataMsg {

    /* JADX INFO: renamed from: a */
    public int f12576a = 1;

    /* JADX INFO: renamed from: b */
    public int f12577b = 0;

    /* JADX INFO: renamed from: c */
    public long f12578c;

    /* JADX INFO: renamed from: d */
    public String f12579d;

    public String getData() {
        return this.f12579d;
    }

    public long getMsgId() {
        return this.f12578c;
    }

    public int getType() {
        return this.f12577b;
    }

    public int getVersion() {
        return this.f12576a;
    }

    public void setData(String str) {
        this.f12579d = str;
    }

    public void setMsgId(long j) {
        this.f12578c = j;
    }

    public void setType(int i) {
        this.f12577b = i;
    }

    public void setVersion(int i) {
        this.f12576a = i;
    }
}

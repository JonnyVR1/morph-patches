package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class HonorPushDataMsg {

    /* JADX INFO: renamed from: a */
    public int f11835a = 1;

    /* JADX INFO: renamed from: b */
    public int f11836b = 0;

    /* JADX INFO: renamed from: c */
    public long f11837c;

    /* JADX INFO: renamed from: d */
    public String f11838d;

    public String getData() {
        return this.f11838d;
    }

    public long getMsgId() {
        return this.f11837c;
    }

    public int getType() {
        return this.f11836b;
    }

    public int getVersion() {
        return this.f11835a;
    }

    public void setData(String str) {
        this.f11838d = str;
    }

    public void setMsgId(long j) {
        this.f11837c = j;
    }

    public void setType(int i) {
        this.f11836b = i;
    }

    public void setVersion(int i) {
        this.f11835a = i;
    }
}

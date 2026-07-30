package com.tencent.could.component.common.p079ai.net;

/* JADX INFO: loaded from: classes2.dex */
public class DnsCacheInfo {

    /* JADX INFO: renamed from: a */
    public String f57281a;

    /* JADX INFO: renamed from: b */
    public String f57282b;

    /* JADX INFO: renamed from: c */
    public long f57283c;

    public DnsCacheInfo(String str, String str2, long j) {
        this.f57281a = str;
        this.f57282b = str2;
        this.f57283c = j;
    }

    public String getHostName() {
        return this.f57281a;
    }

    public String getIp() {
        return this.f57282b;
    }

    public long getRefreshTime() {
        return this.f57283c;
    }

    public void setHostName(String str) {
        this.f57281a = str;
    }

    public void setIp(String str) {
        this.f57282b = str;
    }

    public void setRefreshTime(long j) {
        this.f57283c = j;
    }

    public String toString() {
        return "DnsCacheInfo{hostName='" + this.f57281a + "', ip='" + this.f57282b + "', refreshTime=" + this.f57283c + '}';
    }
}

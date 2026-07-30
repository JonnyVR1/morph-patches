package com.tencent.could.component.common.p084ai.net;

/* JADX INFO: loaded from: classes12.dex */
public class DnsCacheInfo {

    /* JADX INFO: renamed from: a */
    public String f58129a;

    /* JADX INFO: renamed from: b */
    public String f58130b;

    /* JADX INFO: renamed from: c */
    public long f58131c;

    public DnsCacheInfo(String str, String str2, long j) {
        this.f58129a = str;
        this.f58130b = str2;
        this.f58131c = j;
    }

    public String getHostName() {
        return this.f58129a;
    }

    public String getIp() {
        return this.f58130b;
    }

    public long getRefreshTime() {
        return this.f58131c;
    }

    public void setHostName(String str) {
        this.f58129a = str;
    }

    public void setIp(String str) {
        this.f58130b = str;
    }

    public void setRefreshTime(long j) {
        this.f58131c = j;
    }

    public String toString() {
        return "DnsCacheInfo{hostName='" + this.f58129a + "', ip='" + this.f58130b + "', refreshTime=" + this.f58131c + '}';
    }
}

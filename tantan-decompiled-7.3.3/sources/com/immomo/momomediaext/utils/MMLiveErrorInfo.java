package com.immomo.momomediaext.utils;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveErrorInfo {
    public String errMsg;
    public int extra;
    public long uid;
    public int what;

    public MMLiveErrorInfo(int i, int i2, String str) {
        this.what = i;
        this.extra = i2;
        this.errMsg = str;
    }

    public String toString() {
        return "MMLiveErrorInfo{what=" + this.what + ", extra=" + this.extra + ", errMsg='" + this.errMsg + "', uid=" + this.uid + '}';
    }
}

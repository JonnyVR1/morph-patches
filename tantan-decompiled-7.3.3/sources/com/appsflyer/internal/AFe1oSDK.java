package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFe1oSDK {
    public final long AFAdRevenueData;

    public AFe1oSDK(long j) {
        this.AFAdRevenueData = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFAdRevenueData == ((AFe1oSDK) obj).AFAdRevenueData;
    }

    public int hashCode() {
        long j = this.AFAdRevenueData;
        return (int) (j ^ (j >>> 32));
    }
}

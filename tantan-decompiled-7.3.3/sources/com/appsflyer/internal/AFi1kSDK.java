package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1kSDK {
    public final long AFAdRevenueData;

    @Nullable
    public final String getMediationNetwork;

    @Nullable
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1kSDK(long j, long j2, @Nullable String str, @Nullable String str2) {
        this.AFAdRevenueData = j;
        this.getRevenue = j2;
        this.getMediationNetwork = str;
        this.getMonetizationNetwork = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1kSDK)) {
            return false;
        }
        AFi1kSDK aFi1kSDK = (AFi1kSDK) obj;
        return this.AFAdRevenueData == aFi1kSDK.AFAdRevenueData && this.getRevenue == aFi1kSDK.getRevenue && Intrinsics.m88377d(this.getMediationNetwork, aFi1kSDK.getMediationNetwork) && Intrinsics.m88377d(this.getMonetizationNetwork, aFi1kSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        int iHashCode = ((Long.hashCode(this.AFAdRevenueData) * 31) + Long.hashCode(this.getRevenue)) * 31;
        String str = this.getMediationNetwork;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMonetizationNetwork;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayIntegrityApiData(piaTimestamp=");
        sb.append(this.AFAdRevenueData);
        sb.append(", ttrMillis=");
        sb.append(this.getRevenue);
        sb.append(", piaToken=");
        sb.append(this.getMediationNetwork);
        sb.append(", errorCode=");
        sb.append(this.getMonetizationNetwork);
        sb.append(')');
        return sb.toString();
    }
}

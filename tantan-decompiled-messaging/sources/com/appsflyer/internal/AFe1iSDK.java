package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1iSDK {

    @NotNull
    final String AFAdRevenueData;

    @NotNull
    final String getRevenue;

    public AFe1iSDK(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.AFAdRevenueData = str;
        this.getRevenue = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1iSDK)) {
            return false;
        }
        AFe1iSDK aFe1iSDK = (AFe1iSDK) obj;
        return Intrinsics.m87488d(this.AFAdRevenueData, aFe1iSDK.AFAdRevenueData) && Intrinsics.m87488d(this.getRevenue, aFe1iSDK.getRevenue);
    }

    public final int hashCode() {
        return (this.AFAdRevenueData.hashCode() * 31) + this.getRevenue.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HostConfig(prefix=");
        sb.append(this.AFAdRevenueData);
        sb.append(", host=");
        sb.append(this.getRevenue);
        sb.append(')');
        return sb.toString();
    }
}

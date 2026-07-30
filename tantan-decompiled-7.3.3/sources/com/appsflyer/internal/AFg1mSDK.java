package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1mSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1mSDK(int i, int i2, int i3, int i4, @NotNull String str) {
        str.getClass();
        this.getMonetizationNetwork = i;
        this.AFAdRevenueData = i2;
        this.getRevenue = i3;
        this.getCurrencyIso4217Code = i4;
        this.getMediationNetwork = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1mSDK)) {
            return false;
        }
        AFg1mSDK aFg1mSDK = (AFg1mSDK) obj;
        return this.getMonetizationNetwork == aFg1mSDK.getMonetizationNetwork && this.AFAdRevenueData == aFg1mSDK.AFAdRevenueData && this.getRevenue == aFg1mSDK.getRevenue && this.getCurrencyIso4217Code == aFg1mSDK.getCurrencyIso4217Code && Intrinsics.m88377d(this.getMediationNetwork, aFg1mSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.getMonetizationNetwork) * 31) + Integer.hashCode(this.AFAdRevenueData)) * 31) + Integer.hashCode(this.getRevenue)) * 31) + Integer.hashCode(this.getCurrencyIso4217Code)) * 31) + this.getMediationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CmpTcfData(policyVersion=");
        sb.append(this.getMonetizationNetwork);
        sb.append(", gdprApplies=");
        sb.append(this.AFAdRevenueData);
        sb.append(", cmpSdkId=");
        sb.append(this.getRevenue);
        sb.append(", cmpSdkVersion=");
        sb.append(this.getCurrencyIso4217Code);
        sb.append(", tcString=");
        sb.append(this.getMediationNetwork);
        sb.append(')');
        return sb.toString();
    }
}

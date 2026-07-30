package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1dSDK {
    public final long AFAdRevenueData;

    @Nullable
    public final Throwable areAllFieldsValid;

    @Nullable
    public final String component1;

    @Nullable
    public final AFi1uSDK component2;
    public final long getCurrencyIso4217Code;

    @Nullable
    public final String getMediationNetwork;

    @NonNull
    public final String getMonetizationNetwork;
    public final int getRevenue;

    public AFh1dSDK(@Nullable String str, @NonNull String str2, long j, long j2, int i, @Nullable AFi1uSDK aFi1uSDK, @Nullable String str3, Throwable th) {
        this.getMediationNetwork = str;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = j;
        this.AFAdRevenueData = j2;
        this.getRevenue = i;
        this.component2 = aFi1uSDK;
        this.component1 = str3;
        this.areAllFieldsValid = th;
    }
}

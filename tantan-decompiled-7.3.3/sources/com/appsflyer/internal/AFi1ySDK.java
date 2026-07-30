package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1ySDK {

    @NotNull
    public final String AFAdRevenueData;

    @Nullable
    public final String getCurrencyIso4217Code;
    private final boolean getMonetizationNetwork;

    @Nullable
    public final String getRevenue;

    public AFi1ySDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z) {
        str.getClass();
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = str2;
        this.getRevenue = str3;
        this.getMonetizationNetwork = z;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getMonetizationNetwork;
    }
}

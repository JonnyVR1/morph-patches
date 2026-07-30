package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1tSDK extends AFh1ySDK {

    @NotNull
    private final AFd1fSDK AFAdRevenueData;
    private final boolean getCurrencyIso4217Code;

    public AFh1tSDK(@NotNull AFd1fSDK aFd1fSDK) {
        aFd1fSDK.getClass();
        this.AFAdRevenueData = aFd1fSDK;
        this.getCurrencyIso4217Code = true;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: d */
    public final void mo5192d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.AFAdRevenueData.copydefault().getMediationNetwork("D", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: e */
    public final void mo5193e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z4) {
            this.AFAdRevenueData.copydefault().getMediationNetwork("E", getMonetizationNetwork(str, aFg1cSDK));
        }
        if (z4) {
            this.AFAdRevenueData.copydefault().getMonetizationNetwork(th);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        this.AFAdRevenueData.copydefault().getMediationNetwork("F", getMonetizationNetwork(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: i */
    public final void mo5194i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.AFAdRevenueData.copydefault().getMediationNetwork("I", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: v */
    public final void mo5195v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.AFAdRevenueData.copydefault().getMediationNetwork(p7f.GPS_MEASUREMENT_INTERRUPTED, getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: w */
    public final void mo5196w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z) {
            this.AFAdRevenueData.copydefault().getMediationNetwork("W", getMonetizationNetwork(str, aFg1cSDK));
        }
    }
}

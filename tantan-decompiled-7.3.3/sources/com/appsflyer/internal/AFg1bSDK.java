package com.appsflyer.internal;

import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1bSDK extends AFh1ySDK {

    @NotNull
    private final AFd1fSDK getMediationNetwork;

    public AFg1bSDK(@NotNull AFd1fSDK aFd1fSDK) {
        aFd1fSDK.getClass();
        this.getMediationNetwork = aFd1fSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    /* JADX INFO: renamed from: e */
    public final void mo5193e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z3) {
            if (StringsKt.m94329e0(str)) {
                str = "missing label";
            }
            this.getMediationNetwork.afDebugLog().AFAdRevenueData(th, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}

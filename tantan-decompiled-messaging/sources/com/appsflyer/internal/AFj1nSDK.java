package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1nSDK implements AFj1lSDK {
    @Override // com.appsflyer.internal.AFj1lSDK
    @NotNull
    public final String AFAdRevenueData(@NotNull String str) {
        str.getClass();
        return String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName());
    }
}

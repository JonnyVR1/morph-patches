package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFi1hSDK extends AFj1zSDK {
    private AFd1pSDK getCurrencyIso4217Code;

    public AFi1hSDK(String str, String str2, AFd1pSDK aFd1pSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.getCurrencyIso4217Code = aFd1pSDK;
    }

    public final boolean getMonetizationNetwork() {
        if (this.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
        return false;
    }
}

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1wSDK implements AFh1vSDK {

    @Nullable
    private AFg1bSDK AFAdRevenueData;

    @Nullable
    private AFg1aSDK getCurrencyIso4217Code;

    @Nullable
    private AFh1tSDK getMediationNetwork;

    @NotNull
    private final AFd1fSDK getRevenue;

    public AFh1wSDK(@NotNull AFd1fSDK aFd1fSDK) {
        aFd1fSDK.getClass();
        this.getRevenue = aFd1fSDK;
    }

    @Override // com.appsflyer.internal.AFh1vSDK
    public final void AFAdRevenueData() {
        AFg1bSDK aFg1bSDK = this.AFAdRevenueData;
        if (aFg1bSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK.v$default(aFLogger, AFg1cSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1bSDK);
            this.AFAdRevenueData = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1vSDK
    public final void component1() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getCurrencyIso4217Code == null) {
            this.getCurrencyIso4217Code = new AFg1aSDK();
        }
        AFg1aSDK aFg1aSDK = this.getCurrencyIso4217Code;
        aFg1aSDK.getClass();
        aFLogger.registerClient(aFg1aSDK);
    }

    @Override // com.appsflyer.internal.AFh1vSDK
    public final void getCurrencyIso4217Code() {
        AFh1tSDK aFh1tSDK = this.getMediationNetwork;
        if (aFh1tSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFh1tSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1vSDK
    public final void getMediationNetwork() {
        AFg1aSDK aFg1aSDK = this.getCurrencyIso4217Code;
        if (aFg1aSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1ySDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1aSDK);
            this.getCurrencyIso4217Code = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1vSDK
    public final void getMonetizationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFh1tSDK(this.getRevenue);
        }
        AFh1tSDK aFh1tSDK = this.getMediationNetwork;
        aFh1tSDK.getClass();
        aFLogger.registerClient(aFh1tSDK);
    }

    @Override // com.appsflyer.internal.AFh1vSDK
    public final void getRevenue() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.AFAdRevenueData == null) {
            this.AFAdRevenueData = new AFg1bSDK(this.getRevenue);
        }
        AFg1bSDK aFg1bSDK = this.AFAdRevenueData;
        aFg1bSDK.getClass();
        aFLogger.registerClient(aFg1bSDK);
    }
}

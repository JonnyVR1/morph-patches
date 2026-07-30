package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK.RunnableC09555;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1wSDK implements AFe1eSDK {
    private final Object AFAdRevenueData = new Object();
    private final AFg1vSDK areAllFieldsValid;
    private final AFe1aSDK component1;
    private final AFe1sSDK component2;

    @Nullable
    private AFh1dSDK component3;

    @Nullable
    private AFg1zSDK component4;
    private final AFd1pSDK getCurrencyIso4217Code;
    private final AFg1rSDK getMediationNetwork;
    private final AFg1xSDK getMonetizationNetwork;
    public final AFg1tSDK getRevenue;

    public AFg1wSDK(AFg1xSDK aFg1xSDK, AFd1pSDK aFd1pSDK, AFg1rSDK aFg1rSDK, AFg1tSDK aFg1tSDK, AFe1sSDK aFe1sSDK, AFg1vSDK aFg1vSDK, AFe1aSDK aFe1aSDK) {
        this.getMonetizationNetwork = aFg1xSDK;
        this.getCurrencyIso4217Code = aFd1pSDK;
        this.getMediationNetwork = aFg1rSDK;
        this.getRevenue = aFg1tSDK;
        this.component2 = aFe1sSDK;
        this.areAllFieldsValid = aFg1vSDK;
        this.component1 = aFe1aSDK;
        aFe1aSDK.getCurrencyIso4217Code.add(this);
    }

    private void getMediationNetwork(@NonNull AFg1zSDK aFg1zSDK, @Nullable AFg1ySDK aFg1ySDK) {
        synchronized (this.AFAdRevenueData) {
            this.component4 = aFg1zSDK;
        }
        if (aFg1ySDK != null) {
            aFg1ySDK.onRemoteConfigUpdateFinished(aFg1zSDK);
        }
    }

    public final void getCurrencyIso4217Code(@Nullable AFg1ySDK aFg1ySDK) {
        AFf1aSDK aFf1aSDK = new AFf1aSDK(this.getMonetizationNetwork, this.getCurrencyIso4217Code, this.getMediationNetwork, this.getRevenue, this.component2, this.areAllFieldsValid, "v1", aFg1ySDK);
        AFe1aSDK aFe1aSDK = this.component1;
        aFe1aSDK.AFAdRevenueData.execute(aFe1aSDK.new RunnableC09555(aFf1aSDK));
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void getMonetizationNetwork(AFf1wSDK<?> aFf1wSDK, AFe1dSDK aFe1dSDK) {
        if (aFf1wSDK instanceof AFf1aSDK) {
            AFf1aSDK aFf1aSDK = (AFf1aSDK) aFf1wSDK;
            AFg1zSDK aFg1zSDK = aFf1aSDK.areAllFieldsValid;
            if (aFg1zSDK == null) {
                AFLogger.INSTANCE.m5247w(AFg1cSDK.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFg1zSDK = AFg1zSDK.FAILURE;
            }
            if (aFg1zSDK != AFg1zSDK.USE_CACHED) {
                AFh1dSDK aFh1dSDK = aFf1aSDK.component4;
                synchronized (this.AFAdRevenueData) {
                    this.component3 = aFh1dSDK;
                }
            }
            getMediationNetwork(aFg1zSDK, aFf1aSDK.component1);
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void getCurrencyIso4217Code(AFf1wSDK<?> aFf1wSDK) {
    }

    @Nullable
    public final AFh1dSDK getCurrencyIso4217Code() {
        AFh1dSDK aFh1dSDK;
        synchronized (this.AFAdRevenueData) {
            aFh1dSDK = this.component3;
            this.component3 = null;
        }
        return aFh1dSDK;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void getMonetizationNetwork(AFf1wSDK<?> aFf1wSDK) {
        if (aFf1wSDK instanceof AFf1aSDK) {
            AFf1aSDK aFf1aSDK = (AFf1aSDK) aFf1wSDK;
            synchronized (this.AFAdRevenueData) {
                this.component3 = null;
            }
            getMediationNetwork(AFg1zSDK.FAILURE, aFf1aSDK.component1);
        }
    }
}

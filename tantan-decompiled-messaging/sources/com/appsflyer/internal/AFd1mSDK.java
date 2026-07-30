package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1mSDK {

    @Nullable
    public String AFAdRevenueData;

    @Nullable
    public AFe1oSDK areAllFieldsValid;

    @Nullable
    public AppsFlyerConsent component2;
    public boolean component3;

    @Nullable
    public AFh1pSDK component4;

    @Nullable
    public String getCurrencyIso4217Code;

    @Nullable
    public AFc1bSDK getMediationNetwork;

    @Nullable
    public AFd1uSDK getMonetizationNetwork;

    @Nullable
    public String getRevenue;

    public final synchronized void getMonetizationNetwork(@Nullable AFe1oSDK aFe1oSDK) {
        this.areAllFieldsValid = aFe1oSDK;
    }

    public final boolean getRevenue() {
        return this.component3;
    }
}

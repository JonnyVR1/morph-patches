package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1iSDK extends AFh1hSDK {
    public AFh1iSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.PURCHASE_VALIDATE;
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFa1mSDK getMonetizationNetwork(String str) {
        return super.getMonetizationNetwork(AFa1mSDK.AFAdRevenueData(str));
    }
}

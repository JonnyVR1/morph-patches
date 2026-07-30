package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1mSDK extends AFa1mSDK {
    @Override // com.appsflyer.internal.AFa1mSDK
    public final boolean component3() {
        return true;
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return this.areAllFieldsValid == 1 ? AFf1zSDK.CONVERSION : AFf1zSDK.LAUNCH;
    }
}

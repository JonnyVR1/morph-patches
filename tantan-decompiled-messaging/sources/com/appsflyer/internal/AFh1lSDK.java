package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1lSDK extends AFa1mSDK {

    @Nullable
    public final AFf1zSDK copydefault;

    public AFh1lSDK(String str, byte[] bArr, String str2, @Nullable AFf1zSDK aFf1zSDK) {
        super(null, str, Boolean.FALSE);
        this.getMediationNetwork = str2;
        getCurrencyIso4217Code(bArr);
        this.copydefault = aFf1zSDK;
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        AFf1zSDK aFf1zSDK = this.copydefault;
        return aFf1zSDK != null ? aFf1zSDK : AFf1zSDK.CACHED_EVENT;
    }

    @Deprecated
    public AFh1lSDK() {
        this.copydefault = null;
    }
}

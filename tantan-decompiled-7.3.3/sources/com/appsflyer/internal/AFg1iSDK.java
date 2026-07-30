package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1iSDK extends AFa1mSDK {
    @SuppressLint({"VisibleForTests"})
    public AFg1iSDK(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFg1lSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName()));
        sb.append(context.getPackageName());
        super("Register", sb.toString(), Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final boolean component2() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1zSDK getCurrencyIso4217Code() {
        return AFf1zSDK.REGISTER;
    }
}

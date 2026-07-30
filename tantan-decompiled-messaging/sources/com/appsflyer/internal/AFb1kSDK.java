package com.appsflyer.internal;

import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1kSDK {

    @VisibleForTesting
    private static String getMonetizationNetwork;

    @VisibleForTesting
    private static String getRevenue;

    public static void AFAdRevenueData(String str) {
        getRevenue = str;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        getMonetizationNetwork = sb.toString();
    }

    public static void getMediationNetwork(String str) {
        if (getRevenue == null) {
            AFAdRevenueData(AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code().AFKeystoreWrapper().component1);
        }
        String str2 = getRevenue;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, getMonetizationNetwork));
        }
    }
}

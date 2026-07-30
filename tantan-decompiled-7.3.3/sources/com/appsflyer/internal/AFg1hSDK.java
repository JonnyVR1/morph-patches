package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1hSDK {
    public static void AFAdRevenueData(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            StringBuilder sb = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb.append(map.toString());
            AFLogger.afDebugLog(sb.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    public static void getMediationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }
}

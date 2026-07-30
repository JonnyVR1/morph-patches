package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1uSDK {
    @Nullable
    public static JSONObject getCurrencyIso4217Code(String str) {
        JSONObject mediationNetwork = AFa1pSDK.getMediationNetwork(str);
        if (mediationNetwork != null) {
            try {
                if (mediationNetwork.has("ol_id")) {
                    String strOptString = mediationNetwork.optString("ol_scheme", null);
                    String strOptString2 = mediationNetwork.optString("ol_domain", null);
                    String strOptString3 = mediationNetwork.optString("ol_ver", null);
                    if (strOptString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, strOptString);
                    }
                    if (strOptString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, strOptString2);
                    }
                    if (strOptString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, strOptString3);
                        return mediationNetwork;
                    }
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                sb.append(th.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb.toString(), th);
                AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code().copydefault().getRevenue();
                AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code().copydefault().getMonetizationNetwork();
            }
        }
        return mediationNetwork;
    }
}

package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1pSDK implements AFe1gSDK<AFc1jSDK> {
    @Override // com.appsflyer.internal.AFe1gSDK
    public final /* synthetic */ AFc1jSDK getMonetizationNetwork(String str) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        DeepLink deepLinkAFAdRevenueData = null;
        if (str == null || str.length() == 0) {
            return new AFc1jSDK(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean("found", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (zOptBoolean && (jSONObjectOptJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            deepLinkAFAdRevenueData = DeepLink.AFAdRevenueData(jSONObjectOptJSONObject);
            deepLinkAFAdRevenueData.getMediationNetwork.put("is_deferred", true);
        }
        return new AFc1jSDK(zOptBoolean2, deepLinkAFAdRevenueData);
    }
}

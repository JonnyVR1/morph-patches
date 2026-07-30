package com.appsflyer.internal;

import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1fSDK {
    public final int AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final int getMonetizationNetwork;
    public final long getRevenue;

    public AFh1fSDK(String str, int i, int i2, long j) {
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = i;
        this.getMonetizationNetwork = i2;
        this.getRevenue = j;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1fSDK.class == obj.getClass()) {
            AFh1fSDK aFh1fSDK = (AFh1fSDK) obj;
            if (this.AFAdRevenueData == aFh1fSDK.AFAdRevenueData && this.getMonetizationNetwork == aFh1fSDK.getMonetizationNetwork && this.getRevenue == aFh1fSDK.getRevenue && (str = this.getCurrencyIso4217Code) != null && str.equals(aFh1fSDK.getCurrencyIso4217Code)) {
                return true;
            }
        }
        return false;
    }

    public final String getCurrencyIso4217Code() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.PARAM_SDK_VER, this.getCurrencyIso4217Code);
            jSONObject.put("min", this.AFAdRevenueData);
            jSONObject.put("expire", this.getMonetizationNetwork);
            jSONObject.put("ttl", this.getRevenue);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.getCurrencyIso4217Code;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.AFAdRevenueData) * 31) + this.getMonetizationNetwork) * 31) + ((int) this.getRevenue);
    }
}

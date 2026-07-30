package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1aSDK {

    @NonNull
    public final String AFAdRevenueData;

    @NonNull
    public final AFh1eSDK getCurrencyIso4217Code;

    @NonNull
    public final String getMediationNetwork;

    @Nullable
    public final AFh1bSDK getMonetizationNetwork;
    private final boolean getRevenue;

    public AFh1aSDK(@NonNull String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.getMediationNetwork = string;
            this.getRevenue = jSONObject.optBoolean("test_mode");
            this.AFAdRevenueData = str;
            this.getCurrencyIso4217Code = string.startsWith("default") ? AFh1eSDK.DEFAULT : AFh1eSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.getMonetizationNetwork = jSONObjectOptJSONObject != null ? new AFh1bSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFh1aSDK.class != obj.getClass()) {
            return false;
        }
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
        if (this.getRevenue == aFh1aSDK.getRevenue && this.getMediationNetwork.equals(aFh1aSDK.getMediationNetwork)) {
            return this.AFAdRevenueData.equals(aFh1aSDK.AFAdRevenueData);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.getRevenue ? 1 : 0) * 31) + this.getMediationNetwork.hashCode()) * 31) + this.AFAdRevenueData.hashCode();
        AFh1bSDK aFh1bSDK = this.getMonetizationNetwork;
        return aFh1bSDK != null ? (iHashCode * 31) + aFh1bSDK.hashCode() : iHashCode;
    }
}

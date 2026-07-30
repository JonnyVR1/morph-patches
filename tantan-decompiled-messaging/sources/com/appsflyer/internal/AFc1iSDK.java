package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1iSDK implements AFc1oSDK {

    @NotNull
    private final AFd1rSDK getRevenue;

    public AFc1iSDK(@NotNull AFd1rSDK aFd1rSDK) {
        aFd1rSDK.getClass();
        this.getRevenue = aFd1rSDK;
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getCurrencyIso4217Code() {
        this.getRevenue.getRevenue("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getMediationNetwork(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.getRevenue.getRevenue("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    @NotNull
    public final Map<String, Object> getMonetizationNetwork() {
        if (this.getRevenue.getCurrencyIso4217Code("deeplink_data")) {
            try {
                String currencyIso4217Code = this.getRevenue.getCurrencyIso4217Code("deeplink_data", null);
                return currencyIso4217Code == null ? MapsKt.emptyMap() : AFj1pSDK.getMonetizationNetwork(new JSONObject(currencyIso4217Code));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return MapsKt.emptyMap();
    }
}

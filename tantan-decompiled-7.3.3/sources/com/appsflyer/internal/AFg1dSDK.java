package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1dSDK extends AFf1wSDK<Void> {

    @Nullable
    private final Throwable areAllFieldsValid;
    private final AFd1rSDK component1;

    @Nullable
    private final AFe1kSDK<String> component4;

    public AFg1dSDK(AFf1dSDK aFf1dSDK, AFd1rSDK aFd1rSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "GCD-CHECK");
        this.areAllFieldsValid = aFf1dSDK.component2();
        this.component4 = ((AFf1oSDK) aFf1dSDK).component1;
        this.component1 = aFd1rSDK;
    }

    @Nullable
    private Map<String, Object> component1() {
        String currencyIso4217Code = this.component1.getCurrencyIso4217Code("attributionId", null);
        if (currencyIso4217Code == null) {
            return null;
        }
        try {
            new AFe1mSDK();
            return AFe1mSDK.getCurrencyIso4217Code(currencyIso4217Code);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    @NonNull
    public final AFe1dSDK getMonetizationNetwork() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component1.getMonetizationNetwork("appsFlyerCount", 0))));
        long jAFAdRevenueData = this.component1.AFAdRevenueData("appsflyerConversionDataCacheExpiration", 0L);
        if (jAFAdRevenueData != 0 && System.currentTimeMillis() - jAFAdRevenueData > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.component1.AFAdRevenueData("sixtyDayConversionData", true);
            this.component1.getRevenue("attributionId", (String) null);
            this.component1.getRevenue("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapComponent1 = component1();
        if (mapComponent1 != null) {
            try {
                if (!mapComponent1.containsKey("is_first_launch")) {
                    mapComponent1.put("is_first_launch", Boolean.FALSE);
                }
                AFg1hSDK.AFAdRevenueData(mapComponent1);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb.append(e.getLocalizedMessage());
                AFLogger.afErrorLog(sb.toString(), e);
            }
            return AFe1dSDK.SUCCESS;
        }
        try {
            if (this.areAllFieldsValid != null) {
                StringBuilder sb2 = new StringBuilder("Launch exception: ");
                sb2.append(this.areAllFieldsValid.getMessage());
                AFg1hSDK.getMediationNetwork(sb2.toString());
                return AFe1dSDK.SUCCESS;
            }
            AFe1kSDK<String> aFe1kSDK = this.component4;
            if (aFe1kSDK != null && !aFe1kSDK.isSuccessful()) {
                StringBuilder sb3 = new StringBuilder("Launch status code: ");
                sb3.append(this.component4.getStatusCode());
                AFg1hSDK.getMediationNetwork(sb3.toString());
                return AFe1dSDK.SUCCESS;
            }
            return AFe1dSDK.FAILURE;
        } catch (Exception e2) {
            StringBuilder sb4 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb4.append(e2.getLocalizedMessage());
            AFLogger.afErrorLog(sb4.toString(), e2);
        }
    }

    @Override // com.appsflyer.internal.AFf1wSDK
    public final long getRevenue() {
        return 1000L;
    }
}

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.momo.xeengine.gift.XEGiftErrorCode;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1gSDK extends AFf1oSDK<Map<String, Object>> {
    private static final List<String> component3 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFd1pSDK copy;
    private final AFe1sSDK copydefault;

    @Nullable
    private Map<String, Object> equals;
    private final AFh1qSDK hashCode;
    private final AFd1rSDK toString;

    @Nullable
    private String valueOf;

    public AFg1gSDK(@NonNull AFd1fSDK aFd1fSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1fSDK, "GCD-FETCH");
        this.copydefault = aFd1fSDK.getMonetizationNetwork();
        this.toString = aFd1fSDK.getRevenue();
        this.hashCode = aFd1fSDK.component4();
        this.copy = aFd1fSDK.getMediationNetwork();
        this.getMonetizationNetwork.add(AFf1zSDK.CONVERSION);
        this.getMonetizationNetwork.add(AFf1zSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1rSDK<Map<String, Object>> AFAdRevenueData(@NonNull String str) {
        String strConcat;
        String str2 = (String) AFb1tSDK.AFAdRevenueData(new Object[]{this.toString, this.copy.component4()}, -787116836, 787116860, (int) System.currentTimeMillis());
        if (str2 == null || str2.trim().isEmpty()) {
            strConcat = "";
        } else if (component3.contains(str2.toLowerCase(Locale.getDefault()))) {
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", str2));
            strConcat = "";
        } else {
            strConcat = "-".concat(str2);
        }
        AFe1rSDK<Map<String, Object>> revenue = this.copydefault.getRevenue(strConcat, str);
        StringBuilder sb = new StringBuilder("[GCD-B01] URL: ");
        sb.append(revenue.AFAdRevenueData.getRevenue);
        AFb1kSDK.getMediationNetwork(sb.toString());
        return revenue;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    @Nullable
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean equals() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        Map<String, Object> map = this.equals;
        String str = this.valueOf;
        if (map != null) {
            AFg1hSDK.AFAdRevenueData(map);
        } else if (str == null || str.isEmpty()) {
            AFg1hSDK.getMediationNetwork(XEGiftErrorCode.ERROR_MSG_UNKNOWN);
        } else {
            AFg1hSDK.getMediationNetwork(str);
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    @NonNull
    public final AFe1dSDK getMonetizationNetwork() throws Exception {
        AFe1dSDK monetizationNetwork;
        AFe1dSDK aFe1dSDK;
        if (((AFf1oSDK) this).areAllFieldsValid.getMonetizationNetwork()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.valueOf = "'isStopTracking' enabled";
            throw new AFf1uSDK();
        }
        AFe1dSDK aFe1dSDK2 = AFe1dSDK.FAILURE;
        int i = 0;
        while (i <= 2) {
            boolean z = true;
            boolean z2 = i >= 2;
            this.hashCode.equals = System.currentTimeMillis();
            try {
                try {
                    monetizationNetwork = super.getMonetizationNetwork();
                    ResponseNetwork responseNetwork = ((AFf1oSDK) this).component1;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z = false;
                        }
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.toString.getRevenue("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.afDebugLog(sb.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.toString.getRevenue("attributionId", new JSONObject(map).toString());
                            if (!this.toString.AFAdRevenueData("sixtyDayConversionData")) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.equals = map;
                            aFe1dSDK = AFe1dSDK.SUCCESS;
                        } else {
                            if (!z2) {
                                if (!z) {
                                }
                            }
                            this.valueOf = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1dSDK = AFe1dSDK.FAILURE;
                        }
                        this.hashCode.getMonetizationNetwork(i);
                        AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                        return aFe1dSDK;
                    }
                } catch (AFf1ySDK e) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.valueOf = "AppsFlyer dev key is missing";
                    throw e;
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder("[GCD] Error: ");
                    sb2.append(e2.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e2, false, false);
                    monetizationNetwork = AFe1dSDK.FAILURE;
                    if (z2) {
                        this.valueOf = e2.getMessage();
                        throw e2;
                    }
                }
                this.hashCode.getMonetizationNetwork(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                aFe1dSDK2 = monetizationNetwork;
                i++;
            } catch (Throwable th) {
                this.hashCode.getMonetizationNetwork(i);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                throw th;
            }
        }
        return aFe1dSDK2;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFf1wSDK
    public final boolean AFAdRevenueData() {
        return false;
    }
}

package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1qSDK implements AFg1nSDK {

    @NotNull
    private final AFd1mSDK AFAdRevenueData;

    @NotNull
    private final AppsFlyerProperties getCurrencyIso4217Code;

    @NotNull
    private final AFg1oSDK getRevenue;

    public AFg1qSDK(@NotNull AFg1oSDK aFg1oSDK, @NotNull AFd1mSDK aFd1mSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        aFg1oSDK.getClass();
        aFd1mSDK.getClass();
        appsFlyerProperties.getClass();
        this.getRevenue = aFg1oSDK;
        this.AFAdRevenueData = aFd1mSDK;
        this.getCurrencyIso4217Code = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map, @NotNull AFf1zSDK aFf1zSDK) {
        map.getClass();
        aFf1zSDK.getClass();
        AFg1mSDK monetizationNetwork = this.getRevenue.getMonetizationNetwork();
        AppsFlyerConsent appsFlyerConsent = this.AFAdRevenueData.component2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("gdpr_applies", Boolean.valueOf(appsFlyerConsent.isUserSubjectToGDPR()));
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (monetizationNetwork != null) {
            boolean z = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(monetizationNetwork.getMonetizationNetwork));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(monetizationNetwork.getRevenue));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(monetizationNetwork.getCurrencyIso4217Code));
            if (z) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(monetizationNetwork.AFAdRevenueData));
                linkedHashMap3.put("tcstring", monetizationNetwork.getMediationNetwork);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFf1zSDK != AFf1zSDK.CONVERSION || this.getCurrencyIso4217Code.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> revenue = AFb1tSDK.getRevenue(map);
        revenue.getClass();
        revenue.put("api", MapsKt.mapOf(TuplesKt.m87240a(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getCurrencyIso4217Code.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}

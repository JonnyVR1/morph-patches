package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import com.facebook.AuthenticationTokenClaims;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1eSDK extends AFf1gSDK {

    @NotNull
    private final AFh1rSDK copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1eSDK(@NotNull AFh1rSDK aFh1rSDK, @NotNull AFd1fSDK aFd1fSDK) {
        super(aFh1rSDK, aFd1fSDK);
        aFh1rSDK.getClass();
        aFd1fSDK.getClass();
        this.copydefault = aFh1rSDK;
    }

    @Override // com.appsflyer.internal.AFf1gSDK
    public final void getRevenue(@NotNull AFa1mSDK aFa1mSDK) {
        aFa1mSDK.getClass();
        super.getRevenue(aFa1mSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.copydefault.copydefault;
        aFAdRevenueData.getClass();
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.copydefault.hashCode;
        if (map != null && !map.isEmpty()) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, "country", AdRevenueScheme.PLACEMENT});
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listListOf.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(AuthenticationTokenClaims.JSON_KEY_NAME, "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> revenue = aFa1mSDK.getRevenue();
        revenue.getClass();
        revenue.put("ad_network", linkedHashMap3);
    }
}

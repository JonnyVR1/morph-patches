package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK.RunnableC09595;
import com.appsflyer.internal.AFf1nSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFj1gSDK;
import com.appsflyer.internal.AFj1jSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String getRevenue = "https://%simpression.%s";

    private static void getCurrencyIso4217Code(@NonNull String str, @NonNull Context context, @Nullable AFj1jSDK aFj1jSDK) {
        AFb1tSDK monetizationNetwork = AFb1tSDK.getMonetizationNetwork();
        monetizationNetwork.getCurrencyIso4217Code(context);
        AFd1fSDK currencyIso4217Code = monetizationNetwork.getCurrencyIso4217Code();
        AFf1nSDK aFf1nSDK = new AFf1nSDK(currencyIso4217Code, str, aFj1jSDK);
        AFe1aSDK aFe1aSDKCopy = currencyIso4217Code.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09595(aFf1nSDK));
    }

    @NonNull
    private static LinkGenerator getMonetizationNetwork(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.getMediationNetwork = str3;
        linkGenerator.getMonetizationNetwork = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator monetizationNetwork = getMonetizationNetwork(context, str, str2, map, String.format(AFj1gSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.mo5194i(AFg1cSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.mo5194i(AFg1cSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        getCurrencyIso4217Code(monetizationNetwork.generateLink(), context, new AFj1jSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.mo5194i(AFg1cSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.mo5194i(AFg1cSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            getCurrencyIso4217Code(getMonetizationNetwork(context, str, str2, map, String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getMonetizationNetwork().getHostName())).generateLink(), context, null);
        }
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            if (key.equals("app")) {
                AFj1gSDK.AFAdRevenueData = value;
            } else if (key.equals("impression")) {
                getRevenue = value;
            }
        }
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }
}

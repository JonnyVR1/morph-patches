package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.OaidClient;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1rSDK {

    @Nullable
    public static Boolean AFAdRevenueData;
    static String getMonetizationNetwork;

    @Nullable
    /* JADX INFO: renamed from: b_ */
    public static AFb1ySDK m5201b_(ContentResolver contentResolver) {
        String string;
        if (!getCurrencyIso4217Code() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new AFb1ySDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            string = "";
        }
        return new AFb1ySDK(string, Boolean.TRUE);
    }

    private static boolean getCurrencyIso4217Code() {
        Boolean bool = AFAdRevenueData;
        return bool == null || bool.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    @Nullable
    public static AFb1ySDK getRevenue(Context context) {
        Boolean lat;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = getMonetizationNetwork;
        boolean z = str != null;
        if (z) {
            lat = null;
        } else {
            Boolean bool = AFAdRevenueData;
            if ((bool == null || !bool.booleanValue()) && !(AFAdRevenueData == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                lat = null;
                str = null;
            } else {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id;
                        } catch (Throwable unused) {
                            str = id;
                            AFLogger.afDebugLog("No OAID library");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        AFb1ySDK aFb1ySDK = new AFb1ySDK(str, lat);
        aFb1ySDK.getMonetizationNetwork = Boolean.valueOf(z);
        return aFb1ySDK;
    }
}

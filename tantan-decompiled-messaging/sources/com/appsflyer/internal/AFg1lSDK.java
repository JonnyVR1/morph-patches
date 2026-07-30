package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFe1aSDK.RunnableC09555;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.iid.ServiceStarter;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1lSDK {

    @VisibleForTesting
    public static String AFAdRevenueData;
    public final AFd1rSDK getRevenue;

    static {
        StringBuilder sb = new StringBuilder("https://%sregister.%s/api/v");
        sb.append(AFb1tSDK.getMonetizationNetwork);
        AFAdRevenueData = sb.toString();
    }

    public AFg1lSDK(@NonNull Context context) {
        this.getRevenue = AFb1tSDK.getMonetizationNetwork().getRevenue(context);
    }

    public static boolean getCurrencyIso4217Code(@NonNull AFd1rSDK aFd1rSDK) {
        return aFd1rSDK.AFAdRevenueData("sentRegisterRequestToAF");
    }

    public static boolean getMediationNetwork(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return AFb1vSDK.m5204c_(context, new Intent(ServiceStarter.ACTION_MESSAGING_EVENT, null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.INSTANCE.m5241e(AFg1cSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    @Nullable
    public final AFg1jSDK AFAdRevenueData() {
        String string;
        String string2;
        String currencyIso4217Code = this.getRevenue.getCurrencyIso4217Code("afUninstallToken", null);
        long jAFAdRevenueData = this.getRevenue.AFAdRevenueData("afUninstallToken_received_time", 0L);
        boolean zAFAdRevenueData = this.getRevenue.AFAdRevenueData("afUninstallToken_queued");
        this.getRevenue.AFAdRevenueData("afUninstallToken_queued", false);
        if (currencyIso4217Code == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string2.split(Constants.SEPARATOR_COMMA);
            currencyIso4217Code = strArrSplit[strArrSplit.length - 1];
        }
        if (jAFAdRevenueData == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit2 = string.split(Constants.SEPARATOR_COMMA);
            if (strArrSplit2.length >= 2) {
                try {
                    jAFAdRevenueData = Long.parseLong(strArrSplit2[strArrSplit2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (currencyIso4217Code != null) {
            return new AFg1jSDK(currencyIso4217Code, jAFAdRevenueData, zAFAdRevenueData);
        }
        return null;
    }

    public static void AFAdRevenueData(String str) {
        AFd1fSDK currencyIso4217Code = AFb1tSDK.getMonetizationNetwork().getCurrencyIso4217Code();
        AFf1bSDK aFf1bSDK = new AFf1bSDK(str, currencyIso4217Code);
        AFe1aSDK aFe1aSDKCopy = currencyIso4217Code.copy();
        aFe1aSDKCopy.AFAdRevenueData.execute(aFe1aSDKCopy.new RunnableC09555(aFf1bSDK));
    }
}

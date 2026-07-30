package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1pSDK {
    private static String getMediationNetwork = "295";
    public final AFd1kSDK AFAdRevenueData;
    private Bundle getCurrencyIso4217Code = null;
    public final AFd1mSDK getMonetizationNetwork;
    public final AFd1rSDK getRevenue;

    public AFd1pSDK(AFd1kSDK aFd1kSDK, AFd1rSDK aFd1rSDK, AFd1mSDK aFd1mSDK) {
        this.AFAdRevenueData = aFd1kSDK;
        this.getRevenue = aFd1rSDK;
        this.getMonetizationNetwork = aFd1mSDK;
    }

    public static String component3() {
        StringBuilder sb = new StringBuilder("version: 6.15.0 (build ");
        sb.append(getMediationNetwork);
        sb.append(")");
        return sb.toString();
    }

    public static String getMediationNetwork() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    @Nullable
    @SuppressLint({"DiscouragedApi"})
    public final String AFAdRevenueData(String str) {
        try {
            int identifier = this.AFAdRevenueData.getCurrencyIso4217Code.getResources().getIdentifier(str, "string", this.AFAdRevenueData.getCurrencyIso4217Code.getPackageName());
            if (identifier != 0) {
                return this.AFAdRevenueData.getCurrencyIso4217Code.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            StringBuilder sb = new StringBuilder("Could not load string resource!");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    public final boolean component2() {
        return !this.getMonetizationNetwork.getRevenue();
    }

    @Nullable
    public final String component4() {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            string = getRevenue("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final boolean getCurrencyIso4217Code(String str) {
        String revenue = getRevenue(str);
        if (revenue != null) {
            return Boolean.parseBoolean(revenue);
        }
        return false;
    }

    @Nullable
    public final String getMonetizationNetwork() {
        AFh1pSDK aFh1pSDK = this.getMonetizationNetwork.component4;
        AFb1ySDK aFb1ySDK = aFh1pSDK != null ? new AFb1ySDK(aFh1pSDK.AFAdRevenueData, aFh1pSDK.component2) : null;
        if (aFb1ySDK != null) {
            return aFb1ySDK.AFAdRevenueData;
        }
        return null;
    }

    @Nullable
    public final String getRevenue(String str) {
        Object obj;
        try {
            if (this.getCurrencyIso4217Code == null) {
                this.getCurrencyIso4217Code = ((PackageItemInfo) this.AFAdRevenueData.getCurrencyIso4217Code.getPackageManager().getApplicationInfo(this.AFAdRevenueData.getCurrencyIso4217Code.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.getCurrencyIso4217Code;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not load manifest metadata!");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    public static String getCurrencyIso4217Code() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @NonNull
    public static String AFAdRevenueData() {
        return UUID.randomUUID().toString();
    }

    @NonNull
    public static String getRevenue() {
        return "6.15.0";
    }
}

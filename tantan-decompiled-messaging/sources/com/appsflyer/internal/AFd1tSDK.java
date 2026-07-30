package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1tSDK implements AFd1rSDK {
    private final SharedPreferences getMediationNetwork;

    public AFd1tSDK(SharedPreferences sharedPreferences) {
        this.getMediationNetwork = sharedPreferences;
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final boolean AFAdRevenueData(String str) {
        try {
            return this.getMediationNetwork.getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final String getCurrencyIso4217Code(String str, String str2) {
        try {
            return this.getMediationNetwork.getString(str, str2);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final int getMonetizationNetwork(String str, int i) {
        try {
            return this.getMediationNetwork.getInt(str, i);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void getRevenue(String str, String str2) {
        this.getMediationNetwork.edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void getRevenue(String str, long j) {
        this.getMediationNetwork.edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void getRevenue(String str) {
        this.getMediationNetwork.edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final boolean getCurrencyIso4217Code(String str) {
        return this.getMediationNetwork.contains(str);
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(String str, boolean z) {
        this.getMediationNetwork.edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final long AFAdRevenueData(String str, long j) {
        try {
            return this.getMediationNetwork.getLong(str, j);
        } catch (ClassCastException e) {
            AFLogger.afErrorLog("Unexpected data type found for key ".concat(String.valueOf(str)), e);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFd1rSDK
    public final void AFAdRevenueData(String str, int i) {
        this.getMediationNetwork.edit().putInt(str, i).apply();
    }
}

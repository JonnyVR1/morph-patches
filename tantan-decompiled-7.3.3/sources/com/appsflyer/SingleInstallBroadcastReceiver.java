package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFb1tSDK;

/* JADX INFO: loaded from: classes.dex */
public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent == null) {
            return;
        }
        try {
            stringExtra = intent.getStringExtra("referrer");
        } catch (Throwable th) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th);
            stringExtra = null;
        }
        if (stringExtra != null && AFb1tSDK.m5209i_(context).getString("referrer", null) != null) {
            AFb1tSDK.getMonetizationNetwork().getMonetizationNetwork(context, stringExtra);
            return;
        }
        String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (string == null || jCurrentTimeMillis - Long.parseLong(string) >= 2000) {
            AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
            AFb1tSDK monetizationNetwork = AFb1tSDK.getMonetizationNetwork();
            AFb1tSDK.AFAdRevenueData(new Object[]{monetizationNetwork, context, intent}, -375133356, 375133364, System.identityHashCode(monetizationNetwork));
            AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
        }
    }
}

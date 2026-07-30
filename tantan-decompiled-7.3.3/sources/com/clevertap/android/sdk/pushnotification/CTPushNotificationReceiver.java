package com.clevertap.android.sdk.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(since = "4.3.0")
public class CTPushNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent launchIntentForPackage;
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey(Constants.DEEP_LINK_KEY)) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra(Constants.DEEP_LINK_KEY)));
                Utils.setPackageNameFromResolveInfoList(context, launchIntentForPackage);
            } else {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage == null) {
                    return;
                }
            }
            CleverTapAPI.m5813S(context, extras);
            launchIntentForPackage.setFlags(872415232);
            launchIntentForPackage.putExtras(extras);
            launchIntentForPackage.putExtra(Constants.WZRK_FROM_KEY, Constants.WZRK_FROM);
            if (extras.containsKey(Constants.CLOSE_SYSTEM_DIALOGS) && extras.getBoolean(Constants.CLOSE_SYSTEM_DIALOGS)) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
            context.startActivity(launchIntentForPackage);
            Logger.m5919d("CTPushNotificationReceiver: handled notification: " + extras.toString());
        } catch (Throwable th) {
            Logger.m5930v("CTPushNotificationReceiver: error handling notification", th);
        }
    }
}

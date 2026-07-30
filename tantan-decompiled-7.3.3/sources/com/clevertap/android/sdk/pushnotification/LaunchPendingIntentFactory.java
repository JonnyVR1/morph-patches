package com.clevertap.android.sdk.pushnotification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LaunchPendingIntentFactory {
    /* JADX INFO: renamed from: a */
    public static PendingIntent m6976a(@NonNull Bundle bundle, @NonNull Context context) {
        Intent launchIntentForPackage;
        if (!bundle.containsKey(Constants.DEEP_LINK_KEY) || bundle.getString(Constants.DEEP_LINK_KEY) == null) {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return null;
            }
        } else {
            launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(bundle.getString(Constants.DEEP_LINK_KEY)));
            Utils.setPackageNameFromResolveInfoList(context, launchIntentForPackage);
        }
        launchIntentForPackage.setFlags(872415232);
        launchIntentForPackage.putExtras(bundle);
        launchIntentForPackage.removeExtra(Constants.WZRK_ACTIONS);
        return PendingIntent.getActivity(context, new Random().nextInt(), launchIntentForPackage, 201326592, null);
    }

    public static PendingIntent getLaunchPendingIntent(@NonNull Bundle bundle, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return m6976a(bundle, context);
        }
        Intent intent = new Intent(context, (Class<?>) CTPushNotificationReceiver.class);
        intent.putExtras(bundle);
        intent.removeExtra(Constants.WZRK_ACTIONS);
        return PendingIntent.getBroadcast(context, new Random().nextInt(), intent, 201326592);
    }
}

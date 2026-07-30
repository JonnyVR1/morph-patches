package com.clevertap.android.sdk.pushnotification;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import p153l.k30;
import p153l.oz40;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(since = "4.3.0")
public class CTNotificationIntentService extends IntentService {
    public static final String MAIN_ACTION = "com.clevertap.PUSH_EVENT";
    public static final String TYPE_BUTTON_CLICK = "com.clevertap.ACTION_BUTTON_CLICK";
    private k30 mActionButtonClickHandler;

    public CTNotificationIntentService() {
        super("CTNotificationIntentService");
    }

    @SuppressLint({"MissingPermission"})
    private void handleActionButtonClick(Bundle bundle) {
        Intent launchIntentForPackage;
        NotificationManager notificationManager;
        try {
            boolean z = bundle.getBoolean("autoCancel", false);
            int i = bundle.getInt(Constants.PT_NOTIF_ID, -1);
            String string = bundle.getString("dl");
            Context applicationContext = getApplicationContext();
            if (!this.mActionButtonClickHandler.mo6981c(applicationContext, bundle, i) && Build.VERSION.SDK_INT < 31) {
                if (string != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(string));
                    Utils.setPackageNameFromResolveInfoList(applicationContext, launchIntentForPackage);
                } else {
                    launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
                }
                if (launchIntentForPackage == null) {
                    Logger.m5927v("CTNotificationService: create launch intent.");
                    return;
                }
                launchIntentForPackage.setFlags(872415232);
                CleverTapAPI.m5813S(applicationContext, bundle);
                launchIntentForPackage.putExtras(bundle);
                launchIntentForPackage.removeExtra("dl");
                String string2 = bundle.getString("pt_dismiss_on_click", "");
                if (z && i > -1 && string2.isEmpty() && (notificationManager = (NotificationManager) getApplicationContext().getSystemService("notification")) != null) {
                    notificationManager.cancel(i);
                }
                sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                startActivity(launchIntentForPackage);
            }
        } catch (Throwable th) {
            Logger.m5927v("CTNotificationService: unable to process action button click:  " + th.getLocalizedMessage());
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        oz40 oz40VarM5810P = CleverTapAPI.m5810P();
        if (!PushNotificationHandler.isForPushTemplates(extras) || oz40VarM5810P == null) {
            this.mActionButtonClickHandler = (k30) PushNotificationHandler.m6977d();
        } else {
            this.mActionButtonClickHandler = (k30) oz40VarM5810P;
        }
        if (TYPE_BUTTON_CLICK.equals(extras.getString(Constants.KEY_CT_TYPE))) {
            Logger.m5927v("CTNotificationIntentService handling com.clevertap.ACTION_BUTTON_CLICK");
            handleActionButtonClick(extras);
        } else {
            Logger.m5927v("CTNotificationIntentService: unhandled intent " + intent.getAction());
        }
    }
}

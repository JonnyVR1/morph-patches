package com.clevertap.android.sdk.pushnotification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.Utils;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface INotificationRenderer {
    String getActionButtonIconKey();

    @Nullable
    Object getCollapseKey(Bundle bundle);

    @Nullable
    String getMessage(Bundle bundle);

    @Nullable
    String getTitle(Bundle bundle, Context context);

    @Nullable
    NotificationCompat.Builder renderNotification(Bundle bundle, Context context, NotificationCompat.Builder builder, CleverTapInstanceConfig cleverTapInstanceConfig, int i);

    default NotificationCompat.Builder setActionButtons(Context context, Bundle bundle, int i, NotificationCompat.Builder builder, JSONArray jSONArray) {
        int identifier;
        Intent launchIntentForPackage;
        String intentServiceName = ManifestInfo.getInstance(context).getIntentServiceName();
        Class cls = CTNotificationIntentService.class;
        if (intentServiceName != null) {
            try {
                try {
                    cls = Class.forName(intentServiceName);
                } catch (ClassNotFoundException unused) {
                    Logger.m5865d("No Intent Service found");
                    cls = null;
                }
            } catch (ClassNotFoundException unused2) {
                String str = CTNotificationIntentService.MAIN_ACTION;
            }
        } else {
            try {
                String str2 = CTNotificationIntentService.MAIN_ACTION;
            } catch (ClassNotFoundException unused3) {
                Logger.m5865d("No Intent Service found");
                cls = null;
            }
        }
        boolean zIsServiceAvailable = Utils.isServiceAvailable(context, cls);
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String strOptString = jSONObject.optString(BLiveStormDanmakuGiftResourceType.f44444l);
                    String strOptString2 = jSONObject.optString("dl");
                    String strOptString3 = jSONObject.optString(getActionButtonIconKey());
                    String strOptString4 = jSONObject.optString("id");
                    boolean zOptBoolean = jSONObject.optBoolean(Network.AUTH_CORE, true);
                    if (strOptString.isEmpty() || strOptString4.isEmpty()) {
                        Logger.m5865d("not adding push notification action: action label or id missing");
                    } else {
                        if (strOptString3.isEmpty()) {
                            identifier = 0;
                        } else {
                            try {
                                identifier = context.getResources().getIdentifier(strOptString3, "drawable", context.getPackageName());
                            } catch (Throwable th) {
                                Logger.m5865d("unable to add notification action icon: " + th.getLocalizedMessage());
                                identifier = 0;
                            }
                        }
                        boolean z = Build.VERSION.SDK_INT < 31 && zOptBoolean && zIsServiceAvailable;
                        String string = bundle.getString("pt_dismiss_on_click");
                        if (!z && PushNotificationHandler.isForPushTemplates(bundle) && strOptString4.contains("remind") && string != null && string.equalsIgnoreCase("true") && zOptBoolean && zIsServiceAvailable) {
                            z = true;
                        }
                        boolean z2 = (!z && PushNotificationHandler.isForPushTemplates(bundle) && string != null && string.equalsIgnoreCase("true") && zOptBoolean && zIsServiceAvailable) ? true : z;
                        if (z2) {
                            launchIntentForPackage = new Intent("com.clevertap.PUSH_EVENT");
                            launchIntentForPackage.setPackage(context.getPackageName());
                            launchIntentForPackage.putExtra(Constants.KEY_CT_TYPE, CTNotificationIntentService.TYPE_BUTTON_CLICK);
                            if (!strOptString2.isEmpty()) {
                                launchIntentForPackage.putExtra("dl", strOptString2);
                            }
                        } else if (strOptString2.isEmpty()) {
                            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                        } else {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(strOptString2));
                            Utils.setPackageNameFromResolveInfoList(context, launchIntentForPackage);
                        }
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.putExtras(bundle);
                            launchIntentForPackage.removeExtra(Constants.WZRK_ACTIONS);
                            launchIntentForPackage.putExtra("actionId", strOptString4);
                            launchIntentForPackage.putExtra("autoCancel", zOptBoolean);
                            launchIntentForPackage.putExtra(Constants.KEY_C2A, strOptString4);
                            try {
                                launchIntentForPackage.putExtra(Constants.PT_NOTIF_ID, i);
                                launchIntentForPackage.setFlags(603979776);
                            } catch (Throwable th2) {
                                th = th2;
                                Logger.m5865d("error adding notification action : " + th.getLocalizedMessage());
                            }
                        }
                        int iNextInt = new Random().nextInt();
                        try {
                            builder.addAction(identifier, strOptString, z2 ? PendingIntent.getService(context, iNextInt, launchIntentForPackage, 201326592) : PendingIntent.getActivity(context, iNextInt, launchIntentForPackage, 201326592, null));
                        } catch (Throwable th3) {
                            th = th3;
                            Logger.m5865d("error adding notification action : " + th.getLocalizedMessage());
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        return builder;
    }

    void setSmallIcon(int i, Context context);
}

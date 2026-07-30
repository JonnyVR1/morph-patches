package com.cosmos.photon.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.notification.MoNotify;
import io.agora.rtc2.internal.AudioRoutingController;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class NotifyClickReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        MoNotify moNotifyFromJson;
        try {
            moNotifyFromJson = (MoNotify) intent.getSerializableExtra(ChannelConstant.Keys.KEY_PUSH_DATA);
        } catch (Throwable th) {
            MDLog.printErrStackTrace(LogTag.CHANNEL, th);
            moNotifyFromJson = null;
        }
        if (moNotifyFromJson == null) {
            try {
                String stringExtra = intent.getStringExtra(ChannelConstant.Keys.KEY_PUSH_JSON_DATA);
                if (!TextUtils.isEmpty(stringExtra)) {
                    moNotifyFromJson = MoNotify.fromJson(stringExtra);
                }
            } catch (Throwable th2) {
                MDLog.printErrStackTrace(LogTag.CHANNEL, th2);
            }
        }
        if (TextUtils.isEmpty(PhotonPushManager.APP_ID)) {
            return;
        }
        try {
            if (DataProcessor.onPushClick(moNotifyFromJson)) {
                return;
            }
            int i = moNotifyFromJson.actionType;
            if (i == 1) {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(moNotifyFromJson.toPkg);
                launchIntentForPackage.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                launchIntentForPackage.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                HashMap<String, String> map = moNotifyFromJson.data;
                if (map != null) {
                    launchIntentForPackage.putExtra("push_to", map.get("to"));
                }
                context.startActivity(launchIntentForPackage);
                return;
            }
            if (i == 2) {
                Intent uri = Intent.parseUri(moNotifyFromJson.action, 0);
                uri.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                uri.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                HashMap<String, String> map2 = moNotifyFromJson.data;
                if (map2 != null) {
                    uri.putExtra("push_to", map2.get("to"));
                }
                context.startActivity(uri);
                return;
            }
            if (i == 3) {
                Intent intent2 = new Intent();
                intent2.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent2.setAction("android.intent.action.VIEW");
                intent2.setData(Uri.parse(moNotifyFromJson.action));
                context.startActivity(intent2);
            }
        } catch (Throwable th3) {
            MDLog.printErrStackTrace(LogTag.COMMON, th3);
        }
    }
}

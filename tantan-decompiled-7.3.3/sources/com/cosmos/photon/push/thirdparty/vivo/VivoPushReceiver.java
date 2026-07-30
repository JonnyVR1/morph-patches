package com.cosmos.photon.push.thirdparty.vivo;

import android.content.Context;
import android.content.Intent;
import com.cosmos.photon.push.thirdparty.IPushBridge;
import com.cosmos.photon.push.thirdparty.IntentUtil;
import com.cosmos.photon.push.thirdparty.PushLogger;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import io.agora.rtc2.internal.AudioRoutingController;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class VivoPushReceiver extends OpenClientPushMessageReceiver {
    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onNotificationMessageClicked(Context context, UPSNotificationMessage uPSNotificationMessage) {
        PushLogger.m7458i("通知点击 msgId " + uPSNotificationMessage.getMsgId() + " ;customContent=" + uPSNotificationMessage.getSkipContent());
        try {
            Intent intentSafeParseUri = IntentUtil.safeParseUri(uPSNotificationMessage.getSkipContent());
            if (intentSafeParseUri == null) {
                return;
            }
            intentSafeParseUri.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            intentSafeParseUri.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intentSafeParseUri);
        } catch (Throwable th) {
            PushLogger.printStack(th);
        }
    }

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String str) {
        PushLogger.m7458i("vivo push register result: " + str);
        IPushBridge iPushBridge = VivoPushEngine.pushBridge;
        if (iPushBridge == null || str == null) {
            return;
        }
        iPushBridge.onPushRegisterResult(10, 1001, str);
    }
}

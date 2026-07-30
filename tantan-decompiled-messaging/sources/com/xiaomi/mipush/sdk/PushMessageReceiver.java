package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.PlaybackException;
import p149l.ilq0;
import p149l.nqq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PushMessageReceiver extends BroadcastReceiver {
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            ilq0.m137027D("[CRcv] receive a msg broadcast: " + intent.getAction());
        }
        MessageHandleService.addJob(context.getApplicationContext(), new MessageHandleService.C14699c(intent, this));
        try {
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (intExtra == 2000) {
                nqq0.m160662a(context.getApplicationContext()).m160665c(context.getPackageName(), intent, 2003, null);
            } else if (intExtra == 6000) {
                nqq0.m160662a(context.getApplicationContext()).m160665c(context.getPackageName(), intent, PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION, null);
            }
        } catch (Exception e) {
            ilq0.m137025B("meet error in PushMessageReceiver. " + e);
        }
    }

    @Deprecated
    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onRequirePermissions(Context context, String[] strArr) {
    }
}

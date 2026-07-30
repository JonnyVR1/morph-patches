package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushManager;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;

/* JADX INFO: loaded from: classes7.dex */
public class DataMessageUtil {
    private static final String TYPE = "type";

    public void appArrive(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(PushManager.getReceiveSdkAction(context));
            intent.setPackage(PushManager.getMcsPackageName(context));
            intent.putExtra(Message.APP_PACKAGE, context.getPackageName());
            intent.putExtra(Message.MESSAGE_ID, str);
            intent.putExtra("type", CommandMessage.COMMAND_SEND_INSTANT_ACK);
            context.startService(intent);
        } catch (Exception e) {
            LogUtil.m17468e("statisticMessage--Exception" + e.getMessage());
        }
    }
}

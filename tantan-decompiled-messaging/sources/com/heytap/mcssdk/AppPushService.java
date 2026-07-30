package com.heytap.mcssdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.mcssdk.callback.MessageCallback;
import com.heytap.mcssdk.mode.AppMessage;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.SptDataMessage;
import com.heytap.mcssdk.utils.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class AppPushService extends Service implements MessageCallback {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PushParseHelper.parseIntent(getApplicationContext(), intent, this);
        return super.onStartCommand(intent, i, i2);
    }

    public void processMessage(Context context, CommandMessage commandMessage) {
        LogUtil.m17465d("mcssdk-processMessage:" + commandMessage.getCommand());
        PushParseHelper.parseCommandMessage(getApplicationContext(), commandMessage, PushManager.getInstance());
    }

    public void processMessage(Context context, AppMessage appMessage) {
    }

    public void processMessage(Context context, SptDataMessage sptDataMessage) {
    }
}

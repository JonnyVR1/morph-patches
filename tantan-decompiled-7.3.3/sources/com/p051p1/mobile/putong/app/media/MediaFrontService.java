package com.p051p1.mobile.putong.app.media;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.CrashHelper;
import p153l.cbc0;
import p153l.f5y;
import p153l.hx3;
import p153l.iy40;
import p153l.pzi0;

/* JADX INFO: loaded from: classes9.dex */
public class MediaFrontService extends Service {
    public static final String BUSINESS_TYPE = "business_type";
    private static final int NOTIFICATION_ID = -10002;
    public static String PUSH_CHANNEL_ID = "tantan_channel_media_front";

    public Notification generateNotification(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            hx3.m137557a();
            ((NotificationManager) getBaseContext().getSystemService("notification")).createNotificationChannel(iy40.m142608a(PUSH_CHANNEL_ID, getBaseContext().getString(R$string.f18243x3), 3));
        }
        Notification.Builder when = new Notification.Builder(getBaseContext()).setContentText(str).setOngoing(true).setPriority(0).setSmallIcon(cbc0.f80773h0).setTicker(str).setWhen(pzi0.m174454o());
        if (i >= 26) {
            when.setChannelId(PUSH_CHANNEL_ID);
        }
        return when.build();
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ((NotificationManager) getSystemService("notification")).cancel(NOTIFICATION_ID);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || TextUtils.isEmpty(intent.getStringExtra(BUSINESS_TYPE))) {
            return super.onStartCommand(intent, i, i2);
        }
        Notification notificationGenerateNotification = generateNotification(f5y.f97354b.equals(intent.getStringExtra(BUSINESS_TYPE)) ? "语音通话中" : "语聊中");
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                startForeground(NOTIFICATION_ID, notificationGenerateNotification, 130);
            } else {
                startForeground(NOTIFICATION_ID, notificationGenerateNotification);
            }
        } catch (Exception e) {
            stopSelf();
            CrashHelper.m82479c(e);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return 2;
        }
        return super.onStartCommand(intent, i, i2);
    }
}

package com.cosmos.photon.push.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes.dex */
public class AlarmTimerUtil {
    public static void cancelAlarmTimer(Context context, Intent intent, int i) {
        ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(PendingIntent.getService(context, i, intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET));
    }

    public static void setAlarmTimer(Context context, Intent intent, int i, long j) {
        PendingIntent service = PendingIntent.getService(context, i, intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (Build.VERSION.SDK_INT < 31 || alarmManager.canScheduleExactAlarms()) {
            alarmManager.setExactAndAllowWhileIdle(0, j, service);
        }
    }
}

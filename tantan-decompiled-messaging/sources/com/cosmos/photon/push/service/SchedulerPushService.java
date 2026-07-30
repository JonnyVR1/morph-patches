package com.cosmos.photon.push.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.NotifyHelper;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.notification.MoNotify;
import com.cosmos.photon.push.statistic.EventLogBody;
import com.cosmos.photon.push.statistic.PushEventStatistic;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.ThreadUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class SchedulerPushService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            intent.setExtrasClassLoader(MoNotify.class.getClassLoader());
            try {
                final String stringExtra = intent.getStringExtra("data");
                if (stringExtra != null) {
                    try {
                        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.service.SchedulerPushService.1
                            @Override // java.lang.Runnable
                            public void run() {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                MoNotify moNotifyFromJson = MoNotify.fromJson(stringExtra);
                                long j = moNotifyFromJson.showTime;
                                if (j <= 0 || jCurrentTimeMillis < j) {
                                    return;
                                }
                                if (jCurrentTimeMillis > moNotifyFromJson.showExpire) {
                                    MDLog.m7392e(LogTag.NOTIFY, "notify(%s) expired currentTime(%s) > expireTime(%s)", moNotifyFromJson.f5810id, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(jCurrentTimeMillis)), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(moNotifyFromJson.showExpire)));
                                    return;
                                }
                                if (!AppContext.getMessageReceiver().onNotificationShow(moNotifyFromJson)) {
                                    MDLog.m7396i(LogTag.NOTIFY, "show scheduler notify : %s", moNotifyFromJson.toJson());
                                    NotifyHelper.sendNotify(AppContext.getContext(), moNotifyFromJson);
                                } else {
                                    EventLogBody.Builder builder = new EventLogBody.Builder();
                                    builder.pushSource("push:self").time(moNotifyFromJson.time).data(moNotifyFromJson.data).uploadType(moNotifyFromJson.logType).type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(7);
                                    PushEventStatistic.logPushEventInfo(builder.build());
                                }
                            }
                        });
                    } catch (Throwable th) {
                        MDLog.printErrStackTrace(LogTag.CHANNEL, th);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return super.onStartCommand(intent, i, i2);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}

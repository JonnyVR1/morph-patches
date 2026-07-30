package com.cosmos.photon.push.service;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.DataProcessor;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.notification.MoNotify;
import com.cosmos.photon.push.statistic.EventLogBody;
import com.cosmos.photon.push.statistic.PushEventStatistic;
import com.cosmos.photon.push.util.AppContext;

/* JADX INFO: loaded from: classes.dex */
public class PushOVActivity extends Activity {
    private void dispatchPushArrived(MoNotify moNotify) {
        if (!AppContext.getMessageReceiver().onNotificationShow(moNotify)) {
            DataProcessor.onPushArrivedInner(moNotify);
            return;
        }
        EventLogBody.Builder builder = new EventLogBody.Builder();
        builder.pushSource("push:self").time(moNotify.time).data(moNotify.data).uploadType(moNotify.logType).type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(7);
        PushEventStatistic.logPushEventInfo(builder.build());
    }

    public static void transData(MoNotify moNotify) {
        ComponentName componentName = new ComponentName(moNotify.toPkg, "com.cosmos.photon.push.service.PushOVActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra("data", moNotify.toJson());
        intent.addFlags(268435456);
        AppContext.getContext().startActivity(intent);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        MDLog.m7391e(LogTag.CHANNEL, "trans data by PushOVActivity");
        try {
            getIntent().setExtrasClassLoader(MoNotify.class.getClassLoader());
            dispatchPushArrived(MoNotify.fromJson(getIntent().getStringExtra("data")));
            finish();
        } catch (Throwable th) {
            try {
                MDLog.printErrStackTrace(LogTag.CHANNEL, th);
            } finally {
                finish();
            }
        }
    }
}

package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p153l.qzv;
import p153l.xiq0;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String TAG = qzv.m178831i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        qzv.m178829e().mo178832a(TAG, "Received intent " + intent);
        try {
            xiq0.m211153p(context).m211168z(goAsync());
        } catch (IllegalStateException e) {
            qzv.m178829e().mo178835d(TAG, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}

package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p149l.s9q0;
import p149l.txv;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String TAG = txv.m190978i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        txv.m190976e().mo190979a(TAG, "Received intent " + intent);
        try {
            s9q0.m182740p(context).m182755z(goAsync());
        } catch (IllegalStateException e) {
            txv.m190976e().mo190982d(TAG, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}

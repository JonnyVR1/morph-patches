package p153l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes7.dex */
public class rf3 {
    /* JADX INFO: renamed from: a */
    public static final void m181163a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (broadcastReceiver == null || intentFilter == null) {
            return;
        }
        ztv.m221572b(context).m221574c(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: b */
    public static final void m181164b(Context context, BroadcastReceiver broadcastReceiver, String... strArr) {
        ztv ztvVarM221572b = ztv.m221572b(context);
        if (broadcastReceiver == null || strArr == null || strArr.length == 0) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        ztvVarM221572b.m221574c(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: c */
    public static final void m181165c(Context context, Intent intent) {
        ztv.m221572b(context).m221575d(intent);
    }

    /* JADX INFO: renamed from: d */
    public static final void m181166d(Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null || broadcastReceiver == null) {
            return;
        }
        ztv.m221572b(context).m221576e(broadcastReceiver);
    }
}

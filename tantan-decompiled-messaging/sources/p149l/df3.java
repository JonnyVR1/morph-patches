package p149l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public class df3 {
    /* JADX INFO: renamed from: a */
    public static final void m111425a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (broadcastReceiver == null || intentFilter == null) {
            return;
        }
        yrv.m215864b(context).m215866c(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: b */
    public static final void m111426b(Context context, BroadcastReceiver broadcastReceiver, String... strArr) {
        yrv yrvVarM215864b = yrv.m215864b(context);
        if (broadcastReceiver == null || strArr == null || strArr.length == 0) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        yrvVarM215864b.m215866c(broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: c */
    public static final void m111427c(Context context, Intent intent) {
        yrv.m215864b(context).m215867d(intent);
    }

    /* JADX INFO: renamed from: d */
    public static final void m111428d(Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null || broadcastReceiver == null) {
            return;
        }
        yrv.m215864b(context).m215868e(broadcastReceiver);
    }
}

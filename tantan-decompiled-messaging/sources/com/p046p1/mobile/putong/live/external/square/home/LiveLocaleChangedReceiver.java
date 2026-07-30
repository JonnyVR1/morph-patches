package com.p046p1.mobile.putong.live.external.square.home;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p046p1.mobile.putong.p065ui.download.DownloadNotificationHelper;
import p149l.ii5;
import p149l.qib0;
import p149l.s9s;
import p149l.yl5;

/* JADX INFO: loaded from: classes13.dex */
public class LiveLocaleChangedReceiver extends DownloadNotificationHelper.BroadcastReceiver {
    public static void register(Context context) {
        ii5.m136342l(context, new LiveLocaleChangedReceiver(), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    @Override // com.p1.mobile.putong.ui.download.DownloadNotificationHelper.BroadcastReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        yl5 yl5Var;
        if (!"android.intent.action.LOCALE_CHANGED".equals(intent.getAction()) || s9s.f163228b == null || (yl5Var = qib0.f154714c0) == null || !yl5Var.signedIn_()) {
            return;
        }
        s9s.f163228b.m121236q();
    }
}

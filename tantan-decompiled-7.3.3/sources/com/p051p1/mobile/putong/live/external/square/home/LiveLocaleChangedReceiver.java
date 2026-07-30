package com.p051p1.mobile.putong.live.external.square.home;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p051p1.mobile.putong.p070ui.download.DownloadNotificationHelper;
import p153l.bn5;
import p153l.jj5;
import p153l.tbs;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveLocaleChangedReceiver extends DownloadNotificationHelper.BroadcastReceiver {
    public static void register(Context context) {
        jj5.m145018l(context, new LiveLocaleChangedReceiver(), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    @Override // com.p1.mobile.putong.ui.download.DownloadNotificationHelper.BroadcastReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        bn5 bn5Var;
        if (!"android.intent.action.LOCALE_CHANGED".equals(intent.getAction()) || tbs.f172989b == null || (bn5Var = uqb0.f180397c0) == null || !bn5Var.signedIn_()) {
            return;
        }
        tbs.f172989b.m159280q();
    }
}

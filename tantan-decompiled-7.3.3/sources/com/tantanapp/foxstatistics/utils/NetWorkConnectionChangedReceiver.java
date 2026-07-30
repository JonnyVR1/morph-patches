package com.tantanapp.foxstatistics.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p153l.i4g0;
import p153l.ql20;

/* JADX INFO: loaded from: classes11.dex */
public class NetWorkConnectionChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            i4g0.m138499H("net", ql20.m176980b(context));
        }
    }
}

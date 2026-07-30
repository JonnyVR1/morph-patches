package com.tantanapp.foxstatistics.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p149l.gd20;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class NetWorkConnectionChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            zvf0.m220375H("net", gd20.m125535b(context));
        }
    }
}

package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import l.ii5;
import p002l.uv5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class NetWorkListener extends BroadcastReceiver {
    private Context application;
    private uv5 connectMonitor;

    public NetWorkListener(Context context, uv5 uv5Var) {
        this.application = context;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo == null) {
            return;
        }
        boolean z = networkInfo.getState() == NetworkInfo.State.DISCONNECTED;
        String typeName = networkInfo.getTypeName();
        if ("mobile".equalsIgnoreCase(typeName) || "WIFI".equalsIgnoreCase(typeName)) {
            if (z || networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                throw null;
            }
        }
    }

    public void star() {
        if (this.application != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            ii5.l(this.application, this, intentFilter);
        }
    }

    public void stop() {
        Context context = this.application;
        if (context != null) {
            context.unregisterReceiver(this);
        }
    }
}

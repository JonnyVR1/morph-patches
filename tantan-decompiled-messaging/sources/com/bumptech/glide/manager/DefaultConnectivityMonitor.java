package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import p149l.ii5;
import p149l.qf80;

/* JADX INFO: loaded from: classes.dex */
final class DefaultConnectivityMonitor implements InterfaceC1101c {

    /* JADX INFO: renamed from: a */
    private final Context f4628a;

    /* JADX INFO: renamed from: b */
    final InterfaceC1101c.a f4629b;

    /* JADX INFO: renamed from: c */
    boolean f4630c;

    /* JADX INFO: renamed from: d */
    private boolean f4631d;

    /* JADX INFO: renamed from: e */
    private final BroadcastReceiver f4632e = new BroadcastReceiver() { // from class: com.bumptech.glide.manager.DefaultConnectivityMonitor.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, Intent intent) {
            DefaultConnectivityMonitor defaultConnectivityMonitor = DefaultConnectivityMonitor.this;
            boolean z = defaultConnectivityMonitor.f4630c;
            defaultConnectivityMonitor.f4630c = defaultConnectivityMonitor.m5558b(context);
            if (z != DefaultConnectivityMonitor.this.f4630c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    boolean z2 = DefaultConnectivityMonitor.this.f4630c;
                }
                DefaultConnectivityMonitor defaultConnectivityMonitor2 = DefaultConnectivityMonitor.this;
                defaultConnectivityMonitor2.f4629b.mo5591a(defaultConnectivityMonitor2.f4630c);
            }
        }
    };

    public DefaultConnectivityMonitor(@NonNull Context context, @NonNull InterfaceC1101c.a aVar) {
        this.f4628a = context.getApplicationContext();
        this.f4629b = aVar;
    }

    /* JADX INFO: renamed from: f */
    private void m5556f() {
        if (this.f4631d) {
            return;
        }
        this.f4630c = m5558b(this.f4628a);
        try {
            ii5.m136342l(this.f4628a, this.f4632e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f4631d = true;
        } catch (SecurityException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m5557h() {
        if (this.f4631d) {
            this.f4628a.unregisterReceiver(this.f4632e);
            this.f4631d = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public boolean m5558b(@NonNull Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) qf80.m174276d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    @Override // p149l.hcr
    /* JADX INFO: renamed from: d */
    public void mo5559d() {
        m5557h();
    }

    @Override // p149l.hcr
    public void onDestroy() {
    }

    @Override // p149l.hcr
    public void onStart() {
        m5556f();
    }
}

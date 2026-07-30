package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import p153l.jj5;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes6.dex */
public class zzgy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final C2484j f10589a;

    /* JADX INFO: renamed from: b */
    public boolean f10590b;

    /* JADX INFO: renamed from: c */
    public boolean f10591c;

    public zzgy(C2484j c2484j) {
        Preconditions.checkNotNull(c2484j);
        this.f10589a = c2484j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m15384b() {
        this.f10589a.m15366v0();
        this.f10589a.zzl().mo15146h();
        if (this.f10590b) {
            return;
        }
        jj5.m145018l(this.f10589a.zza(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f10591c = this.f10589a.m15349l0().m171397w();
        this.f10589a.zzj().m114562E().m153301b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10591c));
        this.f10590b = true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void m15385c() {
        this.f10589a.m15366v0();
        this.f10589a.zzl().mo15146h();
        this.f10589a.zzl().mo15146h();
        if (this.f10590b) {
            this.f10589a.zzj().m114562E().m153300a("Unregistering connectivity change receiver");
            this.f10590b = false;
            this.f10591c = false;
            try {
                this.f10589a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f10589a.zzj().m114558A().m153301b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(Context context, Intent intent) {
        this.f10589a.m15366v0();
        String action = intent.getAction();
        this.f10589a.zzj().m114562E().m153301b("NetworkBroadcastReceiver received action", action);
        boolean zEquals = "android.net.conn.CONNECTIVITY_CHANGE".equals(action);
        C2484j c2484j = this.f10589a;
        if (!zEquals) {
            c2484j.zzj().m114563F().m153301b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM171397w = c2484j.m15349l0().m171397w();
        if (this.f10591c != zM171397w) {
            this.f10591c = zM171397w;
            this.f10589a.zzl().m177841w(new RunnableC2478d(this, zM171397w));
        }
    }
}

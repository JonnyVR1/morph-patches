package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import p149l.ii5;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes6.dex */
public class zzgy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final C2461j f10552a;

    /* JADX INFO: renamed from: b */
    public boolean f10553b;

    /* JADX INFO: renamed from: c */
    public boolean f10554c;

    public zzgy(C2461j c2461j) {
        Preconditions.checkNotNull(c2461j);
        this.f10552a = c2461j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m15330b() {
        this.f10552a.m15312v0();
        this.f10552a.zzl().mo15092h();
        if (this.f10553b) {
            return;
        }
        ii5.m136342l(this.f10552a.zza(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f10554c = this.f10552a.m15295l0().m139209w();
        this.f10552a.zzj().m211416E().m123937b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10554c));
        this.f10553b = true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void m15331c() {
        this.f10552a.m15312v0();
        this.f10552a.zzl().mo15092h();
        this.f10552a.zzl().mo15092h();
        if (this.f10553b) {
            this.f10552a.zzj().m211416E().m123936a("Unregistering connectivity change receiver");
            this.f10553b = false;
            this.f10554c = false;
            try {
                this.f10552a.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f10552a.zzj().m211412A().m123937b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(Context context, Intent intent) {
        this.f10552a.m15312v0();
        String action = intent.getAction();
        this.f10552a.zzj().m211416E().m123937b("NetworkBroadcastReceiver received action", action);
        boolean zEquals = "android.net.conn.CONNECTIVITY_CHANGE".equals(action);
        C2461j c2461j = this.f10552a;
        if (!zEquals) {
            c2461j.zzj().m211417F().m123937b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM139209w = c2461j.m15295l0().m139209w();
        if (this.f10554c != zM139209w) {
            this.f10554c = zM139209w;
            this.f10552a.zzl().m146305w(new RunnableC2455d(this, zM139209w));
        }
    }
}

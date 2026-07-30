package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.C2426p;
import p153l.a1s0;
import p153l.g8t0;

/* JADX INFO: renamed from: com.android.billingclient.api.d0 */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC0876d0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0878e0 f3975a;

    public /* synthetic */ ServiceConnectionC0876d0(C0878e0 c0878e0, g8t0 g8t0Var) {
        this.f3975a = c0878e0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2426p.m14973j("BillingClientTesting", "Billing Override Service connected.");
        this.f3975a.f3982I = a1s0.m95552P2(iBinder);
        this.f3975a.f3981H = 2;
        this.f3975a.m4997f1(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2426p.m14974k("BillingClientTesting", "Billing Override Service disconnected.");
        this.f3975a.f3982I = null;
        this.f3975a.f3981H = 0;
    }
}

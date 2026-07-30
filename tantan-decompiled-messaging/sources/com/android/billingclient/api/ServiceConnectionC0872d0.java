package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.C2403p;
import p149l.azs0;
import p149l.urr0;

/* JADX INFO: renamed from: com.android.billingclient.api.d0 */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC0872d0 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0874e0 f3975a;

    public /* synthetic */ ServiceConnectionC0872d0(C0874e0 c0874e0, azs0 azs0Var) {
        this.f3975a = c0874e0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2403p.m14919j("BillingClientTesting", "Billing Override Service connected.");
        this.f3975a.f3982I = urr0.m195119P2(iBinder);
        this.f3975a.f3981H = 2;
        this.f3975a.m4987f1(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2403p.m14920k("BillingClientTesting", "Billing Override Service disconnected.");
        this.f3975a.f3982I = null;
        this.f3975a.f3981H = 0;
    }
}

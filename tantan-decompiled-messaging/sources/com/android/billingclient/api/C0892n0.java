package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import p149l.nft0;
import p149l.rcb0;
import p149l.s4k0;
import p149l.v0s0;

/* JADX INFO: renamed from: com.android.billingclient.api.n0 */
/* JADX INFO: loaded from: classes.dex */
final class C0892n0 {

    /* JADX INFO: renamed from: a */
    private final Context f4087a;

    /* JADX INFO: renamed from: b */
    private final rcb0 f4088b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0878g0 f4089c;

    /* JADX INFO: renamed from: d */
    private final zzm f4090d = new zzm(this, true);

    /* JADX INFO: renamed from: e */
    private final zzm f4091e = new zzm(this, false);

    /* JADX INFO: renamed from: f */
    private boolean f4092f;

    public C0892n0(Context context, rcb0 rcb0Var, nft0 nft0Var, v0s0 v0s0Var, s4k0 s4k0Var, InterfaceC0878g0 interfaceC0878g0) {
        this.f4087a = context;
        this.f4088b = rcb0Var;
        this.f4089c = interfaceC0878g0;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ v0s0 m5052a(C0892n0 c0892n0) {
        c0892n0.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ s4k0 m5055e(C0892n0 c0892n0) {
        c0892n0.getClass();
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final rcb0 m5056d() {
        return this.f4088b;
    }

    /* JADX INFO: renamed from: f */
    public final void m5057f() {
        this.f4090d.m5075c(this.f4087a);
        this.f4091e.m5075c(this.f4087a);
    }

    /* JADX INFO: renamed from: g */
    public final void m5058g(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f4092f = z;
        this.f4091e.m5073a(this.f4087a, intentFilter2);
        boolean z2 = this.f4092f;
        zzm zzmVar = this.f4090d;
        if (z2) {
            zzmVar.m5074b(this.f4087a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            zzmVar.m5073a(this.f4087a, intentFilter);
        }
    }
}

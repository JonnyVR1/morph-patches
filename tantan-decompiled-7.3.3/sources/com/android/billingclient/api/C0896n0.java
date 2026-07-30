package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import p153l.bas0;
import p153l.tot0;
import p153l.vkb0;
import p153l.ydk0;

/* JADX INFO: renamed from: com.android.billingclient.api.n0 */
/* JADX INFO: loaded from: classes.dex */
final class C0896n0 {

    /* JADX INFO: renamed from: a */
    private final Context f4087a;

    /* JADX INFO: renamed from: b */
    private final vkb0 f4088b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0882g0 f4089c;

    /* JADX INFO: renamed from: d */
    private final zzm f4090d = new zzm(this, true);

    /* JADX INFO: renamed from: e */
    private final zzm f4091e = new zzm(this, false);

    /* JADX INFO: renamed from: f */
    private boolean f4092f;

    public C0896n0(Context context, vkb0 vkb0Var, tot0 tot0Var, bas0 bas0Var, ydk0 ydk0Var, InterfaceC0882g0 interfaceC0882g0) {
        this.f4087a = context;
        this.f4088b = vkb0Var;
        this.f4089c = interfaceC0882g0;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ bas0 m5062a(C0896n0 c0896n0) {
        c0896n0.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ ydk0 m5065e(C0896n0 c0896n0) {
        c0896n0.getClass();
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final vkb0 m5066d() {
        return this.f4088b;
    }

    /* JADX INFO: renamed from: f */
    public final void m5067f() {
        this.f4090d.m5085c(this.f4087a);
        this.f4091e.m5085c(this.f4087a);
    }

    /* JADX INFO: renamed from: g */
    public final void m5068g(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f4092f = z;
        this.f4091e.m5083a(this.f4087a, intentFilter2);
        boolean z2 = this.f4092f;
        zzm zzmVar = this.f4090d;
        if (z2) {
            zzmVar.m5084b(this.f4087a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            zzmVar.m5083a(this.f4087a, intentFilter);
        }
    }
}

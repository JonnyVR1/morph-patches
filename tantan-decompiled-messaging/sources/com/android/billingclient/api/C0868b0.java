package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.C2403p;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import p149l.y3v0;

/* JADX INFO: renamed from: com.android.billingclient.api.b0 */
/* JADX INFO: loaded from: classes.dex */
final class C0868b0 implements y3v0 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Consumer f3942a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Runnable f3943b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0874e0 f3944c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f3945d;

    public C0868b0(C0874e0 c0874e0, int i, Consumer consumer, Runnable runnable) {
        this.f3945d = i;
        this.f3942a = consumer;
        this.f3943b = runnable;
        this.f3944c = c0874e0;
    }

    @Override // p149l.y3v0
    public final void zza(Throwable th) {
        boolean z = th instanceof TimeoutException;
        C0874e0 c0874e0 = this.f3944c;
        if (z) {
            c0874e0.m4986e1(114, 28, C0880h0.f4033G);
            C2403p.m14921l("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            c0874e0.m4986e1(107, 28, C0880h0.f4033G);
            C2403p.m14921l("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f3943b.run();
    }

    @Override // p149l.y3v0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        C0874e0 c0874e0 = this.f3944c;
        if (!C0874e0.m4983b1(iIntValue)) {
            this.f3943b.run();
        } else {
            this.f3942a.accept(c0874e0.m4984c1(this.f3945d, num.intValue()));
        }
    }
}

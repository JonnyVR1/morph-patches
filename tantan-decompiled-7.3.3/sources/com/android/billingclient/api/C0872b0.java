package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.C2426p;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import p153l.edv0;

/* JADX INFO: renamed from: com.android.billingclient.api.b0 */
/* JADX INFO: loaded from: classes.dex */
final class C0872b0 implements edv0 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Consumer f3942a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Runnable f3943b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0878e0 f3944c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f3945d;

    public C0872b0(C0878e0 c0878e0, int i, Consumer consumer, Runnable runnable) {
        this.f3945d = i;
        this.f3942a = consumer;
        this.f3943b = runnable;
        this.f3944c = c0878e0;
    }

    @Override // p153l.edv0
    public final void zza(Throwable th) {
        boolean z = th instanceof TimeoutException;
        C0878e0 c0878e0 = this.f3944c;
        if (z) {
            c0878e0.m4996e1(114, 28, C0884h0.f4033G);
            C2426p.m14975l("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            c0878e0.m4996e1(107, 28, C0884h0.f4033G);
            C2426p.m14975l("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f3943b.run();
    }

    @Override // p153l.edv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        C0878e0 c0878e0 = this.f3944c;
        if (!C0878e0.m4993b1(iIntValue)) {
            this.f3943b.run();
        } else {
            this.f3942a.accept(c0878e0.m4994c1(this.f3945d, num.intValue()));
        }
    }
}

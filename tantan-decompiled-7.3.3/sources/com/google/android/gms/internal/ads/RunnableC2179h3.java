package com.google.android.gms.internal.ads;

import p153l.hpr;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h3 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2179h3<V> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AbstractC2227n3<V> f9952a;

    /* JADX INFO: renamed from: b */
    public final hpr<? extends V> f9953b;

    public RunnableC2179h3(AbstractC2227n3 abstractC2227n3, hpr hprVar) {
        this.f9952a = abstractC2227n3;
        this.f9953b = hprVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9952a.f10039a != this) {
            return;
        }
        hpr<? extends V> hprVar = this.f9953b;
        if (AbstractC2227n3.f10037f.mo12700f(this.f9952a, this, AbstractC2227n3.m13059g(hprVar))) {
            AbstractC2227n3.m13070z(this.f9952a, false);
        }
    }
}

package com.google.android.gms.internal.play_billing;

import p153l.lqv0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2412i<V> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AbstractC2424o<V> f10382a;

    /* JADX INFO: renamed from: b */
    public final lqv0<? extends V> f10383b;

    public RunnableC2412i(AbstractC2424o abstractC2424o, lqv0 lqv0Var) {
        this.f10382a = abstractC2424o;
        this.f10383b = lqv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10382a.f10403a != this) {
            return;
        }
        lqv0<? extends V> lqv0Var = this.f10383b;
        if (AbstractC2424o.f10401f.mo14837f(this.f10382a, this, AbstractC2424o.m14941r(lqv0Var))) {
            AbstractC2424o.m14943w(this.f10382a, false);
        }
    }
}

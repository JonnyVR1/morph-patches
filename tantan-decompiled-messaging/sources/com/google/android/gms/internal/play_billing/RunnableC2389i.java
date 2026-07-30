package com.google.android.gms.internal.play_billing;

import p149l.fhv0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2389i<V> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AbstractC2401o<V> f10345a;

    /* JADX INFO: renamed from: b */
    public final fhv0<? extends V> f10346b;

    public RunnableC2389i(AbstractC2401o abstractC2401o, fhv0 fhv0Var) {
        this.f10345a = abstractC2401o;
        this.f10346b = fhv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10345a.f10366a != this) {
            return;
        }
        fhv0<? extends V> fhv0Var = this.f10346b;
        if (AbstractC2401o.f10364f.mo14783f(this.f10345a, this, AbstractC2401o.m14887r(fhv0Var))) {
            AbstractC2401o.m14889w(this.f10345a, false);
        }
    }
}

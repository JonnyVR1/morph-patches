package com.google.android.gms.internal.ads;

import p149l.gnr;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h3 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC2156h3<V> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AbstractC2204n3<V> f9915a;

    /* JADX INFO: renamed from: b */
    public final gnr<? extends V> f9916b;

    public RunnableC2156h3(AbstractC2204n3 abstractC2204n3, gnr gnrVar) {
        this.f9915a = abstractC2204n3;
        this.f9916b = gnrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9915a.f10002a != this) {
            return;
        }
        gnr<? extends V> gnrVar = this.f9916b;
        if (AbstractC2204n3.f10000f.mo12646f(this.f9915a, this, AbstractC2204n3.m13005g(gnrVar))) {
            AbstractC2204n3.m13016z(this.f9915a, false);
        }
    }
}

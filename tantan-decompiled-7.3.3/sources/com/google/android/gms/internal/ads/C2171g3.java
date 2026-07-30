package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p153l.guw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2171g3 extends AbstractC2147d3 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater<C2219m3, Thread> f9929a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater<C2219m3, C2219m3> f9930b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater<AbstractC2227n3, C2219m3> f9931c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater<AbstractC2227n3, C2163f3> f9932d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater<AbstractC2227n3, Object> f9933e;

    public C2171g3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f9929a = atomicReferenceFieldUpdater;
        this.f9930b = atomicReferenceFieldUpdater2;
        this.f9931c = atomicReferenceFieldUpdater3;
        this.f9932d = atomicReferenceFieldUpdater4;
        this.f9933e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: a */
    public final C2163f3 mo12695a(AbstractC2227n3 abstractC2227n3, C2163f3 c2163f3) {
        return this.f9932d.getAndSet(abstractC2227n3, c2163f3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: b */
    public final C2219m3 mo12696b(AbstractC2227n3 abstractC2227n3, C2219m3 c2219m3) {
        return this.f9931c.getAndSet(abstractC2227n3, c2219m3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: c */
    public final void mo12697c(C2219m3 c2219m3, C2219m3 c2219m4) {
        this.f9930b.lazySet(c2219m3, c2219m4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: d */
    public final void mo12698d(C2219m3 c2219m3, Thread thread) {
        this.f9929a.lazySet(c2219m3, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: e */
    public final boolean mo12699e(AbstractC2227n3 abstractC2227n3, C2163f3 c2163f3, C2163f3 c2163f4) {
        return guw0.m132415a(this.f9932d, abstractC2227n3, c2163f3, c2163f4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: f */
    public final boolean mo12700f(AbstractC2227n3 abstractC2227n3, Object obj, Object obj2) {
        return guw0.m132415a(this.f9933e, abstractC2227n3, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2147d3
    /* JADX INFO: renamed from: g */
    public final boolean mo12701g(AbstractC2227n3 abstractC2227n3, C2219m3 c2219m3, C2219m3 c2219m4) {
        return guw0.m132415a(this.f9931c, abstractC2227n3, c2219m3, c2219m4);
    }
}

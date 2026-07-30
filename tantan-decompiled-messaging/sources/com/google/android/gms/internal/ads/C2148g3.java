package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p149l.alw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2148g3 extends AbstractC2124d3 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater<C2196m3, Thread> f9892a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater<C2196m3, C2196m3> f9893b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater<AbstractC2204n3, C2196m3> f9894c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater<AbstractC2204n3, C2140f3> f9895d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater<AbstractC2204n3, Object> f9896e;

    public C2148g3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f9892a = atomicReferenceFieldUpdater;
        this.f9893b = atomicReferenceFieldUpdater2;
        this.f9894c = atomicReferenceFieldUpdater3;
        this.f9895d = atomicReferenceFieldUpdater4;
        this.f9896e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: a */
    public final C2140f3 mo12641a(AbstractC2204n3 abstractC2204n3, C2140f3 c2140f3) {
        return this.f9895d.getAndSet(abstractC2204n3, c2140f3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: b */
    public final C2196m3 mo12642b(AbstractC2204n3 abstractC2204n3, C2196m3 c2196m3) {
        return this.f9894c.getAndSet(abstractC2204n3, c2196m3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: c */
    public final void mo12643c(C2196m3 c2196m3, C2196m3 c2196m4) {
        this.f9893b.lazySet(c2196m3, c2196m4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: d */
    public final void mo12644d(C2196m3 c2196m3, Thread thread) {
        this.f9892a.lazySet(c2196m3, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: e */
    public final boolean mo12645e(AbstractC2204n3 abstractC2204n3, C2140f3 c2140f3, C2140f3 c2140f4) {
        return alw0.m97455a(this.f9895d, abstractC2204n3, c2140f3, c2140f4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: f */
    public final boolean mo12646f(AbstractC2204n3 abstractC2204n3, Object obj, Object obj2) {
        return alw0.m97455a(this.f9896e, abstractC2204n3, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2124d3
    /* JADX INFO: renamed from: g */
    public final boolean mo12647g(AbstractC2204n3 abstractC2204n3, C2196m3 c2196m3, C2196m3 c2196m4) {
        return alw0.m97455a(this.f9894c, abstractC2204n3, c2196m3, c2196m4);
    }
}

package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p153l.e0v0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C2410h extends AbstractC2404e {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater<C2422n, Thread> f10364a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater<C2422n, C2422n> f10365b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater<? super AbstractC2424o<?>, C2422n> f10366c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater<? super AbstractC2424o<?>, C2408g> f10367d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater<? super AbstractC2424o<?>, Object> f10368e;

    public C2410h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f10364a = atomicReferenceFieldUpdater;
        this.f10365b = atomicReferenceFieldUpdater2;
        this.f10366c = atomicReferenceFieldUpdater3;
        this.f10367d = atomicReferenceFieldUpdater4;
        this.f10368e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: a */
    public final C2408g mo14832a(AbstractC2424o abstractC2424o, C2408g c2408g) {
        return this.f10367d.getAndSet(abstractC2424o, c2408g);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: b */
    public final C2422n mo14833b(AbstractC2424o abstractC2424o, C2422n c2422n) {
        return this.f10366c.getAndSet(abstractC2424o, c2422n);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: c */
    public final void mo14834c(C2422n c2422n, C2422n c2422n2) {
        this.f10365b.lazySet(c2422n, c2422n2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: d */
    public final void mo14835d(C2422n c2422n, Thread thread) {
        this.f10364a.lazySet(c2422n, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: e */
    public final boolean mo14836e(AbstractC2424o abstractC2424o, C2408g c2408g, C2408g c2408g2) {
        return e0v0.m118926a(this.f10367d, abstractC2424o, c2408g, c2408g2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: f */
    public final boolean mo14837f(AbstractC2424o abstractC2424o, Object obj, Object obj2) {
        return e0v0.m118926a(this.f10368e, abstractC2424o, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2404e
    /* JADX INFO: renamed from: g */
    public final boolean mo14838g(AbstractC2424o abstractC2424o, C2422n c2422n, C2422n c2422n2) {
        return e0v0.m118926a(this.f10366c, abstractC2424o, c2422n, c2422n2);
    }
}

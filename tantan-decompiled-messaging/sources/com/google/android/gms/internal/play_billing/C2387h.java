package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p149l.yqu0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C2387h extends AbstractC2381e {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater<C2399n, Thread> f10327a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater<C2399n, C2399n> f10328b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater<? super AbstractC2401o<?>, C2399n> f10329c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater<? super AbstractC2401o<?>, C2385g> f10330d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater<? super AbstractC2401o<?>, Object> f10331e;

    public C2387h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f10327a = atomicReferenceFieldUpdater;
        this.f10328b = atomicReferenceFieldUpdater2;
        this.f10329c = atomicReferenceFieldUpdater3;
        this.f10330d = atomicReferenceFieldUpdater4;
        this.f10331e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: a */
    public final C2385g mo14778a(AbstractC2401o abstractC2401o, C2385g c2385g) {
        return this.f10330d.getAndSet(abstractC2401o, c2385g);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: b */
    public final C2399n mo14779b(AbstractC2401o abstractC2401o, C2399n c2399n) {
        return this.f10329c.getAndSet(abstractC2401o, c2399n);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: c */
    public final void mo14780c(C2399n c2399n, C2399n c2399n2) {
        this.f10328b.lazySet(c2399n, c2399n2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: d */
    public final void mo14781d(C2399n c2399n, Thread thread) {
        this.f10327a.lazySet(c2399n, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: e */
    public final boolean mo14782e(AbstractC2401o abstractC2401o, C2385g c2385g, C2385g c2385g2) {
        return yqu0.m215765a(this.f10330d, abstractC2401o, c2385g, c2385g2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: f */
    public final boolean mo14783f(AbstractC2401o abstractC2401o, Object obj, Object obj2) {
        return yqu0.m215765a(this.f10331e, abstractC2401o, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2381e
    /* JADX INFO: renamed from: g */
    public final boolean mo14784g(AbstractC2401o abstractC2401o, C2399n c2399n, C2399n c2399n2) {
        return yqu0.m215765a(this.f10329c, abstractC2401o, c2399n, c2399n2);
    }
}

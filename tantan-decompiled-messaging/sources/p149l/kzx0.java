package p149l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes6.dex */
public final class kzx0 extends xov0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f125428a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f125429b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f125430c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f125431d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f125432e;

    public kzx0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f125428a = atomicReferenceFieldUpdater;
        this.f125429b = atomicReferenceFieldUpdater2;
        this.f125430c = atomicReferenceFieldUpdater3;
        this.f125431d = atomicReferenceFieldUpdater4;
        this.f125432e = atomicReferenceFieldUpdater5;
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: a */
    public final void mo147958a(mby0 mby0Var, mby0 mby0Var2) {
        this.f125429b.lazySet(mby0Var, mby0Var2);
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: b */
    public final void mo147959b(mby0 mby0Var, Thread thread) {
        this.f125428a.lazySet(mby0Var, thread);
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: c */
    public final boolean mo147960c(ohy0 ohy0Var, bpx0 bpx0Var, bpx0 bpx0Var2) {
        return eux0.m118224a(this.f125431d, ohy0Var, bpx0Var, bpx0Var2);
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: d */
    public final boolean mo147961d(ohy0 ohy0Var, Object obj, Object obj2) {
        return eux0.m118224a(this.f125432e, ohy0Var, obj, obj2);
    }

    @Override // p149l.xov0
    /* JADX INFO: renamed from: e */
    public final boolean mo147962e(ohy0 ohy0Var, mby0 mby0Var, mby0 mby0Var2) {
        return eux0.m118224a(this.f125430c, ohy0Var, mby0Var, mby0Var2);
    }
}

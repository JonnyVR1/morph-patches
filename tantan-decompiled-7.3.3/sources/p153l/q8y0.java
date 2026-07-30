package p153l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes6.dex */
public final class q8y0 extends dyv0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f156174a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f156175b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f156176c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f156177d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f156178e;

    public q8y0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f156174a = atomicReferenceFieldUpdater;
        this.f156175b = atomicReferenceFieldUpdater2;
        this.f156176c = atomicReferenceFieldUpdater3;
        this.f156177d = atomicReferenceFieldUpdater4;
        this.f156178e = atomicReferenceFieldUpdater5;
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: a */
    public final void mo97941a(sky0 sky0Var, sky0 sky0Var2) {
        this.f156175b.lazySet(sky0Var, sky0Var2);
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: b */
    public final void mo97942b(sky0 sky0Var, Thread thread) {
        this.f156174a.lazySet(sky0Var, thread);
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: c */
    public final boolean mo97943c(uqy0 uqy0Var, hyx0 hyx0Var, hyx0 hyx0Var2) {
        return k3y0.m148198a(this.f156177d, uqy0Var, hyx0Var, hyx0Var2);
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: d */
    public final boolean mo97944d(uqy0 uqy0Var, Object obj, Object obj2) {
        return k3y0.m148198a(this.f156178e, uqy0Var, obj, obj2);
    }

    @Override // p153l.dyv0
    /* JADX INFO: renamed from: e */
    public final boolean mo97945e(uqy0 uqy0Var, sky0 sky0Var, sky0 sky0Var2) {
        return k3y0.m148198a(this.f156176c, uqy0Var, sky0Var, sky0Var2);
    }
}

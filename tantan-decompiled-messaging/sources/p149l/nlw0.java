package p149l;

import com.google.android.gms.internal.ads.AbstractC2220p3;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes6.dex */
public final class nlw0 extends mlw0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f139590a;

    /* JADX INFO: renamed from: b */
    public final AtomicIntegerFieldUpdater f139591b;

    public nlw0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f139590a = atomicReferenceFieldUpdater;
        this.f139591b = atomicIntegerFieldUpdater;
    }

    @Override // p149l.mlw0
    /* JADX INFO: renamed from: a */
    public final int mo155282a(AbstractC2220p3 abstractC2220p3) {
        return this.f139591b.decrementAndGet(abstractC2220p3);
    }

    @Override // p149l.mlw0
    /* JADX INFO: renamed from: b */
    public final void mo155283b(AbstractC2220p3 abstractC2220p3, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f139590a;
            if (C21643z7.m217426a(atomicReferenceFieldUpdater, abstractC2220p3, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2220p3) == null);
    }
}

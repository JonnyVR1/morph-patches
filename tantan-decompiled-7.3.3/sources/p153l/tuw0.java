package p153l;

import com.google.android.gms.internal.ads.AbstractC2243p3;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes6.dex */
public final class tuw0 extends suw0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f176219a;

    /* JADX INFO: renamed from: b */
    public final AtomicIntegerFieldUpdater f176220b;

    public tuw0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f176219a = atomicReferenceFieldUpdater;
        this.f176220b = atomicIntegerFieldUpdater;
    }

    @Override // p153l.suw0
    /* JADX INFO: renamed from: a */
    public final int mo188098a(AbstractC2243p3 abstractC2243p3) {
        return this.f176220b.decrementAndGet(abstractC2243p3);
    }

    @Override // p153l.suw0
    /* JADX INFO: renamed from: b */
    public final void mo188099b(AbstractC2243p3 abstractC2243p3, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f176219a;
            if (C20511u7.m194801a(atomicReferenceFieldUpdater, abstractC2243p3, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2243p3) == null);
    }
}

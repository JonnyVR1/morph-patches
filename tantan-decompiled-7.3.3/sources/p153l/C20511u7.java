package p153l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.u7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20511u7 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m194801a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}

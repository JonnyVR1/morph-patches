package p153l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p9t0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m171391a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!m31.m156916a(atomicReference, null, obj2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}

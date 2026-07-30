package p149l;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class clw0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m107580a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}

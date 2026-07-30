package p149l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes7.dex */
public final class fz50 {
    /* JADX INFO: renamed from: a */
    public static void m123817a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}

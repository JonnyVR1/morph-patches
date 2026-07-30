package p153l;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes7.dex */
public final class k760 {
    /* JADX INFO: renamed from: a */
    public static void m148592a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}

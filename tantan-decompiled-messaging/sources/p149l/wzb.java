package p149l;

import android.util.LongSparseArray;

/* JADX INFO: loaded from: classes7.dex */
public class wzb {

    /* JADX INFO: renamed from: a */
    public static boolean f188716a = false;

    /* JADX INFO: renamed from: b */
    private static LongSparseArray<StackTraceElement[]> f188717b = new LongSparseArray<>();

    /* JADX INFO: renamed from: b */
    public static synchronized void m206250b() {
        if (f188716a) {
            Thread threadCurrentThread = Thread.currentThread();
            StackTraceElement[] stackTrace = threadCurrentThread.getStackTrace();
            if (f188717b.indexOfKey(threadCurrentThread.getId()) < 0) {
                f188717b.put(threadCurrentThread.getId(), stackTrace);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m206251c() {
        if (f188716a) {
            f188717b.remove(Thread.currentThread().getId());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m206249a(Exception exc) {
    }
}

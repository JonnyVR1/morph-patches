package p149l;

/* JADX INFO: loaded from: classes.dex */
public final class hxq0 {
    /* JADX INFO: renamed from: a */
    public static Thread m133368a(Runnable runnable, String str) {
        if (runnable == null) {
            return null;
        }
        Thread thread = str == null ? new Thread(runnable) : new Thread(runnable, str);
        thread.start();
        return thread;
    }
}

package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class n6r0 {
    /* JADX INFO: renamed from: a */
    public static Thread m161797a(Runnable runnable, String str) {
        if (runnable == null) {
            return null;
        }
        Thread thread = str == null ? new Thread(runnable) : new Thread(runnable, str);
        thread.start();
        return thread;
    }
}

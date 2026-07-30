package p153l;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes11.dex */
class up50 {

    /* JADX INFO: renamed from: a */
    private static HandlerThread f180220a;

    /* JADX INFO: renamed from: b */
    private static Handler f180221b;

    /* JADX INFO: renamed from: l.up50$a */
    public class RunnableC20610a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f180222a;

        public RunnableC20610a(Runnable runnable) {
            this.f180222a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f180222a.run();
            } catch (Exception e) {
                xu80.m213121b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.up50$b */
    public static class C20611b {
        private static up50 INSTANCE = new up50(null);
    }

    static {
        HandlerThread handlerThread = new HandlerThread("OneIdHandlerThread", 10);
        f180220a = handlerThread;
        handlerThread.start();
        f180221b = new Handler(f180220a.getLooper());
    }

    public /* synthetic */ up50(RunnableC20610a runnableC20610a) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public static up50 m197046b() {
        return C20611b.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m197047a(Runnable runnable, long j) {
        f180221b.postDelayed(new RunnableC20610a(runnable), j);
    }

    private up50() {
    }
}

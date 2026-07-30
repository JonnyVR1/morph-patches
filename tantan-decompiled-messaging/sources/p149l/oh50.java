package p149l;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes13.dex */
class oh50 {

    /* JADX INFO: renamed from: a */
    private static HandlerThread f143949a;

    /* JADX INFO: renamed from: b */
    private static Handler f143950b;

    /* JADX INFO: renamed from: l.oh50$a */
    public class RunnableC18935a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Runnable f143951a;

        public RunnableC18935a(Runnable runnable) {
            this.f143951a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f143951a.run();
            } catch (Exception e) {
                tm80.m189642b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.oh50$b */
    public static class C18936b {
        private static oh50 INSTANCE = new oh50(null);
    }

    static {
        HandlerThread handlerThread = new HandlerThread("OneIdHandlerThread", 10);
        f143949a = handlerThread;
        handlerThread.start();
        f143950b = new Handler(f143949a.getLooper());
    }

    public /* synthetic */ oh50(RunnableC18935a runnableC18935a) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public static oh50 m164325b() {
        return C18936b.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m164326a(Runnable runnable, long j) {
        f143950b.postDelayed(new RunnableC18935a(runnable), j);
    }

    private oh50() {
    }
}

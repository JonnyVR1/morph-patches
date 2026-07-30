package p149l;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes7.dex */
public class uu60 {

    /* JADX INFO: renamed from: c */
    private static uu60 f178322c = new uu60();

    /* JADX INFO: renamed from: a */
    private Handler f178323a;

    /* JADX INFO: renamed from: b */
    private HandlerThread f178324b;

    private uu60() {
        HandlerThread handlerThread = new HandlerThread(uu60.class.getSimpleName());
        handlerThread.start();
        this.f178323a = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static uu60 m195326a() {
        return f178322c;
    }

    /* JADX INFO: renamed from: b */
    public void m195327b() {
        try {
            this.f178324b.quitSafely();
            f178322c = null;
        } catch (Throwable unused) {
        }
    }
}

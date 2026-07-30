package p153l;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes7.dex */
public class a370 {

    /* JADX INFO: renamed from: c */
    private static a370 f68278c = new a370();

    /* JADX INFO: renamed from: a */
    private Handler f68279a;

    /* JADX INFO: renamed from: b */
    private HandlerThread f68280b;

    private a370() {
        HandlerThread handlerThread = new HandlerThread(a370.class.getSimpleName());
        handlerThread.start();
        this.f68279a = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static a370 m95774a() {
        return f68278c;
    }

    /* JADX INFO: renamed from: b */
    public void m95775b() {
        try {
            this.f68280b.quitSafely();
            f68278c = null;
        } catch (Throwable unused) {
        }
    }
}

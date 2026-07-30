package p149l;

import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes2.dex */
public class bjw {

    /* JADX INFO: renamed from: b */
    private static volatile bjw f75945b;

    /* JADX INFO: renamed from: a */
    private volatile int f75946a;

    private bjw() {
        this.f75946a = 0;
        this.f75946a = 0;
    }

    /* JADX INFO: renamed from: a */
    public static bjw m102233a() {
        if (f75945b == null) {
            synchronized (bjw.class) {
                try {
                    if (f75945b == null) {
                        f75945b = new bjw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f75945b;
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m102234b() {
        return this.f75946a > 0;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m102235c(MKWebView mKWebView) {
        this.f75946a++;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m102236d(MKWebView mKWebView) {
        this.f75946a--;
    }
}

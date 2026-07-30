package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class hfi0 {

    /* JADX INFO: renamed from: d */
    public static hfi0 f107484d;

    /* JADX INFO: renamed from: e */
    public static final Object f107485e = new Object();

    /* JADX INFO: renamed from: a */
    public HandlerThread f107486a;

    /* JADX INFO: renamed from: b */
    public Handler f107487b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, juh0> f107488c = new HashMap<>();

    public hfi0() {
        HandlerThread handlerThread = new HandlerThread("http-dns-thread");
        this.f107486a = handlerThread;
        handlerThread.start();
        this.f107487b = new Handler(this.f107486a.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static hfi0 m130761a() {
        if (f107484d == null) {
            synchronized (f107485e) {
                try {
                    if (f107484d == null) {
                        f107484d = new hfi0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f107484d;
    }

    /* JADX INFO: renamed from: b */
    public void m130762b(Runnable runnable) {
        this.f107487b.post(runnable);
    }

    /* JADX INFO: renamed from: c */
    public void m130763c(juh0 juh0Var, long j) {
        m130765e(juh0Var.mo106041a());
        this.f107488c.put(juh0Var.mo106041a(), juh0Var);
        this.f107487b.postDelayed(juh0Var, j);
    }

    /* JADX INFO: renamed from: d */
    public void m130764d() {
        this.f107487b.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: e */
    public void m130765e(String str) {
        if (this.f107488c.containsKey(str)) {
            this.f107487b.removeCallbacks(this.f107488c.remove(str));
        }
    }
}

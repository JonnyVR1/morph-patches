package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class hoi0 {

    /* JADX INFO: renamed from: d */
    public static hoi0 f110920d;

    /* JADX INFO: renamed from: e */
    public static final Object f110921e = new Object();

    /* JADX INFO: renamed from: a */
    public HandlerThread f110922a;

    /* JADX INFO: renamed from: b */
    public Handler f110923b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, r2i0> f110924c = new HashMap<>();

    public hoi0() {
        HandlerThread handlerThread = new HandlerThread("http-dns-thread");
        this.f110922a = handlerThread;
        handlerThread.start();
        this.f110923b = new Handler(this.f110922a.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static hoi0 m136434a() {
        if (f110920d == null) {
            synchronized (f110921e) {
                try {
                    if (f110920d == null) {
                        f110920d = new hoi0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f110920d;
    }

    /* JADX INFO: renamed from: b */
    public void m136435b(Runnable runnable) {
        this.f110923b.post(runnable);
    }

    /* JADX INFO: renamed from: c */
    public void m136436c(r2i0 r2i0Var, long j) {
        m136438e(r2i0Var.mo130570a());
        this.f110924c.put(r2i0Var.mo130570a(), r2i0Var);
        this.f110923b.postDelayed(r2i0Var, j);
    }

    /* JADX INFO: renamed from: d */
    public void m136437d() {
        this.f110923b.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: e */
    public void m136438e(String str) {
        if (this.f110924c.containsKey(str)) {
            this.f110923b.removeCallbacks(this.f110924c.remove(str));
        }
    }
}

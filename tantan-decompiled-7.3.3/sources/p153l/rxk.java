package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class rxk {

    /* JADX INFO: renamed from: a */
    public static List<String> f165345a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static List<String> f165346b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static List<Integer> f165347c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static List<Integer> f165348d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static String f165349e = "";

    /* JADX INFO: renamed from: f */
    private static Object f165350f = new Object();

    /* JADX INFO: renamed from: g */
    private static long f165351g = 0;

    /* JADX INFO: renamed from: h */
    private static HashMap<String, HandlerC19931a> f165352h = new HashMap<>();

    /* JADX INFO: renamed from: l.rxk$a */
    public static class HandlerC19931a extends Handler {

        /* JADX INFO: renamed from: a */
        String f165353a;

        /* JADX INFO: renamed from: b */
        int f165354b;

        /* JADX INFO: renamed from: c */
        HandlerThreadC19932b f165355c;

        public HandlerC19931a(String str, HandlerThreadC19932b handlerThreadC19932b) {
            super(handlerThreadC19932b.getLooper());
            this.f165353a = str;
            this.f165355c = handlerThreadC19932b;
        }

        /* JADX INFO: renamed from: a */
        public int m183551a() {
            int i = this.f165354b - 1;
            this.f165354b = i;
            if (i >= 0) {
                return i;
            }
            wtq0.m207906a("defRef called on dead thread");
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public int m183552b() {
            int i = this.f165354b + 1;
            this.f165354b = i;
            return i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            if (message.what == 0) {
                synchronized (rxk.f165350f) {
                    try {
                        if (this.f165354b == 0) {
                            rxk.f165352h.remove(this.f165353a);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    this.f165355c.m183553a();
                    this.f165355c = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.rxk$b */
    public static class HandlerThreadC19932b extends HandlerThread {

        /* JADX INFO: renamed from: a */
        private boolean f165356a;

        public HandlerThreadC19932b(String str) {
            super(str);
            this.f165356a = false;
        }

        /* JADX INFO: renamed from: a */
        public void m183553a() {
            this.f165356a = true;
            quitSafely();
            this.f165356a = false;
        }

        @Override // android.os.HandlerThread
        public boolean quit() {
            if (this.f165356a) {
                return super.quit();
            }
            wtq0.m207906a("HandlerThread borrowed from HandlerThreadPool cannot call quit directory, use HandlerThreadPool.returnThread() instead");
            return false;
        }

        @Override // android.os.HandlerThread
        public boolean quitSafely() {
            if (this.f165356a) {
                return super.quitSafely();
            }
            wtq0.m207906a("HandlerThread borrowed from HandlerThreadPool cannot call quitSafely directly, use HandlerThreadPool.returnThread() instead");
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static HandlerThread m183548c(String str) {
        HandlerC19931a handlerC19931a;
        synchronized (f165350f) {
            try {
                handlerC19931a = f165352h.get(str);
                if (handlerC19931a == null || handlerC19931a.f165355c == null) {
                    HandlerThreadC19932b handlerThreadC19932b = new HandlerThreadC19932b(str);
                    handlerThreadC19932b.start();
                    HandlerC19931a handlerC19931a2 = new HandlerC19931a(str, handlerThreadC19932b);
                    f165352h.put(str, handlerC19931a2);
                    handlerC19931a = handlerC19931a2;
                }
                handlerC19931a.removeMessages(0);
                handlerC19931a.m183552b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC19931a.f165355c;
    }

    /* JADX INFO: renamed from: d */
    public static void m183549d(HandlerThread handlerThread) {
        if (handlerThread == null) {
            return;
        }
        String name = handlerThread.getName();
        synchronized (f165350f) {
            try {
                HandlerC19931a handlerC19931a = f165352h.get(name);
                if (handlerC19931a == null) {
                    return;
                }
                if (handlerC19931a.m183551a() == 0) {
                    handlerC19931a.sendEmptyMessageDelayed(0, f165351g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m183550e(long j) {
        f165351g = j;
    }
}

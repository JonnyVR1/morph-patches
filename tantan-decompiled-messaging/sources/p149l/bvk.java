package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class bvk {

    /* JADX INFO: renamed from: a */
    public static List<String> f77457a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static List<String> f77458b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static List<Integer> f77459c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public static List<Integer> f77460d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static String f77461e = "";

    /* JADX INFO: renamed from: f */
    private static Object f77462f = new Object();

    /* JADX INFO: renamed from: g */
    private static long f77463g = 0;

    /* JADX INFO: renamed from: h */
    private static HashMap<String, HandlerC15986a> f77464h = new HashMap<>();

    /* JADX INFO: renamed from: l.bvk$a */
    public static class HandlerC15986a extends Handler {

        /* JADX INFO: renamed from: a */
        String f77465a;

        /* JADX INFO: renamed from: b */
        int f77466b;

        /* JADX INFO: renamed from: c */
        HandlerThreadC15987b f77467c;

        public HandlerC15986a(String str, HandlerThreadC15987b handlerThreadC15987b) {
            super(handlerThreadC15987b.getLooper());
            this.f77465a = str;
            this.f77467c = handlerThreadC15987b;
        }

        /* JADX INFO: renamed from: a */
        public int m104049a() {
            int i = this.f77466b - 1;
            this.f77466b = i;
            if (i >= 0) {
                return i;
            }
            qkq0.m175383a("defRef called on dead thread");
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public int m104050b() {
            int i = this.f77466b + 1;
            this.f77466b = i;
            return i;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z;
            if (message.what == 0) {
                synchronized (bvk.f77462f) {
                    try {
                        if (this.f77466b == 0) {
                            bvk.f77464h.remove(this.f77465a);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    this.f77467c.m104051a();
                    this.f77467c = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.bvk$b */
    public static class HandlerThreadC15987b extends HandlerThread {

        /* JADX INFO: renamed from: a */
        private boolean f77468a;

        public HandlerThreadC15987b(String str) {
            super(str);
            this.f77468a = false;
        }

        /* JADX INFO: renamed from: a */
        public void m104051a() {
            this.f77468a = true;
            quitSafely();
            this.f77468a = false;
        }

        @Override // android.os.HandlerThread
        public boolean quit() {
            if (this.f77468a) {
                return super.quit();
            }
            qkq0.m175383a("HandlerThread borrowed from HandlerThreadPool cannot call quit directory, use HandlerThreadPool.returnThread() instead");
            return false;
        }

        @Override // android.os.HandlerThread
        public boolean quitSafely() {
            if (this.f77468a) {
                return super.quitSafely();
            }
            qkq0.m175383a("HandlerThread borrowed from HandlerThreadPool cannot call quitSafely directly, use HandlerThreadPool.returnThread() instead");
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static HandlerThread m104046c(String str) {
        HandlerC15986a handlerC15986a;
        synchronized (f77462f) {
            try {
                handlerC15986a = f77464h.get(str);
                if (handlerC15986a == null || handlerC15986a.f77467c == null) {
                    HandlerThreadC15987b handlerThreadC15987b = new HandlerThreadC15987b(str);
                    handlerThreadC15987b.start();
                    HandlerC15986a handlerC15986a2 = new HandlerC15986a(str, handlerThreadC15987b);
                    f77464h.put(str, handlerC15986a2);
                    handlerC15986a = handlerC15986a2;
                }
                handlerC15986a.removeMessages(0);
                handlerC15986a.m104050b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC15986a.f77467c;
    }

    /* JADX INFO: renamed from: d */
    public static void m104047d(HandlerThread handlerThread) {
        if (handlerThread == null) {
            return;
        }
        String name = handlerThread.getName();
        synchronized (f77462f) {
            try {
                HandlerC15986a handlerC15986a = f77464h.get(name);
                if (handlerC15986a == null) {
                    return;
                }
                if (handlerC15986a.m104049a() == 0) {
                    handlerC15986a.sendEmptyMessageDelayed(0, f77463g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m104048e(long j) {
        f77463g = j;
    }
}

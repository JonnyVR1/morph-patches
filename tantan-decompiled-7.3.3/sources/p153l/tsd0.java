package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class tsd0 {

    /* JADX INFO: renamed from: a */
    public static HandlerThread f175975a;

    /* JADX INFO: renamed from: b */
    public static Handler f175976b;

    /* JADX INFO: renamed from: l.tsd0$a */
    public class RunnableC20388a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f175977a;

        public RunnableC20388a(Runnable runnable) {
            this.f175977a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f175977a.run();
            } catch (Exception e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.tsd0$b */
    public static class C20389b {
        private static tsd0 INSTANCE = new tsd0(null);
    }

    /* JADX INFO: renamed from: l.tsd0$c */
    public static class HandlerC20390c extends Handler {
        public HandlerC20390c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -1) {
                usd0.m197870j();
            } else if (i == 0) {
                usd0.m197868h();
                usd0.m197874n(50);
                tsd0.m192578e().m192586k(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            } else if (i == 4) {
                tsd0.m192578e().m192581f();
                tsd0.m192578e().m192586k(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
            super.handleMessage(message);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("SCStatisticsThread", 10);
        f175975a = handlerThread;
        handlerThread.start();
        HandlerC20390c handlerC20390c = new HandlerC20390c(f175975a.getLooper());
        f175976b = handlerC20390c;
        handlerC20390c.sendEmptyMessageDelayed(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    public /* synthetic */ tsd0(RunnableC20388a runnableC20388a) {
        this();
    }

    /* JADX INFO: renamed from: e */
    public static tsd0 m192578e() {
        return C20389b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public void m192579c(Runnable runnable) {
        f175976b.post(new RunnableC20388a(runnable));
    }

    /* JADX INFO: renamed from: d */
    public Handler m192580d() {
        return f175976b;
    }

    /* JADX INFO: renamed from: f */
    public final void m192581f() {
        f175976b.removeMessages(0);
        f175976b.removeMessages(-1);
    }

    /* JADX INFO: renamed from: g */
    public void m192582g(Message message) {
        if (message == null) {
            return;
        }
        f175976b.sendMessage(message);
    }

    /* JADX INFO: renamed from: h */
    public final void m192583h(Message message, long j) {
        if (message == null) {
            return;
        }
        if (message.what == -1) {
            if (f175976b.hasMessages(-1)) {
                return;
            } else {
                m192581f();
            }
        }
        f175976b.sendMessageDelayed(message, j);
    }

    /* JADX INFO: renamed from: i */
    public void m192584i(long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = -1;
        m192583h(messageObtain, j);
    }

    /* JADX INFO: renamed from: j */
    public void m192585j() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        m192582g(messageObtain);
    }

    /* JADX INFO: renamed from: k */
    public final void m192586k(int i, long j) {
        if (f175976b.hasMessages(i)) {
            return;
        }
        f175976b.sendEmptyMessageDelayed(i, j);
    }

    public tsd0() {
    }
}

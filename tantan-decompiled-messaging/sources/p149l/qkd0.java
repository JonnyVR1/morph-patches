package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class qkd0 {

    /* JADX INFO: renamed from: a */
    public static HandlerThread f155114a;

    /* JADX INFO: renamed from: b */
    public static Handler f155115b;

    /* JADX INFO: renamed from: l.qkd0$a */
    public class RunnableC19530a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f155116a;

        public RunnableC19530a(Runnable runnable) {
            this.f155116a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f155116a.run();
            } catch (Exception e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.qkd0$b */
    public static class C19531b {
        private static qkd0 INSTANCE = new qkd0(null);
    }

    /* JADX INFO: renamed from: l.qkd0$c */
    public static class HandlerC19532c extends Handler {
        public HandlerC19532c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -1) {
                rkd0.m179721j();
            } else if (i == 0) {
                rkd0.m179719h();
                rkd0.m179725n(50);
                qkd0.m175359e().m175367k(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            } else if (i == 4) {
                qkd0.m175359e().m175362f();
                qkd0.m175359e().m175367k(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            }
            super.handleMessage(message);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("SCStatisticsThread", 10);
        f155114a = handlerThread;
        handlerThread.start();
        HandlerC19532c handlerC19532c = new HandlerC19532c(f155114a.getLooper());
        f155115b = handlerC19532c;
        handlerC19532c.sendEmptyMessageDelayed(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
    }

    public /* synthetic */ qkd0(RunnableC19530a runnableC19530a) {
        this();
    }

    /* JADX INFO: renamed from: e */
    public static qkd0 m175359e() {
        return C19531b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public void m175360c(Runnable runnable) {
        f155115b.post(new RunnableC19530a(runnable));
    }

    /* JADX INFO: renamed from: d */
    public Handler m175361d() {
        return f155115b;
    }

    /* JADX INFO: renamed from: f */
    public final void m175362f() {
        f155115b.removeMessages(0);
        f155115b.removeMessages(-1);
    }

    /* JADX INFO: renamed from: g */
    public void m175363g(Message message) {
        if (message == null) {
            return;
        }
        f155115b.sendMessage(message);
    }

    /* JADX INFO: renamed from: h */
    public final void m175364h(Message message, long j) {
        if (message == null) {
            return;
        }
        if (message.what == -1) {
            if (f155115b.hasMessages(-1)) {
                return;
            } else {
                m175362f();
            }
        }
        f155115b.sendMessageDelayed(message, j);
    }

    /* JADX INFO: renamed from: i */
    public void m175365i(long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = -1;
        m175364h(messageObtain, j);
    }

    /* JADX INFO: renamed from: j */
    public void m175366j() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        m175363g(messageObtain);
    }

    /* JADX INFO: renamed from: k */
    public final void m175367k(int i, long j) {
        if (f155115b.hasMessages(i)) {
            return;
        }
        f155115b.sendEmptyMessageDelayed(i, j);
    }

    public qkd0() {
    }
}

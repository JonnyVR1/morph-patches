package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.foxstatistics.DefaultEnvironment;

/* JADX INFO: loaded from: classes13.dex */
public class my50 {

    /* JADX INFO: renamed from: a */
    public static HandlerThread f136252a;

    /* JADX INFO: renamed from: b */
    public static Handler f136253b;

    /* JADX INFO: renamed from: l.my50$a */
    public class RunnableC18588a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f136254a;

        public RunnableC18588a(Runnable runnable) {
            this.f136254a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f136254a.run();
            } catch (Exception e) {
                sm80.m184942b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.my50$b */
    public static class C18589b {
        private static my50 INSTANCE = new my50(null);
    }

    /* JADX INFO: renamed from: l.my50$c */
    public static class HandlerC18590c extends Handler {
        public HandlerC18590c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -1) {
                oy50.m166620l();
            } else if (i == 0) {
                oy50.m166617i();
                oy50.m166625q(50);
                my50.m156954e().m156962k(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                DefaultEnvironment.m81324c(zvf0.m220383e()).m81330i();
            } else if (i == 2) {
                oy50.m166624p(50);
                my50.m156954e().m156962k(2, 1000L);
            } else if (i == 4) {
                my50.m156954e().m156957f();
                my50.m156954e().m156962k(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                my50.m156954e().m156962k(2, 1000L);
            }
            super.handleMessage(message);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("StatisticsThread", 10);
        f136252a = handlerThread;
        handlerThread.start();
        HandlerC18590c handlerC18590c = new HandlerC18590c(f136252a.getLooper());
        f136253b = handlerC18590c;
        handlerC18590c.sendEmptyMessageDelayed(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        f136253b.sendEmptyMessageDelayed(2, 1000L);
    }

    public /* synthetic */ my50(RunnableC18588a runnableC18588a) {
        this();
    }

    /* JADX INFO: renamed from: e */
    public static my50 m156954e() {
        return C18589b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public void m156955c(Runnable runnable) {
        f136253b.post(new RunnableC18588a(runnable));
    }

    /* JADX INFO: renamed from: d */
    public Handler m156956d() {
        return f136253b;
    }

    /* JADX INFO: renamed from: f */
    public final void m156957f() {
        f136253b.removeMessages(0);
        f136253b.removeMessages(2);
        f136253b.removeMessages(-1);
    }

    /* JADX INFO: renamed from: g */
    public void m156958g(Message message) {
        if (message == null) {
            return;
        }
        f136253b.sendMessage(message);
    }

    /* JADX INFO: renamed from: h */
    public final void m156959h(Message message, long j) {
        if (message == null) {
            return;
        }
        if (message.what == -1) {
            if (f136253b.hasMessages(-1)) {
                return;
            } else {
                m156957f();
            }
        }
        f136253b.sendMessageDelayed(message, j);
    }

    /* JADX INFO: renamed from: i */
    public void m156960i(long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = -1;
        m156959h(messageObtain, j);
    }

    /* JADX INFO: renamed from: j */
    public void m156961j() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        m156958g(messageObtain);
    }

    /* JADX INFO: renamed from: k */
    public final void m156962k(int i, long j) {
        if (f136253b.hasMessages(i)) {
            return;
        }
        f136253b.sendEmptyMessageDelayed(i, j);
    }

    public my50() {
    }
}

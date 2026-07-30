package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.foxstatistics.DefaultEnvironment;

/* JADX INFO: loaded from: classes11.dex */
public class r660 {

    /* JADX INFO: renamed from: a */
    public static HandlerThread f161446a;

    /* JADX INFO: renamed from: b */
    public static Handler f161447b;

    /* JADX INFO: renamed from: l.r660$a */
    public class RunnableC19779a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f161448a;

        public RunnableC19779a(Runnable runnable) {
            this.f161448a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f161448a.run();
            } catch (Exception e) {
                wu80.m207938b(e);
            }
        }
    }

    /* JADX INFO: renamed from: l.r660$b */
    public static class C19780b {
        private static r660 INSTANCE = new r660(null);
    }

    /* JADX INFO: renamed from: l.r660$c */
    public static class HandlerC19781c extends Handler {
        public HandlerC19781c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -1) {
                t660.m189504l();
            } else if (i == 0) {
                t660.m189501i();
                t660.m189509q(50);
                r660.m179993e().m180001k(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                DefaultEnvironment.m82507c(i4g0.m138507e()).m82513i();
            } else if (i == 2) {
                t660.m189508p(50);
                r660.m179993e().m180001k(2, 1000L);
            } else if (i == 4) {
                r660.m179993e().m179996f();
                r660.m179993e().m180001k(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                r660.m179993e().m180001k(2, 1000L);
            }
            super.handleMessage(message);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("StatisticsThread", 10);
        f161446a = handlerThread;
        handlerThread.start();
        HandlerC19781c handlerC19781c = new HandlerC19781c(f161446a.getLooper());
        f161447b = handlerC19781c;
        handlerC19781c.sendEmptyMessageDelayed(0, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        f161447b.sendEmptyMessageDelayed(2, 1000L);
    }

    public /* synthetic */ r660(RunnableC19779a runnableC19779a) {
        this();
    }

    /* JADX INFO: renamed from: e */
    public static r660 m179993e() {
        return C19780b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public void m179994c(Runnable runnable) {
        f161447b.post(new RunnableC19779a(runnable));
    }

    /* JADX INFO: renamed from: d */
    public Handler m179995d() {
        return f161447b;
    }

    /* JADX INFO: renamed from: f */
    public final void m179996f() {
        f161447b.removeMessages(0);
        f161447b.removeMessages(2);
        f161447b.removeMessages(-1);
    }

    /* JADX INFO: renamed from: g */
    public void m179997g(Message message) {
        if (message == null) {
            return;
        }
        f161447b.sendMessage(message);
    }

    /* JADX INFO: renamed from: h */
    public final void m179998h(Message message, long j) {
        if (message == null) {
            return;
        }
        if (message.what == -1) {
            if (f161447b.hasMessages(-1)) {
                return;
            } else {
                m179996f();
            }
        }
        f161447b.sendMessageDelayed(message, j);
    }

    /* JADX INFO: renamed from: i */
    public void m179999i(long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = -1;
        m179998h(messageObtain, j);
    }

    /* JADX INFO: renamed from: j */
    public void m180000j() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        m179997g(messageObtain);
    }

    /* JADX INFO: renamed from: k */
    public final void m180001k(int i, long j) {
        if (f161447b.hasMessages(i)) {
            return;
        }
        f161447b.sendEmptyMessageDelayed(i, j);
    }

    public r660() {
    }
}

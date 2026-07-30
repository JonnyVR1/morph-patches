package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class wrb {

    /* JADX INFO: renamed from: g */
    public static int f187778g = 500;

    /* JADX INFO: renamed from: a */
    public int f187779a;

    /* JADX INFO: renamed from: b */
    public HandlerThread f187780b;

    /* JADX INFO: renamed from: c */
    public Handler f187781c;

    /* JADX INFO: renamed from: d */
    public long f187782d;

    /* JADX INFO: renamed from: e */
    public boolean f187783e;

    /* JADX INFO: renamed from: f */
    public LinkedList<Long> f187784f;

    /* JADX INFO: renamed from: l.wrb$a */
    public class HandlerC20945a extends Handler {
        public HandlerC20945a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            wrb.this.f187784f.add(Long.valueOf((jCurrentTimeMillis - wrb.this.f187782d) - ((long) wrb.f187778g)));
            wrb.this.f187782d = jCurrentTimeMillis;
            sendEmptyMessageDelayed(1, wrb.f187778g);
            if (wrb.this.f187784f.size() >= 30) {
                wrb.this.f187784f.pop();
            }
        }
    }

    public wrb(int i) {
        this.f187782d = 0L;
        this.f187783e = false;
        this.f187784f = new LinkedList<>();
        this.f187779a = i;
        HandlerThread handlerThread = new HandlerThread("cpu-check-thread");
        this.f187780b = handlerThread;
        handlerThread.start();
        this.f187781c = m205173e(this.f187780b.getLooper());
    }

    /* JADX INFO: renamed from: d */
    public List<Long> m205172d() {
        return this.f187784f;
    }

    /* JADX INFO: renamed from: e */
    public final Handler m205173e(Looper looper) {
        return new HandlerC20945a(looper);
    }

    /* JADX INFO: renamed from: f */
    public void m205174f() {
        if (this.f187783e) {
            return;
        }
        this.f187783e = true;
        this.f187782d = System.currentTimeMillis();
        this.f187781c.sendEmptyMessageDelayed(1, f187778g);
    }

    public wrb() {
        this(f187778g);
    }
}

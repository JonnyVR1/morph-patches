package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ktb {

    /* JADX INFO: renamed from: g */
    public static int f128665g = 500;

    /* JADX INFO: renamed from: a */
    public int f128666a;

    /* JADX INFO: renamed from: b */
    public HandlerThread f128667b;

    /* JADX INFO: renamed from: c */
    public Handler f128668c;

    /* JADX INFO: renamed from: d */
    public long f128669d;

    /* JADX INFO: renamed from: e */
    public boolean f128670e;

    /* JADX INFO: renamed from: f */
    public LinkedList<Long> f128671f;

    /* JADX INFO: renamed from: l.ktb$a */
    public class HandlerC18257a extends Handler {
        public HandlerC18257a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            ktb.this.f128671f.add(Long.valueOf((jCurrentTimeMillis - ktb.this.f128669d) - ((long) ktb.f128665g)));
            ktb.this.f128669d = jCurrentTimeMillis;
            sendEmptyMessageDelayed(1, ktb.f128665g);
            if (ktb.this.f128671f.size() >= 30) {
                ktb.this.f128671f.pop();
            }
        }
    }

    public ktb(int i) {
        this.f128669d = 0L;
        this.f128670e = false;
        this.f128671f = new LinkedList<>();
        this.f128666a = i;
        HandlerThread handlerThread = new HandlerThread("cpu-check-thread");
        this.f128667b = handlerThread;
        handlerThread.start();
        this.f128668c = m151346e(this.f128667b.getLooper());
    }

    /* JADX INFO: renamed from: d */
    public List<Long> m151345d() {
        return this.f128671f;
    }

    /* JADX INFO: renamed from: e */
    public final Handler m151346e(Looper looper) {
        return new HandlerC18257a(looper);
    }

    /* JADX INFO: renamed from: f */
    public void m151347f() {
        if (this.f128670e) {
            return;
        }
        this.f128670e = true;
        this.f128669d = System.currentTimeMillis();
        this.f128668c.sendEmptyMessageDelayed(1, f128665g);
    }

    public ktb() {
        this(f128665g);
    }
}

package p149l;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(16)
public class wsf {

    /* JADX INFO: renamed from: g */
    private static Handler f187917g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    private AtomicBoolean f187918a;

    /* JADX INFO: renamed from: b */
    private ChoreographerFrameCallbackC20952c f187919b;

    /* JADX INFO: renamed from: c */
    private long f187920c;

    /* JADX INFO: renamed from: d */
    private int f187921d;

    /* JADX INFO: renamed from: e */
    private volatile int f187922e;

    /* JADX INFO: renamed from: f */
    private volatile C20953d f187923f;

    /* JADX INFO: renamed from: l.wsf$a */
    public class RunnableC20950a implements Runnable {
        public RunnableC20950a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wsf.this.f187918a.get()) {
                return;
            }
            wsf.this.f187918a.set(true);
            wsf.this.m205489l();
        }
    }

    /* JADX INFO: renamed from: l.wsf$b */
    public class RunnableC20951b implements Runnable {
        public RunnableC20951b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wsf.this.f187918a.get()) {
                Choreographer.getInstance().removeFrameCallback(wsf.this.f187919b);
                wsf.this.f187918a.set(false);
                wsf.f187917g.removeCallbacksAndMessages(null);
                wsf.this.m205488k();
            }
        }
    }

    /* JADX INFO: renamed from: l.wsf$c */
    public static class ChoreographerFrameCallbackC20952c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a */
        private final WeakReference<wsf> f187926a;

        public ChoreographerFrameCallbackC20952c(wsf wsfVar) {
            this.f187926a = new WeakReference<>(wsfVar);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            wsf wsfVar = this.f187926a.get();
            if (wsfVar == null) {
                return;
            }
            wsfVar.m205487j(j);
        }
    }

    /* JADX INFO: renamed from: l.wsf$e */
    public static class C20954e {
        private static wsf INSTANCE = new wsf(null);
    }

    private wsf() {
        this.f187918a = new AtomicBoolean(false);
        this.f187919b = new ChoreographerFrameCallbackC20952c(this);
    }

    /* JADX INFO: renamed from: h */
    public static wsf m205486h() {
        return C20954e.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m205487j(long j) {
        long j2 = this.f187920c;
        if (j2 == 0) {
            this.f187920c = j;
            this.f187921d = 0;
        } else {
            int i = this.f187921d + 1;
            this.f187921d = i;
            if ((j - j2) / 1000000 >= 1000) {
                this.f187922e = Math.min(60, i);
                this.f187920c = j;
                this.f187921d = 0;
                if (this.f187923f == null) {
                    this.f187923f = new C20953d(this, null);
                }
                this.f187923f.m205493a(this.f187922e);
            }
        }
        m205489l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m205488k() {
        this.f187920c = 0L;
        this.f187921d = 0;
        this.f187922e = 0;
        this.f187923f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m205489l() {
        Choreographer.getInstance().postFrameCallback(this.f187919b);
    }

    /* JADX INFO: renamed from: i */
    public int m205490i() {
        if (this.f187923f == null) {
            return this.f187922e;
        }
        float fM205494b = this.f187923f.m205494b();
        StringBuilder sb = new StringBuilder("getFPS: ");
        sb.append(fM205494b);
        sb.append(", ");
        sb.append(Looper.myLooper() == Looper.getMainLooper());
        hjx.m131418a("FPSMonitor", sb.toString());
        return (int) fM205494b;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: m */
    public void m205491m() {
        StringBuilder sb = new StringBuilder("fps start: , ");
        sb.append(Looper.myLooper() == Looper.getMainLooper());
        hjx.m131418a("FPSMonitor", sb.toString());
        f187917g.post(new RunnableC20950a());
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: n */
    public void m205492n() {
        StringBuilder sb = new StringBuilder("fps stop: , ");
        sb.append(Looper.myLooper() == Looper.getMainLooper());
        hjx.m131418a("FPSMonitor", sb.toString());
        f187917g.post(new RunnableC20951b());
    }

    /* JADX INFO: renamed from: l.wsf$d */
    public class C20953d {

        /* JADX INFO: renamed from: a */
        AtomicInteger f187927a;

        /* JADX INFO: renamed from: b */
        AtomicInteger f187928b;

        private C20953d() {
            this.f187927a = new AtomicInteger();
            this.f187928b = new AtomicInteger();
        }

        /* JADX INFO: renamed from: a */
        public void m205493a(int i) {
            this.f187928b.getAndIncrement();
            this.f187927a.addAndGet(i);
            StringBuilder sb = new StringBuilder("drop: ");
            sb.append(this.f187928b);
            sb.append(", ");
            sb.append(this.f187927a);
            sb.append(Looper.myLooper() == Looper.getMainLooper());
            sb.append(", ");
            sb.append(wsf.this.f187922e);
            hjx.m131418a("FPSMonitor", sb.toString());
        }

        /* JADX INFO: renamed from: b */
        public float m205494b() {
            float fMin = Math.min(60.0f, this.f187927a.floatValue() / this.f187928b.floatValue());
            StringBuilder sb = new StringBuilder("report: ");
            sb.append(this.f187928b);
            sb.append(", ");
            sb.append(this.f187927a);
            sb.append(", ");
            sb.append(fMin);
            sb.append(Looper.myLooper() == Looper.getMainLooper());
            hjx.m131418a("FPSMonitor", sb.toString());
            this.f187928b.set(0);
            this.f187927a.set(0);
            return fMin;
        }

        public /* synthetic */ C20953d(wsf wsfVar, RunnableC20950a runnableC20950a) {
            this();
        }
    }

    public /* synthetic */ wsf(RunnableC20950a runnableC20950a) {
        this();
    }
}

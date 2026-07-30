package p153l;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(16)
public class kuf {

    /* JADX INFO: renamed from: g */
    private static Handler f128852g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    private AtomicBoolean f128853a;

    /* JADX INFO: renamed from: b */
    private ChoreographerFrameCallbackC18269c f128854b;

    /* JADX INFO: renamed from: c */
    private long f128855c;

    /* JADX INFO: renamed from: d */
    private int f128856d;

    /* JADX INFO: renamed from: e */
    private volatile int f128857e;

    /* JADX INFO: renamed from: f */
    private volatile C18270d f128858f;

    /* JADX INFO: renamed from: l.kuf$a */
    public class RunnableC18267a implements Runnable {
        public RunnableC18267a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (kuf.this.f128853a.get()) {
                return;
            }
            kuf.this.f128853a.set(true);
            kuf.this.m151518l();
        }
    }

    /* JADX INFO: renamed from: l.kuf$b */
    public class RunnableC18268b implements Runnable {
        public RunnableC18268b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (kuf.this.f128853a.get()) {
                Choreographer.getInstance().removeFrameCallback(kuf.this.f128854b);
                kuf.this.f128853a.set(false);
                kuf.f128852g.removeCallbacksAndMessages(null);
                kuf.this.m151517k();
            }
        }
    }

    /* JADX INFO: renamed from: l.kuf$c */
    public static class ChoreographerFrameCallbackC18269c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a */
        private final WeakReference<kuf> f128861a;

        public ChoreographerFrameCallbackC18269c(kuf kufVar) {
            this.f128861a = new WeakReference<>(kufVar);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            kuf kufVar = this.f128861a.get();
            if (kufVar == null) {
                return;
            }
            kufVar.m151516j(j);
        }
    }

    /* JADX INFO: renamed from: l.kuf$e */
    public static class C18271e {
        private static kuf INSTANCE = new kuf(null);
    }

    private kuf() {
        this.f128853a = new AtomicBoolean(false);
        this.f128854b = new ChoreographerFrameCallbackC18269c(this);
    }

    /* JADX INFO: renamed from: h */
    public static kuf m151515h() {
        return C18271e.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m151516j(long j) {
        long j2 = this.f128855c;
        if (j2 == 0) {
            this.f128855c = j;
            this.f128856d = 0;
        } else {
            int i = this.f128856d + 1;
            this.f128856d = i;
            if ((j - j2) / 1000000 >= 1000) {
                this.f128857e = Math.min(60, i);
                this.f128855c = j;
                this.f128856d = 0;
                if (this.f128858f == null) {
                    this.f128858f = new C18270d(this, null);
                }
                this.f128858f.m151522a(this.f128857e);
            }
        }
        m151518l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m151517k() {
        this.f128855c = 0L;
        this.f128856d = 0;
        this.f128857e = 0;
        this.f128858f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m151518l() {
        Choreographer.getInstance().postFrameCallback(this.f128854b);
    }

    /* JADX INFO: renamed from: i */
    public int m151519i() {
        if (this.f128858f == null) {
            return this.f128857e;
        }
        float fM151523b = this.f128858f.m151523b();
        StringBuilder sb = new StringBuilder("getFPS: ");
        sb.append(fM151523b);
        sb.append(", ");
        sb.append(Looper.myLooper() == Looper.getMainLooper());
        esx.m122396a("FPSMonitor", sb.toString());
        return (int) fM151523b;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: m */
    public void m151520m() {
        StringBuilder sb = new StringBuilder("fps start: , ");
        sb.append(Looper.myLooper() == Looper.getMainLooper());
        esx.m122396a("FPSMonitor", sb.toString());
        f128852g.post(new RunnableC18267a());
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: n */
    public void m151521n() {
        StringBuilder sb = new StringBuilder("fps stop: , ");
        sb.append(Looper.myLooper() == Looper.getMainLooper());
        esx.m122396a("FPSMonitor", sb.toString());
        f128852g.post(new RunnableC18268b());
    }

    /* JADX INFO: renamed from: l.kuf$d */
    public class C18270d {

        /* JADX INFO: renamed from: a */
        AtomicInteger f128862a;

        /* JADX INFO: renamed from: b */
        AtomicInteger f128863b;

        private C18270d() {
            this.f128862a = new AtomicInteger();
            this.f128863b = new AtomicInteger();
        }

        /* JADX INFO: renamed from: a */
        public void m151522a(int i) {
            this.f128863b.getAndIncrement();
            this.f128862a.addAndGet(i);
            StringBuilder sb = new StringBuilder("drop: ");
            sb.append(this.f128863b);
            sb.append(", ");
            sb.append(this.f128862a);
            sb.append(Looper.myLooper() == Looper.getMainLooper());
            sb.append(", ");
            sb.append(kuf.this.f128857e);
            esx.m122396a("FPSMonitor", sb.toString());
        }

        /* JADX INFO: renamed from: b */
        public float m151523b() {
            float fMin = Math.min(60.0f, this.f128862a.floatValue() / this.f128863b.floatValue());
            StringBuilder sb = new StringBuilder("report: ");
            sb.append(this.f128863b);
            sb.append(", ");
            sb.append(this.f128862a);
            sb.append(", ");
            sb.append(fMin);
            sb.append(Looper.myLooper() == Looper.getMainLooper());
            esx.m122396a("FPSMonitor", sb.toString());
            this.f128863b.set(0);
            this.f128862a.set(0);
            return fMin;
        }

        public /* synthetic */ C18270d(kuf kufVar, RunnableC18267a runnableC18267a) {
            this();
        }
    }

    public /* synthetic */ kuf(RunnableC18267a runnableC18267a) {
        this();
    }
}

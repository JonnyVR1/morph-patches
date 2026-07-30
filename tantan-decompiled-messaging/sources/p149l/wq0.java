package p149l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p149l.uq0;

/* JADX INFO: loaded from: classes.dex */
public class wq0<T extends uq0> extends vq0<T> {

    /* JADX INFO: renamed from: e */
    public final by00 f187598e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f187599f;

    /* JADX INFO: renamed from: g */
    public boolean f187600g;

    /* JADX INFO: renamed from: h */
    public long f187601h;

    /* JADX INFO: renamed from: i */
    public long f187602i;

    /* JADX INFO: renamed from: j */
    public long f187603j;

    /* JADX INFO: renamed from: k */
    public InterfaceC20939b f187604k;

    /* JADX INFO: renamed from: l */
    public final Runnable f187605l;

    /* JADX INFO: renamed from: l.wq0$a */
    public class RunnableC20938a implements Runnable {
        public RunnableC20938a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (wq0.this) {
                try {
                    wq0.this.f187600g = false;
                    boolean zM204965p = wq0.this.m204965p();
                    wq0 wq0Var = wq0.this;
                    if (!zM204965p) {
                        wq0Var.m204966q();
                    } else if (wq0Var.f187604k != null) {
                        wq0.this.f187604k.mo191276j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.wq0$b */
    public interface InterfaceC20939b {
        /* JADX INFO: renamed from: j */
        void mo191276j();
    }

    public wq0(T t, InterfaceC20939b interfaceC20939b, by00 by00Var, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f187600g = false;
        this.f187602i = 2000L;
        this.f187603j = 1000L;
        this.f187605l = new RunnableC20938a();
        this.f187604k = interfaceC20939b;
        this.f187598e = by00Var;
        this.f187599f = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: n */
    public static <T extends uq0> vq0<T> m204963n(T t, InterfaceC20939b interfaceC20939b, by00 by00Var, ScheduledExecutorService scheduledExecutorService) {
        return new wq0(t, interfaceC20939b, by00Var, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: o */
    public static <T extends uq0 & InterfaceC20939b> vq0<T> m204964o(T t, by00 by00Var, ScheduledExecutorService scheduledExecutorService) {
        return m204963n(t, (InterfaceC20939b) t, by00Var, scheduledExecutorService);
    }

    @Override // p149l.vq0, p149l.uq0
    /* JADX INFO: renamed from: i */
    public boolean mo191275i(Drawable drawable, Canvas canvas, int i) {
        this.f187601h = this.f187598e.now();
        boolean zMo191275i = super.mo191275i(drawable, canvas, i);
        m204966q();
        return zMo191275i;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m204965p() {
        return this.f187598e.now() - this.f187601h > this.f187602i;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m204966q() {
        if (!this.f187600g) {
            this.f187600g = true;
            this.f187599f.schedule(this.f187605l, this.f187603j, TimeUnit.MILLISECONDS);
        }
    }
}

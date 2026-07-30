package p153l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p153l.yq0;

/* JADX INFO: loaded from: classes.dex */
public class ar0<T extends yq0> extends zq0<T> {

    /* JADX INFO: renamed from: e */
    public final l610 f72889e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f72890f;

    /* JADX INFO: renamed from: g */
    public boolean f72891g;

    /* JADX INFO: renamed from: h */
    public long f72892h;

    /* JADX INFO: renamed from: i */
    public long f72893i;

    /* JADX INFO: renamed from: j */
    public long f72894j;

    /* JADX INFO: renamed from: k */
    public InterfaceC15804b f72895k;

    /* JADX INFO: renamed from: l */
    public final Runnable f72896l;

    /* JADX INFO: renamed from: l.ar0$a */
    public class RunnableC15803a implements Runnable {
        public RunnableC15803a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ar0.this) {
                try {
                    ar0.this.f72891g = false;
                    boolean zM99581p = ar0.this.m99581p();
                    ar0 ar0Var = ar0.this;
                    if (!zM99581p) {
                        ar0Var.m99582q();
                    } else if (ar0Var.f72895k != null) {
                        ar0.this.f72895k.mo99583j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.ar0$b */
    public interface InterfaceC15804b {
        /* JADX INFO: renamed from: j */
        void mo99583j();
    }

    public ar0(T t, InterfaceC15804b interfaceC15804b, l610 l610Var, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f72891g = false;
        this.f72893i = 2000L;
        this.f72894j = 1000L;
        this.f72896l = new RunnableC15803a();
        this.f72895k = interfaceC15804b;
        this.f72889e = l610Var;
        this.f72890f = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: n */
    public static <T extends yq0> zq0<T> m99578n(T t, InterfaceC15804b interfaceC15804b, l610 l610Var, ScheduledExecutorService scheduledExecutorService) {
        return new ar0(t, interfaceC15804b, l610Var, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: o */
    public static <T extends yq0 & InterfaceC15804b> zq0<T> m99579o(T t, l610 l610Var, ScheduledExecutorService scheduledExecutorService) {
        return m99578n(t, (InterfaceC15804b) t, l610Var, scheduledExecutorService);
    }

    @Override // p153l.zq0, p153l.yq0
    /* JADX INFO: renamed from: i */
    public boolean mo99580i(Drawable drawable, Canvas canvas, int i) {
        this.f72892h = this.f72889e.now();
        boolean zMo99580i = super.mo99580i(drawable, canvas, i);
        m99582q();
        return zMo99580i;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m99581p() {
        return this.f72889e.now() - this.f72892h > this.f72893i;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m99582q() {
        if (!this.f72891g) {
            this.f72891g = true;
            this.f72890f.schedule(this.f72896l, this.f72894j, TimeUnit.MILLISECONDS);
        }
    }
}

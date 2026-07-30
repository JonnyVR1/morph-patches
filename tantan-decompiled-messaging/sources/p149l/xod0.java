package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class xod0<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public String f193827a;

    /* JADX INFO: renamed from: b */
    public final grl<T> f193828b;

    /* JADX INFO: renamed from: c */
    public int f193829c;

    /* JADX INFO: renamed from: d */
    public final int f193830d;

    /* JADX INFO: renamed from: e */
    public final long f193831e;

    /* JADX INFO: renamed from: f */
    public final long f193832f;

    /* JADX INFO: renamed from: g */
    public yei0 f193833g = xei0.m208579a();

    /* JADX INFO: renamed from: h */
    public Handler f193834h;

    /* JADX INFO: renamed from: l.xod0$a */
    public class RunnableC21192a implements Runnable {
        public RunnableC21192a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (xod0.this.f193829c >= xod0.this.f193830d) {
                return;
            }
            xod0.this.f193828b.mo81151b(xod0.this.mo210412i(), xod0.this.f193827a);
            int iM210406c = xod0.m210406c(xod0.this);
            int i = xod0.this.f193830d;
            xod0 xod0Var = xod0.this;
            if (iM210406c < i) {
                xod0Var.m210413j().postDelayed(this, xod0.this.f193831e);
            } else {
                xod0Var.f193828b.mo81150a(xod0.this.f193827a);
            }
        }
    }

    /* JADX INFO: renamed from: l.xod0$b */
    public class RunnableC21193b implements Runnable {
        public RunnableC21193b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xod0.this.f193828b.mo81150a(xod0.this.f193827a);
            xod0 xod0Var = xod0.this;
            xod0Var.f193829c = xod0Var.f193830d;
        }
    }

    public xod0(@NonNull String str, @NonNull grl<T> grlVar, long j, long j2, int i) {
        this.f193827a = str;
        this.f193828b = grlVar;
        this.f193832f = j;
        this.f193831e = j2;
        this.f193830d = i;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m210406c(xod0 xod0Var) {
        int i = xod0Var.f193829c;
        xod0Var.f193829c = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: i */
    public abstract T mo210412i();

    /* JADX INFO: renamed from: j */
    public final Handler m210413j() {
        Handler handler;
        synchronized (this) {
            try {
                if (this.f193834h == null) {
                    this.f193834h = new Handler(Looper.getMainLooper());
                }
                handler = this.f193834h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: k */
    public void m210414k() {
        this.f193829c = 0;
    }

    /* JADX INFO: renamed from: l */
    public void m210415l() {
        m210414k();
        m210413j().postDelayed(this, this.f193832f);
    }

    /* JADX INFO: renamed from: m */
    public void m210416m() {
        m210413j().removeMessages(0);
        this.f193833g.m214349a(new RunnableC21193b());
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f193833g.m214349a(new RunnableC21192a());
    }
}

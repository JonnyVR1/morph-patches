package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class zwd0<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public String f206333a;

    /* JADX INFO: renamed from: b */
    public final utl<T> f206334b;

    /* JADX INFO: renamed from: c */
    public int f206335c;

    /* JADX INFO: renamed from: d */
    public final int f206336d;

    /* JADX INFO: renamed from: e */
    public final long f206337e;

    /* JADX INFO: renamed from: f */
    public final long f206338f;

    /* JADX INFO: renamed from: g */
    public yni0 f206339g = xni0.m212209a();

    /* JADX INFO: renamed from: h */
    public Handler f206340h;

    /* JADX INFO: renamed from: l.zwd0$a */
    public class RunnableC21911a implements Runnable {
        public RunnableC21911a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (zwd0.this.f206335c >= zwd0.this.f206336d) {
                return;
            }
            zwd0.this.f206334b.mo82334b(zwd0.this.mo178808i(), zwd0.this.f206333a);
            int iM221864c = zwd0.m221864c(zwd0.this);
            int i = zwd0.this.f206336d;
            zwd0 zwd0Var = zwd0.this;
            if (iM221864c < i) {
                zwd0Var.m221870j().postDelayed(this, zwd0.this.f206337e);
            } else {
                zwd0Var.f206334b.mo82333a(zwd0.this.f206333a);
            }
        }
    }

    /* JADX INFO: renamed from: l.zwd0$b */
    public class RunnableC21912b implements Runnable {
        public RunnableC21912b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zwd0.this.f206334b.mo82333a(zwd0.this.f206333a);
            zwd0 zwd0Var = zwd0.this;
            zwd0Var.f206335c = zwd0Var.f206336d;
        }
    }

    public zwd0(@NonNull String str, @NonNull utl<T> utlVar, long j, long j2, int i) {
        this.f206333a = str;
        this.f206334b = utlVar;
        this.f206338f = j;
        this.f206337e = j2;
        this.f206336d = i;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m221864c(zwd0 zwd0Var) {
        int i = zwd0Var.f206335c;
        zwd0Var.f206335c = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: i */
    public abstract T mo178808i();

    /* JADX INFO: renamed from: j */
    public final Handler m221870j() {
        Handler handler;
        synchronized (this) {
            try {
                if (this.f206340h == null) {
                    this.f206340h = new Handler(Looper.getMainLooper());
                }
                handler = this.f206340h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: k */
    public void m221871k() {
        this.f206335c = 0;
    }

    /* JADX INFO: renamed from: l */
    public void m221872l() {
        m221871k();
        m221870j().postDelayed(this, this.f206338f);
    }

    /* JADX INFO: renamed from: m */
    public void m221873m() {
        m221870j().removeMessages(0);
        this.f206339g.m216870a(new RunnableC21912b());
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f206339g.m216870a(new RunnableC21911a());
    }
}

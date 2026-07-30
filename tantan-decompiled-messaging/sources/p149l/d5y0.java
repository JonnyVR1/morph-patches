package p149l;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class d5y0 {

    /* JADX INFO: renamed from: a */
    public final a5y0 f84564a;

    /* JADX INFO: renamed from: b */
    public final b4y0 f84565b;

    /* JADX INFO: renamed from: c */
    public final g6v0 f84566c;

    /* JADX INFO: renamed from: d */
    public final xqt0 f84567d;

    /* JADX INFO: renamed from: e */
    public int f84568e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Object f84569f;

    /* JADX INFO: renamed from: g */
    public final Looper f84570g;

    /* JADX INFO: renamed from: h */
    public final int f84571h;

    /* JADX INFO: renamed from: i */
    public boolean f84572i;

    /* JADX INFO: renamed from: j */
    public boolean f84573j;

    /* JADX INFO: renamed from: k */
    public boolean f84574k;

    public d5y0(b4y0 b4y0Var, a5y0 a5y0Var, xqt0 xqt0Var, int i, g6v0 g6v0Var, Looper looper) {
        this.f84565b = b4y0Var;
        this.f84564a = a5y0Var;
        this.f84567d = xqt0Var;
        this.f84570g = looper;
        this.f84566c = g6v0Var;
        this.f84571h = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m110095a() {
        return this.f84568e;
    }

    /* JADX INFO: renamed from: b */
    public final Looper m110096b() {
        return this.f84570g;
    }

    /* JADX INFO: renamed from: c */
    public final a5y0 m110097c() {
        return this.f84564a;
    }

    /* JADX INFO: renamed from: d */
    public final d5y0 m110098d() {
        f5v0.m119535f(!this.f84572i);
        this.f84572i = true;
        this.f84565b.mo12578b(this);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final d5y0 m110099e(@Nullable Object obj) {
        f5v0.m119535f(!this.f84572i);
        this.f84569f = obj;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final d5y0 m110100f(int i) {
        f5v0.m119535f(!this.f84572i);
        this.f84568e = i;
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m110101g() {
        return this.f84569f;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m110102h(boolean z) {
        this.f84573j = z | this.f84573j;
        this.f84574k = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m110103i(long j) throws InterruptedException, TimeoutException {
        try {
            f5v0.m119535f(this.f84572i);
            f5v0.m119535f(this.f84570g.getThread() != Thread.currentThread());
            long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
            while (!this.f84574k) {
                if (j <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j);
                j = jElapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f84573j;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized boolean m110104j() {
        return false;
    }
}

package p149l;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class dec0 {

    /* JADX INFO: renamed from: g */
    public static final Executor f85775g = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), tck0.m187995H("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: a */
    public final int f85776a;

    /* JADX INFO: renamed from: b */
    public final long f85777b;

    /* JADX INFO: renamed from: c */
    public final Runnable f85778c = new Runnable() { // from class: l.cec0
        @Override // java.lang.Runnable
        public final void run() {
            dec0.m111193a(this.f80452a);
        }
    };

    /* JADX INFO: renamed from: d */
    public final Deque<bec0> f85779d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final lfd0 f85780e = new lfd0();

    /* JADX INFO: renamed from: f */
    public boolean f85781f;

    public dec0(int i, long j, TimeUnit timeUnit) {
        this.f85776a = i;
        this.f85777b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        y3g0.m212802a("keepAliveDuration <= 0: ", j);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m111193a(dec0 dec0Var) {
        dec0Var.getClass();
        while (true) {
            long jM111194b = dec0Var.m111194b(System.nanoTime());
            if (jM111194b == -1) {
                return;
            }
            if (jM111194b > 0) {
                long j = jM111194b / 1000000;
                long j2 = jM111194b - (1000000 * j);
                synchronized (dec0Var) {
                    try {
                        dec0Var.wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public long m111194b(long j) {
        synchronized (this) {
            try {
                bec0 bec0Var = null;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                for (bec0 bec0Var2 : this.f85779d) {
                    if (m111197e(bec0Var2, j) > 0) {
                        i2++;
                    } else {
                        i++;
                        long j3 = j - bec0Var2.f75149q;
                        if (j3 > j2) {
                            bec0Var = bec0Var2;
                            j2 = j3;
                        }
                    }
                }
                long j4 = this.f85777b;
                if (j2 < j4 && i <= this.f85776a) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    this.f85781f = false;
                    return -1L;
                }
                this.f85779d.remove(bec0Var);
                ii5.m136332b(bec0Var.mo101332d());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m111195c(kfd0 kfd0Var, IOException iOException) {
        if (kfd0Var.m145832b().type() != Proxy.Type.DIRECT) {
            c90 c90VarM145831a = kfd0Var.m145831a();
            c90VarM145831a.m105834i().connectFailed(c90VarM145831a.m105837l().m107515J(), kfd0Var.m145832b().address(), iOException);
        }
        this.f85780e.m149674b(kfd0Var);
    }

    /* JADX INFO: renamed from: d */
    public boolean m111196d(bec0 bec0Var) {
        if (bec0Var.f75143k || this.f85776a == 0) {
            this.f85779d.remove(bec0Var);
            return true;
        }
        notifyAll();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final int m111197e(bec0 bec0Var, long j) {
        List<Reference<k9j0>> list = bec0Var.f75148p;
        int i = 0;
        while (i < list.size()) {
            Reference<k9j0> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Platform.get().logCloseableLeak("A connection to " + bec0Var.mo101330b().m145831a().m105837l() + " was leaked. Did you forget to close a response body?", ((k9j0.C17962b) reference).f122046a);
                list.remove(i);
                bec0Var.f75143k = true;
                if (list.isEmpty()) {
                    bec0Var.f75149q = j - this.f85777b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* JADX INFO: renamed from: f */
    public void m111198f(bec0 bec0Var) {
        if (!this.f85781f) {
            this.f85781f = true;
            f85775g.execute(this.f85778c);
        }
        this.f85779d.add(bec0Var);
    }

    /* JADX INFO: renamed from: g */
    public boolean m111199g(c90 c90Var, k9j0 k9j0Var, List<kfd0> list, boolean z) {
        for (bec0 bec0Var : this.f85779d) {
            if (!z || bec0Var.m101345q()) {
                if (bec0Var.m101343o(c90Var, list)) {
                    k9j0Var.m145084a(bec0Var);
                    return true;
                }
            }
        }
        return false;
    }
}

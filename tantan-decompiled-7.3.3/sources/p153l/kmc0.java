package p153l;

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
public final class kmc0 {

    /* JADX INFO: renamed from: g */
    public static final Executor f127461g = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), zlk0.m220234H("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: a */
    public final int f127462a;

    /* JADX INFO: renamed from: b */
    public final long f127463b;

    /* JADX INFO: renamed from: c */
    public final Runnable f127464c = new Runnable() { // from class: l.jmc0
        @Override // java.lang.Runnable
        public final void run() {
            kmc0.m150421a(this.f121664a);
        }
    };

    /* JADX INFO: renamed from: d */
    public final Deque<imc0> f127465d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final ond0 f127466e = new ond0();

    /* JADX INFO: renamed from: f */
    public boolean f127467f;

    public kmc0(int i, long j, TimeUnit timeUnit) {
        this.f127462a = i;
        this.f127463b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        fcg0.m125008a("keepAliveDuration <= 0: ", j);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m150421a(kmc0 kmc0Var) {
        kmc0Var.getClass();
        while (true) {
            long jM150422b = kmc0Var.m150422b(System.nanoTime());
            if (jM150422b == -1) {
                return;
            }
            if (jM150422b > 0) {
                long j = jM150422b / 1000000;
                long j2 = jM150422b - (1000000 * j);
                synchronized (kmc0Var) {
                    try {
                        kmc0Var.wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public long m150422b(long j) {
        synchronized (this) {
            try {
                imc0 imc0Var = null;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                for (imc0 imc0Var2 : this.f127465d) {
                    if (m150425e(imc0Var2, j) > 0) {
                        i2++;
                    } else {
                        i++;
                        long j3 = j - imc0Var2.f115768q;
                        if (j3 > j2) {
                            imc0Var = imc0Var2;
                            j2 = j3;
                        }
                    }
                }
                long j4 = this.f127463b;
                if (j2 < j4 && i <= this.f127462a) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    this.f127467f = false;
                    return -1L;
                }
                this.f127465d.remove(imc0Var);
                jj5.m145008b(imc0Var.mo106827d());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m150423c(nnd0 nnd0Var, IOException iOException) {
        if (nnd0Var.m163862b().type() != Proxy.Type.DIRECT) {
            y80 y80VarM163861a = nnd0Var.m163861a();
            y80VarM163861a.m214718i().connectFailed(y80VarM163861a.m214721l().m182279J(), nnd0Var.m163862b().address(), iOException);
        }
        this.f127466e.m168331b(nnd0Var);
    }

    /* JADX INFO: renamed from: d */
    public boolean m150424d(imc0 imc0Var) {
        if (imc0Var.f115762k || this.f127462a == 0) {
            this.f127465d.remove(imc0Var);
            return true;
        }
        notifyAll();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final int m150425e(imc0 imc0Var, long j) {
        List<Reference<oij0>> list = imc0Var.f115767p;
        int i = 0;
        while (i < list.size()) {
            Reference<oij0> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                Platform.get().logCloseableLeak("A connection to " + imc0Var.mo106825b().m163861a().m214721l() + " was leaked. Did you forget to close a response body?", ((oij0.C19144b) reference).f147552a);
                list.remove(i);
                imc0Var.f115762k = true;
                if (list.isEmpty()) {
                    imc0Var.f115768q = j - this.f127463b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* JADX INFO: renamed from: f */
    public void m150426f(imc0 imc0Var) {
        if (!this.f127467f) {
            this.f127467f = true;
            f127461g.execute(this.f127464c);
        }
        this.f127465d.add(imc0Var);
    }

    /* JADX INFO: renamed from: g */
    public boolean m150427g(y80 y80Var, oij0 oij0Var, List<nnd0> list, boolean z) {
        for (imc0 imc0Var : this.f127465d) {
            if (!z || imc0Var.m140913q()) {
                if (imc0Var.m140911o(y80Var, list)) {
                    oij0Var.m167776a(imc0Var);
                    return true;
                }
            }
        }
        return false;
    }
}

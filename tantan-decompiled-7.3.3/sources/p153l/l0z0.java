package p153l;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class l0z0 {

    /* JADX INFO: renamed from: a */
    public final int f129630a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final kzy0 f129631b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f129632c;

    public l0z0(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable kzy0 kzy0Var) {
        this.f129632c = copyOnWriteArrayList;
        this.f129630a = 0;
        this.f129631b = kzy0Var;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public final l0z0 m152407a(int i, @Nullable kzy0 kzy0Var) {
        return new l0z0(this.f129632c, 0, kzy0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m152408b(Handler handler, m0z0 m0z0Var) {
        this.f129632c.add(new szy0(handler, m0z0Var));
    }

    /* JADX INFO: renamed from: c */
    public final void m152409c(final gzy0 gzy0Var) {
        for (szy0 szy0Var : this.f129632c) {
            final m0z0 m0z0Var = szy0Var.f171438b;
            mpw0.m159413k(szy0Var.f171437a, new Runnable() { // from class: l.nzy0
                @Override // java.lang.Runnable
                public final void run() {
                    m0z0Var.mo141206U(0, this.f144481a.f129631b, gzy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m152410d(final bzy0 bzy0Var, final gzy0 gzy0Var) {
        for (szy0 szy0Var : this.f129632c) {
            final m0z0 m0z0Var = szy0Var.f171438b;
            mpw0.m159413k(szy0Var.f171437a, new Runnable() { // from class: l.rzy0
                @Override // java.lang.Runnable
                public final void run() {
                    m0z0Var.mo141199N(0, this.f165642a.f129631b, bzy0Var, gzy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m152411e(final bzy0 bzy0Var, final gzy0 gzy0Var) {
        for (szy0 szy0Var : this.f129632c) {
            final m0z0 m0z0Var = szy0Var.f171438b;
            mpw0.m159413k(szy0Var.f171437a, new Runnable() { // from class: l.pzy0
                @Override // java.lang.Runnable
                public final void run() {
                    m0z0Var.mo141201P(0, this.f154989a.f129631b, bzy0Var, gzy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m152412f(final bzy0 bzy0Var, final gzy0 gzy0Var, final IOException iOException, final boolean z) {
        for (szy0 szy0Var : this.f129632c) {
            final m0z0 m0z0Var = szy0Var.f171438b;
            mpw0.m159413k(szy0Var.f171437a, new Runnable() { // from class: l.qzy0
                @Override // java.lang.Runnable
                public final void run() {
                    m0z0Var.mo141237w(0, this.f160314a.f129631b, bzy0Var, gzy0Var, iOException, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m152413g(final bzy0 bzy0Var, final gzy0 gzy0Var) {
        for (szy0 szy0Var : this.f129632c) {
            final m0z0 m0z0Var = szy0Var.f171438b;
            mpw0.m159413k(szy0Var.f171437a, new Runnable() { // from class: l.ozy0
                @Override // java.lang.Runnable
                public final void run() {
                    m0z0Var.mo141198M(0, this.f149980a.f129631b, bzy0Var, gzy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m152414h(m0z0 m0z0Var) {
        for (szy0 szy0Var : this.f129632c) {
            if (szy0Var.f171438b == m0z0Var) {
                this.f129632c.remove(szy0Var);
            }
        }
    }

    public l0z0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}

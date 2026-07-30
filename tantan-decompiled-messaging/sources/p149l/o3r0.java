package p149l;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class o3r0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Handler f141705a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final p3r0 f141706b;

    public o3r0(@Nullable Handler handler, @Nullable p3r0 p3r0Var) {
        this.f141705a = p3r0Var == null ? null : handler;
        this.f141706b = p3r0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m162468a(final String str, final long j, final long j2) {
        Handler handler = this.f141705a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.s2r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161997a.m162474g(str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m162469b(final String str) {
        Handler handler = this.f141705a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.n3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137017a.m162475h(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m162470c(final pnx0 pnx0Var) {
        pnx0Var.m170473a();
        Handler handler = this.f141705a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.m3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131115a.m162476i(pnx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m162471d(final int i, final long j) {
        Handler handler = this.f141705a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.g3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f100504a.m162477j(i, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m162472e(final pnx0 pnx0Var) {
        Handler handler = this.f141705a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.k3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120861a.m162478k(pnx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m162473f(final mhr0 mhr0Var, @Nullable final tnx0 tnx0Var) {
        Handler handler = this.f141705a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.l3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f125940a.m162479l(mhr0Var, tnx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m162474g(String str, long j, long j2) {
        int i = ggw0.f102568a;
        this.f141706b.mo167272Y(str, j, j2);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m162475h(String str) {
        int i = ggw0.f102568a;
        this.f141706b.mo167267T(str);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m162476i(pnx0 pnx0Var) {
        pnx0Var.m170473a();
        int i = ggw0.f102568a;
        this.f141706b.mo167268U(pnx0Var);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m162477j(int i, long j) {
        int i2 = ggw0.f102568a;
        this.f141706b.mo167274a0(i, j);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m162478k(pnx0 pnx0Var) {
        int i = ggw0.f102568a;
        this.f141706b.mo167269V(pnx0Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m162479l(mhr0 mhr0Var, tnx0 tnx0Var) {
        int i = ggw0.f102568a;
        this.f141706b.mo167271X(mhr0Var, tnx0Var);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m162480m(Object obj, long j) {
        int i = ggw0.f102568a;
        this.f141706b.mo167273Z(obj, j);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m162481n(long j, int i) {
        int i2 = ggw0.f102568a;
        this.f141706b.mo167275b0(j, i);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m162482o(Exception exc) {
        int i = ggw0.f102568a;
        this.f141706b.mo167276c0(exc);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m162483p(ueu0 ueu0Var) {
        int i = ggw0.f102568a;
        this.f141706b.mo167270W(ueu0Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m162484q(final Object obj) {
        Handler handler = this.f141705a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: l.h3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105758a.m162480m(obj, jElapsedRealtime);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m162485r(final long j, final int i) {
        Handler handler = this.f141705a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.i3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111366a.m162481n(j, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m162486s(final Exception exc) {
        Handler handler = this.f141705a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.j3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f116107a.m162482o(exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m162487t(final ueu0 ueu0Var) {
        Handler handler = this.f141705a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.f3r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94711a.m162483p(ueu0Var);
                }
            });
        }
    }
}

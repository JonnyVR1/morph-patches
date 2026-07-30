package p149l;

import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class zgy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Handler f203108a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final bhy0 f203109b;

    public zgy0(@Nullable Handler handler, @Nullable bhy0 bhy0Var) {
        this.f203108a = bhy0Var == null ? null : handler;
        this.f203109b = bhy0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m218725a(final Exception exc) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ngy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f138929a.m218734j(exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m218726b(final Exception exc) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.pgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f148838a.m218735k(exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m218727c(final dhy0 dhy0Var) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.jgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117860a.m218736l(dhy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m218728d(final dhy0 dhy0Var) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.lgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128025a.m218737m(dhy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m218729e(final String str, final long j, final long j2) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.vgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181456a.m218738n(str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m218730f(final String str) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.xgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f192804a.m218739o(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m218731g(final pnx0 pnx0Var) {
        pnx0Var.m170473a();
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.dgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86222a.m218740p(pnx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m218732h(final pnx0 pnx0Var) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.bgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75540a.m218741q(pnx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m218733i(final mhr0 mhr0Var, @Nullable final tnx0 tnx0Var) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.rgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159302a.m218742r(mhr0Var, tnx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m218734j(Exception exc) {
        int i = ggw0.f102568a;
        this.f203109b.mo101958b(exc);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m218735k(Exception exc) {
        int i = ggw0.f102568a;
        this.f203109b.mo101962f(exc);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m218736l(dhy0 dhy0Var) {
        int i = ggw0.f102568a;
        this.f203109b.mo101961e(dhy0Var);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m218737m(dhy0 dhy0Var) {
        int i = ggw0.f102568a;
        this.f203109b.mo101959c(dhy0Var);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m218738n(String str, long j, long j2) {
        int i = ggw0.f102568a;
        this.f203109b.mo101964h(str, j, j2);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m218739o(String str) {
        int i = ggw0.f102568a;
        this.f203109b.zzc(str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m218740p(pnx0 pnx0Var) {
        pnx0Var.m170473a();
        int i = ggw0.f102568a;
        this.f203109b.mo101963g(pnx0Var);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m218741q(pnx0 pnx0Var) {
        int i = ggw0.f102568a;
        this.f203109b.mo101965i(pnx0Var);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m218742r(mhr0 mhr0Var, tnx0 tnx0Var) {
        int i = ggw0.f102568a;
        this.f203109b.mo101966j(mhr0Var, tnx0Var);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m218743s(long j) {
        int i = ggw0.f102568a;
        this.f203109b.mo101957a(j);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m218744t(boolean z) {
        int i = ggw0.f102568a;
        this.f203109b.mo101967q(z);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m218745u(int i, long j, long j2) {
        int i2 = ggw0.f102568a;
        this.f203109b.mo101960d(i, j, j2);
    }

    /* JADX INFO: renamed from: v */
    public final void m218746v(final long j) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.fgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97463a.m218743s(j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m218747w(final boolean z) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.tgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170150a.m218744t(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m218748x(final int i, final long j, final long j2) {
        Handler handler = this.f203108a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.hgy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f107670a.m218745u(i, j, j2);
                }
            });
        }
    }
}

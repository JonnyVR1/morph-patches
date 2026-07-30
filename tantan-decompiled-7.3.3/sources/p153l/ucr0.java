package p153l;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ucr0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Handler f178461a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final vcr0 f178462b;

    public ucr0(@Nullable Handler handler, @Nullable vcr0 vcr0Var) {
        this.f178461a = vcr0Var == null ? null : handler;
        this.f178462b = vcr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m195423a(final String str, final long j, final long j2) {
        Handler handler = this.f178461a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ybr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f198355a.m195429g(str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m195424b(final String str) {
        Handler handler = this.f178461a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.tcr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f173270a.m195430h(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m195425c(final vwx0 vwx0Var) {
        vwx0Var.m203822a();
        Handler handler = this.f178461a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.scr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f167279a.m195431i(vwx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m195426d(final int i, final long j) {
        Handler handler = this.f178461a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.mcr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135842a.m195432j(i, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m195427e(final vwx0 vwx0Var) {
        Handler handler = this.f178461a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.qcr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f156617a.m195433k(vwx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m195428f(final sqr0 sqr0Var, @Nullable final zwx0 zwx0Var) {
        Handler handler = this.f178461a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.rcr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f162253a.m195434l(sqr0Var, zwx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m195429g(String str, long j, long j2) {
        int i = mpw0.f137957a;
        this.f178462b.mo199957Y(str, j, j2);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m195430h(String str) {
        int i = mpw0.f137957a;
        this.f178462b.mo199952T(str);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m195431i(vwx0 vwx0Var) {
        vwx0Var.m203822a();
        int i = mpw0.f137957a;
        this.f178462b.mo199953U(vwx0Var);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m195432j(int i, long j) {
        int i2 = mpw0.f137957a;
        this.f178462b.mo199959a0(i, j);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m195433k(vwx0 vwx0Var) {
        int i = mpw0.f137957a;
        this.f178462b.mo199954V(vwx0Var);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m195434l(sqr0 sqr0Var, zwx0 zwx0Var) {
        int i = mpw0.f137957a;
        this.f178462b.mo199956X(sqr0Var, zwx0Var);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m195435m(Object obj, long j) {
        int i = mpw0.f137957a;
        this.f178462b.mo199958Z(obj, j);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m195436n(long j, int i) {
        int i2 = mpw0.f137957a;
        this.f178462b.mo199960b0(j, i);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m195437o(Exception exc) {
        int i = mpw0.f137957a;
        this.f178462b.mo199961c0(exc);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m195438p(aou0 aou0Var) {
        int i = mpw0.f137957a;
        this.f178462b.mo199955W(aou0Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m195439q(final Object obj) {
        Handler handler = this.f178461a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: l.ncr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141397a.m195435m(obj, jElapsedRealtime);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m195440r(final long j, final int i) {
        Handler handler = this.f178461a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ocr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f146728a.m195436n(j, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m195441s(final Exception exc) {
        Handler handler = this.f178461a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.pcr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f151629a.m195437o(exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m195442t(final aou0 aou0Var) {
        Handler handler = this.f178461a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.lcr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131377a.m195438p(aou0Var);
                }
            });
        }
    }
}

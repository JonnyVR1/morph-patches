package p153l;

import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class fqy0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Handler f100354a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final hqy0 f100355b;

    public fqy0(@Nullable Handler handler, @Nullable hqy0 hqy0Var) {
        this.f100354a = hqy0Var == null ? null : handler;
        this.f100355b = hqy0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m126820a(final Exception exc) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.tpy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175665a.m126829j(exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m126821b(final Exception exc) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.vpy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185315a.m126830k(exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m126822c(final jqy0 jqy0Var) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.ppy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153609a.m126831l(jqy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m126823d(final jqy0 jqy0Var) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.rpy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164414a.m126832m(jqy0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m126824e(final String str, final long j, final long j2) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.bqy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77963a.m126833n(str, j, j2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m126825f(final String str) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.dqy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90299a.m126834o(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m126826g(final vwx0 vwx0Var) {
        vwx0Var.m203822a();
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.jpy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f122170a.m126835p(vwx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m126827h(final vwx0 vwx0Var) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.hpy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111060a.m126836q(vwx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m126828i(final sqr0 sqr0Var, @Nullable final zwx0 zwx0Var) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.xpy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195760a.m126837r(sqr0Var, zwx0Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m126829j(Exception exc) {
        int i = mpw0.f137957a;
        this.f100355b.mo136716b(exc);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m126830k(Exception exc) {
        int i = mpw0.f137957a;
        this.f100355b.mo136720f(exc);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m126831l(jqy0 jqy0Var) {
        int i = mpw0.f137957a;
        this.f100355b.mo136719e(jqy0Var);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m126832m(jqy0 jqy0Var) {
        int i = mpw0.f137957a;
        this.f100355b.mo136717c(jqy0Var);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m126833n(String str, long j, long j2) {
        int i = mpw0.f137957a;
        this.f100355b.mo136722h(str, j, j2);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m126834o(String str) {
        int i = mpw0.f137957a;
        this.f100355b.zzc(str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m126835p(vwx0 vwx0Var) {
        vwx0Var.m203822a();
        int i = mpw0.f137957a;
        this.f100355b.mo136721g(vwx0Var);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m126836q(vwx0 vwx0Var) {
        int i = mpw0.f137957a;
        this.f100355b.mo136723i(vwx0Var);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m126837r(sqr0 sqr0Var, zwx0 zwx0Var) {
        int i = mpw0.f137957a;
        this.f100355b.mo136724j(sqr0Var, zwx0Var);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m126838s(long j) {
        int i = mpw0.f137957a;
        this.f100355b.mo136715a(j);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m126839t(boolean z) {
        int i = mpw0.f137957a;
        this.f100355b.mo136725q(z);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m126840u(int i, long j, long j2) {
        int i2 = mpw0.f137957a;
        this.f100355b.mo136718d(i, j, j2);
    }

    /* JADX INFO: renamed from: v */
    public final void m126841v(final long j) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.lpy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133128a.m126838s(j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m126842w(final boolean z) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.zpy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f205548a.m126839t(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m126843x(final int i, final long j, final long j2) {
        Handler handler = this.f100354a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.npy0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143147a.m126840u(i, j, j2);
                }
            });
        }
    }
}

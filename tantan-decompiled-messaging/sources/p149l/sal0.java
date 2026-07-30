package p149l;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface sal0 {

    /* JADX INFO: renamed from: l.sal0$a */
    public static final class C19893a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Handler f163419a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final sal0 f163420b;

        public C19893a(@Nullable Handler handler, @Nullable sal0 sal0Var) {
            this.f163419a = sal0Var != null ? (Handler) p11.m167011e(handler) : null;
            this.f163420b = sal0Var;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m183070c(C19893a c19893a, dhd dhdVar) {
            c19893a.getClass();
            dhdVar.m111817c();
            ((sal0) vck0.m197866j(c19893a.f163420b)).mo10125o(dhdVar);
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m183076i(C19893a c19893a, C1871k c1871k, hhd hhdVar) {
            ((sal0) vck0.m197866j(c19893a.f163420b)).m183067D(c1871k);
            ((sal0) vck0.m197866j(c19893a.f163420b)).mo10119h(c1871k, hhdVar);
        }

        /* JADX INFO: renamed from: k */
        public void m183078k(final String str, final long j, final long j2) {
            Handler handler = this.f163419a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.oal0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((sal0) vck0.m197866j(this.f142811a.f163420b)).mo10122l(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: l */
        public void m183079l(final String str) {
            Handler handler = this.f163419a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.lal0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((sal0) vck0.m197866j(this.f127222a.f163420b)).mo10117c(str);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: m */
        public void m183080m(final dhd dhdVar) {
            dhdVar.m111817c();
            Handler handler = this.f163419a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.mal0
                    @Override // java.lang.Runnable
                    public final void run() {
                        sal0.C19893a.m183070c(this.f132936a, dhdVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: n */
        public void m183081n(final int i, final long j) {
            Handler handler = this.f163419a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.jal0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((sal0) vck0.m197866j(this.f117100a.f163420b)).mo10120i(i, j);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: o */
        public void m183082o(final dhd dhdVar) {
            Handler handler = this.f163419a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.pal0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((sal0) vck0.m197866j(this.f147989a.f163420b)).mo10123m(dhdVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: p */
        public void m183083p(final C1871k c1871k, @Nullable final hhd hhdVar) {
            Handler handler = this.f163419a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.qal0
                    @Override // java.lang.Runnable
                    public final void run() {
                        sal0.C19893a.m183076i(this.f153543a, c1871k, hhdVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: q */
        public void m183084q(final Object obj) {
            if (this.f163419a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f163419a.post(new Runnable() { // from class: l.kal0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((sal0) vck0.m197866j(this.f122132a.f163420b)).mo10128w(obj, jElapsedRealtime);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: r */
        public void m183085r(final long j, final int i) {
            Handler handler = this.f163419a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.ral0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((sal0) vck0.m197866j(this.f158527a.f163420b)).mo10121k(j, i);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: s */
        public void m183086s(final Exception exc) {
            Handler handler = this.f163419a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.nal0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((sal0) vck0.m197866j(this.f137918a.f163420b)).mo10127r(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: t */
        public void m183087t(final val0 val0Var) {
            Handler handler = this.f163419a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.ial0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((sal0) vck0.m197866j(this.f112312a.f163420b)).mo10129x(val0Var);
                    }
                });
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: D */
    default void m183067D(C1871k c1871k) {
    }

    /* JADX INFO: renamed from: c */
    default void mo10117c(String str) {
    }

    /* JADX INFO: renamed from: m */
    default void mo10123m(dhd dhdVar) {
    }

    /* JADX INFO: renamed from: o */
    default void mo10125o(dhd dhdVar) {
    }

    /* JADX INFO: renamed from: r */
    default void mo10127r(Exception exc) {
    }

    /* JADX INFO: renamed from: x */
    default void mo10129x(val0 val0Var) {
    }

    /* JADX INFO: renamed from: h */
    default void mo10119h(C1871k c1871k, @Nullable hhd hhdVar) {
    }

    /* JADX INFO: renamed from: i */
    default void mo10120i(int i, long j) {
    }

    /* JADX INFO: renamed from: k */
    default void mo10121k(long j, int i) {
    }

    /* JADX INFO: renamed from: w */
    default void mo10128w(Object obj, long j) {
    }

    /* JADX INFO: renamed from: l */
    default void mo10122l(String str, long j, long j2) {
    }
}

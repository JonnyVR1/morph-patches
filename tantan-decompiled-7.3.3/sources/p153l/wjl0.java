package p153l;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface wjl0 {

    /* JADX INFO: renamed from: l.wjl0$a */
    public static final class C21131a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Handler f189470a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final wjl0 f189471b;

        public C21131a(@Nullable Handler handler, @Nullable wjl0 wjl0Var) {
            this.f189470a = wjl0Var != null ? (Handler) w11.m204369e(handler) : null;
            this.f189471b = wjl0Var;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m206694c(C21131a c21131a, jid jidVar) {
            c21131a.getClass();
            jidVar.m144978c();
            ((wjl0) bmk0.m105144j(c21131a.f189471b)).mo10179o(jidVar);
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m206700i(C21131a c21131a, C1894k c1894k, nid nidVar) {
            ((wjl0) bmk0.m105144j(c21131a.f189471b)).m206691D(c1894k);
            ((wjl0) bmk0.m105144j(c21131a.f189471b)).mo10173h(c1894k, nidVar);
        }

        /* JADX INFO: renamed from: k */
        public void m206702k(final String str, final long j, final long j2) {
            Handler handler = this.f189470a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.sjl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((wjl0) bmk0.m105144j(this.f169029a.f189471b)).mo10176l(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: l */
        public void m206703l(final String str) {
            Handler handler = this.f189470a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.pjl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((wjl0) bmk0.m105144j(this.f152712a.f189471b)).mo10171c(str);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: m */
        public void m206704m(final jid jidVar) {
            jidVar.m144978c();
            Handler handler = this.f189470a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.qjl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        wjl0.C21131a.m206694c(this.f157998a, jidVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: n */
        public void m206705n(final int i, final long j) {
            Handler handler = this.f189470a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.njl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((wjl0) bmk0.m105144j(this.f142305a.f189471b)).mo10174i(i, j);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: o */
        public void m206706o(final jid jidVar) {
            Handler handler = this.f189470a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.tjl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((wjl0) bmk0.m105144j(this.f174596a.f189471b)).mo10177m(jidVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: p */
        public void m206707p(final C1894k c1894k, @Nullable final nid nidVar) {
            Handler handler = this.f189470a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.ujl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        wjl0.C21131a.m206700i(this.f179224a, c1894k, nidVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: q */
        public void m206708q(final Object obj) {
            if (this.f189470a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f189470a.post(new Runnable() { // from class: l.ojl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((wjl0) bmk0.m105144j(this.f147680a.f189471b)).mo10182w(obj, jElapsedRealtime);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: r */
        public void m206709r(final long j, final int i) {
            Handler handler = this.f189470a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.vjl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((wjl0) bmk0.m105144j(this.f184406a.f189471b)).mo10175k(j, i);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: s */
        public void m206710s(final Exception exc) {
            Handler handler = this.f189470a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.rjl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((wjl0) bmk0.m105144j(this.f163467a.f189471b)).mo10181r(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: t */
        public void m206711t(final zjl0 zjl0Var) {
            Handler handler = this.f189470a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.mjl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((wjl0) bmk0.m105144j(this.f137102a.f189471b)).mo10183x(zjl0Var);
                    }
                });
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: D */
    default void m206691D(C1894k c1894k) {
    }

    /* JADX INFO: renamed from: c */
    default void mo10171c(String str) {
    }

    /* JADX INFO: renamed from: m */
    default void mo10177m(jid jidVar) {
    }

    /* JADX INFO: renamed from: o */
    default void mo10179o(jid jidVar) {
    }

    /* JADX INFO: renamed from: r */
    default void mo10181r(Exception exc) {
    }

    /* JADX INFO: renamed from: x */
    default void mo10183x(zjl0 zjl0Var) {
    }

    /* JADX INFO: renamed from: h */
    default void mo10173h(C1894k c1894k, @Nullable nid nidVar) {
    }

    /* JADX INFO: renamed from: i */
    default void mo10174i(int i, long j) {
    }

    /* JADX INFO: renamed from: k */
    default void mo10175k(long j, int i) {
    }

    /* JADX INFO: renamed from: w */
    default void mo10182w(Object obj, long j) {
    }

    /* JADX INFO: renamed from: l */
    default void mo10176l(String str, long j, long j2) {
    }
}

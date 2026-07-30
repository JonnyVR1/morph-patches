package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.audio.InterfaceC1843c;
import p153l.bmk0;
import p153l.jid;
import p153l.nid;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1843c {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Handler f7204a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final InterfaceC1843c f7205b;

        public a(@Nullable Handler handler, @Nullable InterfaceC1843c interfaceC1843c) {
            this.f7204a = interfaceC1843c != null ? (Handler) w11.m204369e(handler) : null;
            this.f7205b = interfaceC1843c;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m9619d(a aVar, C1894k c1894k, nid nidVar) {
            ((InterfaceC1843c) bmk0.m105144j(aVar.f7205b)).m9605H(c1894k);
            ((InterfaceC1843c) bmk0.m105144j(aVar.f7205b)).mo9610g(c1894k, nidVar);
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m9624i(a aVar, jid jidVar) {
            aVar.getClass();
            jidVar.m144978c();
            ((InterfaceC1843c) bmk0.m105144j(aVar.f7205b)).mo9614v(jidVar);
        }

        /* JADX INFO: renamed from: k */
        public void m9626k(final Exception exc) {
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.tc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1843c) bmk0.m105144j(this.f173199a.f7205b)).mo9611j(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: l */
        public void m9627l(final Exception exc) {
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.yc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1843c) bmk0.m105144j(this.f198379a.f7205b)).mo9607b(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: m */
        public void m9628m(final String str, final long j, final long j2) {
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.sc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1843c) bmk0.m105144j(this.f167186a.f7205b)).mo9609f(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: n */
        public void m9629n(final String str) {
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.rc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1843c) bmk0.m105144j(this.f162057a.f7205b)).mo9608e(str);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: o */
        public void m9630o(final jid jidVar) {
            jidVar.m144978c();
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.wc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1843c.a.m9624i(this.f188312a, jidVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: p */
        public void m9631p(final jid jidVar) {
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.vc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1843c) bmk0.m105144j(this.f183308a.f7205b)).mo9613t(jidVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: q */
        public void m9632q(final C1894k c1894k, @Nullable final nid nidVar) {
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.xc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1843c.a.m9619d(this.f193250a, c1894k, nidVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: r */
        public void m9633r(final long j) {
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.uc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1843c) bmk0.m105144j(this.f178396a.f7205b)).mo9612q(j);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: s */
        public void m9634s(final boolean z) {
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.ad1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1843c) bmk0.m105144j(this.f69777a.f7205b)).mo9606a(z);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: t */
        public void m9635t(final int i, final long j, final long j2) {
            Handler handler = this.f7204a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.zc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1843c) bmk0.m105144j(this.f203722a.f7205b)).mo9615y(i, j, j2);
                    }
                });
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: H */
    default void m9605H(C1894k c1894k) {
    }

    /* JADX INFO: renamed from: a */
    default void mo9606a(boolean z) {
    }

    /* JADX INFO: renamed from: b */
    default void mo9607b(Exception exc) {
    }

    /* JADX INFO: renamed from: e */
    default void mo9608e(String str) {
    }

    /* JADX INFO: renamed from: f */
    default void mo9609f(String str, long j, long j2) {
    }

    /* JADX INFO: renamed from: j */
    default void mo9611j(Exception exc) {
    }

    /* JADX INFO: renamed from: q */
    default void mo9612q(long j) {
    }

    /* JADX INFO: renamed from: y */
    default void mo9615y(int i, long j, long j2) {
    }

    /* JADX INFO: renamed from: t */
    default void mo9613t(jid jidVar) {
    }

    /* JADX INFO: renamed from: v */
    default void mo9614v(jid jidVar) {
    }

    /* JADX INFO: renamed from: g */
    default void mo9610g(C1894k c1894k, @Nullable nid nidVar) {
    }
}

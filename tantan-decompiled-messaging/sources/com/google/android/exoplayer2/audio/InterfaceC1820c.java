package com.google.android.exoplayer2.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.audio.InterfaceC1820c;
import p149l.dhd;
import p149l.hhd;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1820c {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Handler f7167a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final InterfaceC1820c f7168b;

        public a(@Nullable Handler handler, @Nullable InterfaceC1820c interfaceC1820c) {
            this.f7167a = interfaceC1820c != null ? (Handler) p11.m167011e(handler) : null;
            this.f7168b = interfaceC1820c;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m9565d(a aVar, C1871k c1871k, hhd hhdVar) {
            ((InterfaceC1820c) vck0.m197866j(aVar.f7168b)).m9551H(c1871k);
            ((InterfaceC1820c) vck0.m197866j(aVar.f7168b)).mo9556g(c1871k, hhdVar);
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m9570i(a aVar, dhd dhdVar) {
            aVar.getClass();
            dhdVar.m111817c();
            ((InterfaceC1820c) vck0.m197866j(aVar.f7168b)).mo9560v(dhdVar);
        }

        /* JADX INFO: renamed from: k */
        public void m9572k(final Exception exc) {
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.mc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1820c) vck0.m197866j(this.f133078a.f7168b)).mo9557j(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: l */
        public void m9573l(final Exception exc) {
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.rc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1820c) vck0.m197866j(this.f158702a.f7168b)).mo9553b(exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: m */
        public void m9574m(final String str, final long j, final long j2) {
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.lc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1820c) vck0.m197866j(this.f127365a.f7168b)).mo9555f(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: n */
        public void m9575n(final String str) {
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.kc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1820c) vck0.m197866j(this.f122282a.f7168b)).mo9554e(str);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: o */
        public void m9576o(final dhd dhdVar) {
            dhdVar.m111817c();
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.pc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1820c.a.m9570i(this.f148130a, dhdVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: p */
        public void m9577p(final dhd dhdVar) {
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.oc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1820c) vck0.m197866j(this.f142999a.f7168b)).mo9559t(dhdVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: q */
        public void m9578q(final C1871k c1871k, @Nullable final hhd hhdVar) {
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.qc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1820c.a.m9565d(this.f153720a, c1871k, hhdVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: r */
        public void m9579r(final long j) {
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.nc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1820c) vck0.m197866j(this.f138086a.f7168b)).mo9558q(j);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: s */
        public void m9580s(final boolean z) {
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.tc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1820c) vck0.m197866j(this.f169406a.f7168b)).mo9552a(z);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: t */
        public void m9581t(final int i, final long j, final long j2) {
            Handler handler = this.f7167a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: l.sc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1820c) vck0.m197866j(this.f163692a.f7168b)).mo9561y(i, j, j2);
                    }
                });
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: H */
    default void m9551H(C1871k c1871k) {
    }

    /* JADX INFO: renamed from: a */
    default void mo9552a(boolean z) {
    }

    /* JADX INFO: renamed from: b */
    default void mo9553b(Exception exc) {
    }

    /* JADX INFO: renamed from: e */
    default void mo9554e(String str) {
    }

    /* JADX INFO: renamed from: f */
    default void mo9555f(String str, long j, long j2) {
    }

    /* JADX INFO: renamed from: j */
    default void mo9557j(Exception exc) {
    }

    /* JADX INFO: renamed from: q */
    default void mo9558q(long j) {
    }

    /* JADX INFO: renamed from: y */
    default void mo9561y(int i, long j, long j2) {
    }

    /* JADX INFO: renamed from: t */
    default void mo9559t(dhd dhdVar) {
    }

    /* JADX INFO: renamed from: v */
    default void mo9560v(dhd dhdVar) {
    }

    /* JADX INFO: renamed from: g */
    default void mo9556g(C1871k c1871k, @Nullable hhd hhdVar) {
    }
}

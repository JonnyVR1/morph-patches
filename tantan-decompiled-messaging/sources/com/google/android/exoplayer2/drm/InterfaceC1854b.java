package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1854b {
    /* JADX INFO: renamed from: N */
    default void mo9912N(int i, @Nullable InterfaceC1965i.b bVar) {
    }

    /* JADX INFO: renamed from: P */
    default void mo9913P(int i, @Nullable InterfaceC1965i.b bVar, int i2) {
    }

    /* JADX INFO: renamed from: Q */
    default void mo9914Q(int i, @Nullable InterfaceC1965i.b bVar) {
    }

    /* JADX INFO: renamed from: a0 */
    default void mo9915a0(int i, @Nullable InterfaceC1965i.b bVar) {
    }

    @Deprecated
    /* JADX INFO: renamed from: c0 */
    default void m9916c0(int i, @Nullable InterfaceC1965i.b bVar) {
    }

    /* JADX INFO: renamed from: j0 */
    default void mo9917j0(int i, @Nullable InterfaceC1965i.b bVar, Exception exc) {
    }

    /* JADX INFO: renamed from: q0 */
    default void mo9918q0(int i, @Nullable InterfaceC1965i.b bVar) {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f7461a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final InterfaceC1965i.b f7462b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<C22672a> f7463c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b$a$a, reason: collision with other inner class name */
        public static final class C22672a {

            /* JADX INFO: renamed from: a */
            public Handler f7464a;

            /* JADX INFO: renamed from: b */
            public InterfaceC1854b f7465b;

            public C22672a(Handler handler, InterfaceC1854b interfaceC1854b) {
                this.f7464a = handler;
                this.f7465b = interfaceC1854b;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m9922d(a aVar, InterfaceC1854b interfaceC1854b, int i) {
            interfaceC1854b.m9916c0(aVar.f7461a, aVar.f7462b);
            interfaceC1854b.mo9913P(aVar.f7461a, aVar.f7462b, i);
        }

        /* JADX INFO: renamed from: g */
        public void m9925g(Handler handler, InterfaceC1854b interfaceC1854b) {
            p11.m167011e(handler);
            p11.m167011e(interfaceC1854b);
            this.f7463c.add(new C22672a(handler, interfaceC1854b));
        }

        /* JADX INFO: renamed from: h */
        public void m9926h() {
            for (C22672a c22672a : this.f7463c) {
                final InterfaceC1854b interfaceC1854b = c22672a.f7465b;
                vck0.m197824S0(c22672a.f7464a, new Runnable() { // from class: l.tce
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1854b.a aVar = this.f169437a;
                        interfaceC1854b.mo9912N(aVar.f7461a, aVar.f7462b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: i */
        public void m9927i() {
            for (C22672a c22672a : this.f7463c) {
                final InterfaceC1854b interfaceC1854b = c22672a.f7465b;
                vck0.m197824S0(c22672a.f7464a, new Runnable() { // from class: l.rce
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1854b.a aVar = this.f158764a;
                        interfaceC1854b.mo9915a0(aVar.f7461a, aVar.f7462b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: j */
        public void m9928j() {
            for (C22672a c22672a : this.f7463c) {
                final InterfaceC1854b interfaceC1854b = c22672a.f7465b;
                vck0.m197824S0(c22672a.f7464a, new Runnable() { // from class: l.sce
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1854b.a aVar = this.f163723a;
                        interfaceC1854b.mo9914Q(aVar.f7461a, aVar.f7462b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: k */
        public void m9929k(final int i) {
            for (C22672a c22672a : this.f7463c) {
                final InterfaceC1854b interfaceC1854b = c22672a.f7465b;
                vck0.m197824S0(c22672a.f7464a, new Runnable() { // from class: l.qce
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1854b.a.m9922d(this.f153744a, interfaceC1854b, i);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: l */
        public void m9930l(final Exception exc) {
            for (C22672a c22672a : this.f7463c) {
                final InterfaceC1854b interfaceC1854b = c22672a.f7465b;
                vck0.m197824S0(c22672a.f7464a, new Runnable() { // from class: l.oce
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1854b.a aVar = this.f143031a;
                        interfaceC1854b.mo9917j0(aVar.f7461a, aVar.f7462b, exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: m */
        public void m9931m() {
            for (C22672a c22672a : this.f7463c) {
                final InterfaceC1854b interfaceC1854b = c22672a.f7465b;
                vck0.m197824S0(c22672a.f7464a, new Runnable() { // from class: l.pce
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1854b.a aVar = this.f148168a;
                        interfaceC1854b.mo9918q0(aVar.f7461a, aVar.f7462b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: n */
        public void m9932n(InterfaceC1854b interfaceC1854b) {
            for (C22672a c22672a : this.f7463c) {
                if (c22672a.f7465b == interfaceC1854b) {
                    this.f7463c.remove(c22672a);
                }
            }
        }

        @CheckResult
        /* JADX INFO: renamed from: o */
        public a m9933o(int i, @Nullable InterfaceC1965i.b bVar) {
            return new a(this.f7463c, i, bVar);
        }

        public a(CopyOnWriteArrayList<C22672a> copyOnWriteArrayList, int i, @Nullable InterfaceC1965i.b bVar) {
            this.f7463c = copyOnWriteArrayList;
            this.f7461a = i;
            this.f7462b = bVar;
        }
    }
}

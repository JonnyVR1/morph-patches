package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.bmk0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1877b {
    /* JADX INFO: renamed from: N */
    default void mo9966N(int i, @Nullable InterfaceC1988i.b bVar) {
    }

    /* JADX INFO: renamed from: P */
    default void mo9967P(int i, @Nullable InterfaceC1988i.b bVar, int i2) {
    }

    /* JADX INFO: renamed from: Q */
    default void mo9968Q(int i, @Nullable InterfaceC1988i.b bVar) {
    }

    /* JADX INFO: renamed from: a0 */
    default void mo9969a0(int i, @Nullable InterfaceC1988i.b bVar) {
    }

    @Deprecated
    /* JADX INFO: renamed from: c0 */
    default void m9970c0(int i, @Nullable InterfaceC1988i.b bVar) {
    }

    /* JADX INFO: renamed from: j0 */
    default void mo9971j0(int i, @Nullable InterfaceC1988i.b bVar, Exception exc) {
    }

    /* JADX INFO: renamed from: q0 */
    default void mo9972q0(int i, @Nullable InterfaceC1988i.b bVar) {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f7498a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final InterfaceC1988i.b f7499b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList<C22788a> f7500c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b$a$a, reason: collision with other inner class name */
        public static final class C22788a {

            /* JADX INFO: renamed from: a */
            public Handler f7501a;

            /* JADX INFO: renamed from: b */
            public InterfaceC1877b f7502b;

            public C22788a(Handler handler, InterfaceC1877b interfaceC1877b) {
                this.f7501a = handler;
                this.f7502b = interfaceC1877b;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m9976d(a aVar, InterfaceC1877b interfaceC1877b, int i) {
            interfaceC1877b.m9970c0(aVar.f7498a, aVar.f7499b);
            interfaceC1877b.mo9967P(aVar.f7498a, aVar.f7499b, i);
        }

        /* JADX INFO: renamed from: g */
        public void m9979g(Handler handler, InterfaceC1877b interfaceC1877b) {
            w11.m204369e(handler);
            w11.m204369e(interfaceC1877b);
            this.f7500c.add(new C22788a(handler, interfaceC1877b));
        }

        /* JADX INFO: renamed from: h */
        public void m9980h() {
            for (C22788a c22788a : this.f7500c) {
                final InterfaceC1877b interfaceC1877b = c22788a.f7502b;
                bmk0.m105102S0(c22788a.f7501a, new Runnable() { // from class: l.xde
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1877b.a aVar = this.f193583a;
                        interfaceC1877b.mo9966N(aVar.f7498a, aVar.f7499b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: i */
        public void m9981i() {
            for (C22788a c22788a : this.f7500c) {
                final InterfaceC1877b interfaceC1877b = c22788a.f7502b;
                bmk0.m105102S0(c22788a.f7501a, new Runnable() { // from class: l.vde
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1877b.a aVar = this.f183587a;
                        interfaceC1877b.mo9969a0(aVar.f7498a, aVar.f7499b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: j */
        public void m9982j() {
            for (C22788a c22788a : this.f7500c) {
                final InterfaceC1877b interfaceC1877b = c22788a.f7502b;
                bmk0.m105102S0(c22788a.f7501a, new Runnable() { // from class: l.wde
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1877b.a aVar = this.f188541a;
                        interfaceC1877b.mo9968Q(aVar.f7498a, aVar.f7499b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: k */
        public void m9983k(final int i) {
            for (C22788a c22788a : this.f7500c) {
                final InterfaceC1877b interfaceC1877b = c22788a.f7502b;
                bmk0.m105102S0(c22788a.f7501a, new Runnable() { // from class: l.ude
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1877b.a.m9976d(this.f178520a, interfaceC1877b, i);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: l */
        public void m9984l(final Exception exc) {
            for (C22788a c22788a : this.f7500c) {
                final InterfaceC1877b interfaceC1877b = c22788a.f7502b;
                bmk0.m105102S0(c22788a.f7501a, new Runnable() { // from class: l.sde
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1877b.a aVar = this.f167399a;
                        interfaceC1877b.mo9971j0(aVar.f7498a, aVar.f7499b, exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: m */
        public void m9985m() {
            for (C22788a c22788a : this.f7500c) {
                final InterfaceC1877b interfaceC1877b = c22788a.f7502b;
                bmk0.m105102S0(c22788a.f7501a, new Runnable() { // from class: l.tde
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1877b.a aVar = this.f173326a;
                        interfaceC1877b.mo9972q0(aVar.f7498a, aVar.f7499b);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: n */
        public void m9986n(InterfaceC1877b interfaceC1877b) {
            for (C22788a c22788a : this.f7500c) {
                if (c22788a.f7502b == interfaceC1877b) {
                    this.f7500c.remove(c22788a);
                }
            }
        }

        @CheckResult
        /* JADX INFO: renamed from: o */
        public a m9987o(int i, @Nullable InterfaceC1988i.b bVar) {
            return new a(this.f7500c, i, bVar);
        }

        public a(CopyOnWriteArrayList<C22788a> copyOnWriteArrayList, int i, @Nullable InterfaceC1988i.b bVar) {
            this.f7500c = copyOnWriteArrayList;
            this.f7498a = i;
            this.f7499b = bVar;
        }
    }
}

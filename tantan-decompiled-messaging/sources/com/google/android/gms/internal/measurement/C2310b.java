package com.google.android.gms.internal.measurement;

import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2310b extends AbstractC2349u0<C2310b, a> implements p0y0 {
    private static final C2310b zzc;
    private static volatile s1y0<C2310b> zzd;
    private int zze;
    private int zzf;
    private cvx0<C2316e> zzg = AbstractC2349u0.m14352x();
    private cvx0<C2312c> zzh = AbstractC2349u0.m14352x();
    private boolean zzi;
    private boolean zzj;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b$a */
    public static final class a extends AbstractC2349u0.b<C2310b, a> implements p0y0 {
        public a() {
            super(C2310b.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final C2316e m13822A(int i) {
            return ((C2310b) this.f10262b).m13816G(i);
        }

        /* JADX INFO: renamed from: v */
        public final int m13823v() {
            return ((C2310b) this.f10262b).m13815E();
        }

        /* JADX INFO: renamed from: w */
        public final a m13824w(int i, C2312c.a aVar) {
            m14378r();
            C2310b.m13811C((C2310b) this.f10262b, i, (C2312c) ((AbstractC2349u0) aVar.mo14369H()));
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m13825x(int i, C2316e.a aVar) {
            m14378r();
            C2310b.m13812D((C2310b) this.f10262b, i, (C2316e) ((AbstractC2349u0) aVar.mo14369H()));
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final C2312c m13826y(int i) {
            return ((C2310b) this.f10262b).m13814B(i);
        }

        /* JADX INFO: renamed from: z */
        public final int m13827z() {
            return ((C2310b) this.f10262b).m13817I();
        }
    }

    static {
        C2310b c2310b = new C2310b();
        zzc = c2310b;
        AbstractC2349u0.m14348p(C2310b.class, c2310b);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m13811C(C2310b c2310b, int i, C2312c c2312c) {
        c2312c.getClass();
        cvx0<C2312c> cvx0Var = c2310b.zzh;
        if (!cvx0Var.zzc()) {
            c2310b.zzh = AbstractC2349u0.m14347o(cvx0Var);
        }
        c2310b.zzh.set(i, c2312c);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m13812D(C2310b c2310b, int i, C2316e c2316e) {
        c2316e.getClass();
        cvx0<C2316e> cvx0Var = c2310b.zzg;
        if (!cvx0Var.zzc()) {
            c2310b.zzg = AbstractC2349u0.m14347o(cvx0Var);
        }
        c2310b.zzg.set(i, c2316e);
    }

    /* JADX INFO: renamed from: B */
    public final C2312c m13814B(int i) {
        return this.zzh.get(i);
    }

    /* JADX INFO: renamed from: E */
    public final int m13815E() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: G */
    public final C2316e m13816G(int i) {
        return this.zzg.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final int m13817I() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: L */
    public final List<C2312c> m13818L() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: M */
    public final List<C2316e> m13819M() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m13820N() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m13821h() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2307a.f10241a[i - 1];
        switch (i2) {
            case 1:
                return new C2310b();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C2316e.class, "zzh", C2312c.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2310b> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2310b.class) {
                    try {
                        aVar = zzd;
                        if (aVar == null) {
                            aVar = new AbstractC2349u0.a(zzc);
                            zzd = aVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return aVar;
            case 6:
                return (byte) 1;
            default:
                bz00.m104536a();
            case 7:
                return null;
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2312c extends AbstractC2349u0<C2312c, a> implements p0y0 {
    private static final C2312c zzc;
    private static volatile s1y0<C2312c> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private cvx0<C2314d> zzh = AbstractC2349u0.m14352x();
    private boolean zzi;
    private zzfo$zzd zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c$a */
    public static final class a extends AbstractC2349u0.b<C2312c, a> implements p0y0 {
        public a() {
            super(C2312c.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final int m13845v() {
            return ((C2312c) this.f10262b).m13844h();
        }

        /* JADX INFO: renamed from: w */
        public final a m13846w(int i, C2314d c2314d) {
            m14378r();
            C2312c.m13829C((C2312c) this.f10262b, i, c2314d);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m13847x(String str) {
            m14378r();
            C2312c.m13830D((C2312c) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final C2314d m13848y(int i) {
            return ((C2312c) this.f10262b).m13833B(i);
        }

        /* JADX INFO: renamed from: z */
        public final String m13849z() {
            return ((C2312c) this.f10262b).m13836L();
        }
    }

    static {
        C2312c c2312c = new C2312c();
        zzc = c2312c;
        AbstractC2349u0.m14348p(C2312c.class, c2312c);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m13829C(C2312c c2312c, int i, C2314d c2314d) {
        c2314d.getClass();
        cvx0<C2314d> cvx0Var = c2312c.zzh;
        if (!cvx0Var.zzc()) {
            c2312c.zzh = AbstractC2349u0.m14347o(cvx0Var);
        }
        c2312c.zzh.set(i, c2314d);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m13830D(C2312c c2312c, String str) {
        str.getClass();
        c2312c.zze |= 2;
        c2312c.zzg = str;
    }

    /* JADX INFO: renamed from: G */
    public static a m13831G() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: B */
    public final C2314d m13833B(int i) {
        return this.zzh.get(i);
    }

    /* JADX INFO: renamed from: E */
    public final int m13834E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: K */
    public final zzfo$zzd m13835K() {
        zzfo$zzd zzfo_zzd = this.zzj;
        return zzfo_zzd == null ? zzfo$zzd.m14555D() : zzfo_zzd;
    }

    /* JADX INFO: renamed from: L */
    public final String m13836L() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: M */
    public final List<C2314d> m13837M() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m13838N() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m13839T() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m13840U() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m13841V() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m13842W() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m13843X() {
        return (this.zze & 64) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m13844h() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2307a.f10241a[i - 1];
        switch (i2) {
            case 1:
                return new C2312c();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C2314d.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2312c> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2312c.class) {
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

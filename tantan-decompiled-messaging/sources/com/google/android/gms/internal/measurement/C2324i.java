package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C2324i extends AbstractC2349u0<C2324i, a> implements p0y0 {
    private static final C2324i zzc;
    private static volatile s1y0<C2324i> zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i$a */
    public static final class a extends AbstractC2349u0.b<C2324i, a> implements p0y0 {
        public a() {
            super(C2324i.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final boolean m14192A() {
            return ((C2324i) this.f10262b).m14188I();
        }

        /* JADX INFO: renamed from: B */
        public final boolean m14193B() {
            return ((C2324i) this.f10262b).m14189K();
        }

        /* JADX INFO: renamed from: C */
        public final boolean m14194C() {
            return ((C2324i) this.f10262b).m14190L();
        }

        /* JADX INFO: renamed from: v */
        public final int m14195v() {
            return ((C2324i) this.f10262b).m14191h();
        }

        /* JADX INFO: renamed from: w */
        public final a m14196w(String str) {
            m14378r();
            C2324i.m14183B((C2324i) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final String m14197x() {
            return ((C2324i) this.f10262b).m14185D();
        }

        /* JADX INFO: renamed from: y */
        public final boolean m14198y() {
            return ((C2324i) this.f10262b).m14186E();
        }

        /* JADX INFO: renamed from: z */
        public final boolean m14199z() {
            return ((C2324i) this.f10262b).m14187G();
        }
    }

    static {
        C2324i c2324i = new C2324i();
        zzc = c2324i;
        AbstractC2349u0.m14348p(C2324i.class, c2324i);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14183B(C2324i c2324i, String str) {
        str.getClass();
        c2324i.zze |= 1;
        c2324i.zzf = str;
    }

    /* JADX INFO: renamed from: D */
    public final String m14185D() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m14186E() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m14187G() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14188I() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14189K() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14190L() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14191h() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2338p.f10249a[i - 1];
        switch (i2) {
            case 1:
                return new C2324i();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2324i> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2324i.class) {
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

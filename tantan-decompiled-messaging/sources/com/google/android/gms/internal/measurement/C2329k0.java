package com.google.android.gms.internal.measurement;

import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2329k0 extends AbstractC2349u0<C2329k0, a> implements p0y0 {
    private static final C2329k0 zzc;
    private static volatile s1y0<C2329k0> zzd;
    private int zze;
    private cvx0<zzgd$zzd> zzf = AbstractC2349u0.m14352x();
    private C2325i0 zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0$a */
    public static final class a extends AbstractC2349u0.b<C2329k0, a> implements p0y0 {
        public a() {
            super(C2329k0.zzc);
        }
    }

    static {
        C2329k0 c2329k0 = new C2329k0();
        zzc = c2329k0;
        AbstractC2349u0.m14348p(C2329k0.class, c2329k0);
    }

    /* JADX INFO: renamed from: B */
    public final C2325i0 m14237B() {
        C2325i0 c2325i0 = this.zzg;
        return c2325i0 == null ? C2325i0.m14201C() : c2325i0;
    }

    /* JADX INFO: renamed from: D */
    public final List<zzgd$zzd> m14238D() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2331l0.f10246a[i - 1];
        switch (i2) {
            case 1:
                return new C2329k0();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgd$zzd.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2329k0> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2329k0.class) {
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

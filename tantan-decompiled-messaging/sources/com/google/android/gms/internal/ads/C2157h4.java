package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.fbx0;
import p149l.n8x0;
import p149l.o2x0;
import p149l.p2x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2157h4 extends AbstractC2222p5 implements abx0 {
    private static final C2157h4 zzb;
    private static volatile fbx0 zzd;
    private int zze;
    private int zzf;
    private C2173j4 zzg;
    private zzgyl zzh = zzgyl.zzb;

    static {
        C2157h4 c2157h4 = new C2157h4();
        zzb = c2157h4;
        AbstractC2222p5.m13159C(C2157h4.class, c2157h4);
    }

    /* JADX INFO: renamed from: M */
    public static p2x0 m12731M() {
        return (p2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2157h4 m12733O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2157h4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: R */
    public static fbx0 m12734R() {
        return (fbx0) zzb.mo12506H(7, null, null);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12735S(C2157h4 c2157h4, C2173j4 c2173j4) {
        c2173j4.getClass();
        c2157h4.zzg = c2173j4;
        c2157h4.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        fbx0 n8x0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2157h4();
        }
        o2x0 o2x0Var = null;
        if (i2 == 4) {
            return new p2x0(o2x0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        fbx0 fbx0Var = zzd;
        if (fbx0Var != null) {
            return fbx0Var;
        }
        synchronized (C2157h4.class) {
            try {
                n8x0Var = zzd;
                if (n8x0Var == null) {
                    n8x0Var = new n8x0(zzb);
                    zzd = n8x0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n8x0Var;
    }

    /* JADX INFO: renamed from: L */
    public final int m12737L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2173j4 m12738P() {
        C2173j4 c2173j4 = this.zzg;
        return c2173j4 == null ? C2173j4.m12778O() : c2173j4;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m12739Q() {
        return this.zzh;
    }
}

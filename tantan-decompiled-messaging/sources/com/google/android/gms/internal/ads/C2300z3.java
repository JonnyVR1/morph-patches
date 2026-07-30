package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.fbx0;
import p149l.n8x0;
import p149l.u1x0;
import p149l.v1x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2300z3 extends AbstractC2222p5 implements abx0 {
    private static final C2300z3 zzb;
    private static volatile fbx0 zzd;
    private int zze;
    private int zzf;
    private zzgyl zzg = zzgyl.zzb;
    private C2108b4 zzh;

    static {
        C2300z3 c2300z3 = new C2300z3();
        zzb = c2300z3;
        AbstractC2222p5.m13159C(C2300z3.class, c2300z3);
    }

    /* JADX INFO: renamed from: M */
    public static v1x0 m13515M() {
        return (v1x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2300z3 m13517O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2300z3) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: R */
    public static fbx0 m13518R() {
        return (fbx0) zzb.mo12506H(7, null, null);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13520T(C2300z3 c2300z3, C2108b4 c2108b4) {
        c2108b4.getClass();
        c2300z3.zzh = c2108b4;
        c2300z3.zze |= 1;
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
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2300z3();
        }
        u1x0 u1x0Var = null;
        if (i2 == 4) {
            return new v1x0(u1x0Var);
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
        synchronized (C2300z3.class) {
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
    public final int m13521L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2108b4 m13522P() {
        C2108b4 c2108b4 = this.zzh;
        return c2108b4 == null ? C2108b4.m12536O() : c2108b4;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m13523Q() {
        return this.zzg;
    }
}

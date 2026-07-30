package com.google.android.gms.internal.ads;

import p149l.a2x0;
import p149l.abx0;
import p149l.b2x0;
import p149l.d8x0;
import p149l.fbx0;
import p149l.n8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2117c4 extends AbstractC2222p5 implements abx0 {
    private static final C2117c4 zzb;
    private static volatile fbx0 zzd;
    private int zze;
    private int zzf;
    private C2133e4 zzg;
    private C2229q4 zzh;

    static {
        C2117c4 c2117c4 = new C2117c4();
        zzb = c2117c4;
        AbstractC2222p5.m13159C(C2117c4.class, c2117c4);
    }

    /* JADX INFO: renamed from: M */
    public static b2x0 m12621M() {
        return (b2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2117c4 m12623O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2117c4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: R */
    public static fbx0 m12624R() {
        return (fbx0) zzb.mo12506H(7, null, null);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12625S(C2117c4 c2117c4, C2133e4 c2133e4) {
        c2133e4.getClass();
        c2117c4.zzg = c2133e4;
        c2117c4.zze |= 1;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12626T(C2117c4 c2117c4, C2229q4 c2229q4) {
        c2229q4.getClass();
        c2117c4.zzh = c2229q4;
        c2117c4.zze |= 2;
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
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2117c4();
        }
        a2x0 a2x0Var = null;
        if (i2 == 4) {
            return new b2x0(a2x0Var);
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
        synchronized (C2117c4.class) {
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
    public final int m12627L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2133e4 m12628P() {
        C2133e4 c2133e4 = this.zzg;
        return c2133e4 == null ? C2133e4.m12673O() : c2133e4;
    }

    /* JADX INFO: renamed from: Q */
    public final C2229q4 m12629Q() {
        C2229q4 c2229q4 = this.zzh;
        return c2229q4 == null ? C2229q4.m13201O() : c2229q4;
    }
}

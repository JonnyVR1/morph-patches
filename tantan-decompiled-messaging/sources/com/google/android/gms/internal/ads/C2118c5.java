package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.fbx0;
import p149l.n8x0;
import p149l.q4x0;
import p149l.r4x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2118c5 extends AbstractC2222p5 implements abx0 {
    private static final C2118c5 zzb;
    private static volatile fbx0 zzd;
    private int zze;
    private int zzf;
    private C2126d5 zzg;

    static {
        C2118c5 c2118c5 = new C2118c5();
        zzb = c2118c5;
        AbstractC2222p5.m13159C(C2118c5.class, c2118c5);
    }

    /* JADX INFO: renamed from: M */
    public static r4x0 m12630M() {
        return (r4x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2118c5 m12632O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2118c5) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static fbx0 m12633Q() {
        return (fbx0) zzb.mo12506H(7, null, null);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12634R(C2118c5 c2118c5, C2126d5 c2126d5) {
        c2126d5.getClass();
        c2118c5.zzg = c2126d5;
        c2118c5.zze |= 1;
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
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2118c5();
        }
        q4x0 q4x0Var = null;
        if (i2 == 4) {
            return new r4x0(q4x0Var);
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
        synchronized (C2118c5.class) {
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
    public final int m12635L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2126d5 m12636P() {
        C2126d5 c2126d5 = this.zzg;
        return c2126d5 == null ? C2126d5.m12657O() : c2126d5;
    }
}

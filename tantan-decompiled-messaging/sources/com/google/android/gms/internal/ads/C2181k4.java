package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.fbx0;
import p149l.n8x0;
import p149l.u2x0;
import p149l.v2x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2181k4 extends AbstractC2222p5 implements abx0 {
    private static final C2181k4 zzb;
    private static volatile fbx0 zzd;
    private int zze;
    private zzgyl zzf = zzgyl.zzb;

    static {
        C2181k4 c2181k4 = new C2181k4();
        zzb = c2181k4;
        AbstractC2222p5.m13159C(C2181k4.class, c2181k4);
    }

    /* JADX INFO: renamed from: M */
    public static v2x0 m12820M() {
        return (v2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2181k4 m12822O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2181k4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static fbx0 m12823Q() {
        return (fbx0) zzb.mo12506H(7, null, null);
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
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2181k4();
        }
        u2x0 u2x0Var = null;
        if (i2 == 4) {
            return new v2x0(u2x0Var);
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
        synchronized (C2181k4.class) {
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
    public final int m12825L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m12826P() {
        return this.zzf;
    }
}

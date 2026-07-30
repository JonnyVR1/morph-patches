package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.fbx0;
import p149l.n8x0;
import p149l.y2x0;
import p149l.z2x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2197m4 extends AbstractC2222p5 implements abx0 {
    private static final C2197m4 zzb;
    private static volatile fbx0 zzd;
    private int zze;
    private zzgyl zzf = zzgyl.zzb;

    static {
        C2197m4 c2197m4 = new C2197m4();
        zzb = c2197m4;
        AbstractC2222p5.m13159C(C2197m4.class, c2197m4);
    }

    /* JADX INFO: renamed from: M */
    public static z2x0 m12902M() {
        return (z2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2197m4 m12904O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2197m4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static fbx0 m12905Q() {
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
            return new C2197m4();
        }
        y2x0 y2x0Var = null;
        if (i2 == 4) {
            return new z2x0(y2x0Var);
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
        synchronized (C2197m4.class) {
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
    public final int m12907L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m12908P() {
        return this.zzf;
    }
}

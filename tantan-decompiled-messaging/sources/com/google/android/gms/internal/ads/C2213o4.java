package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.c3x0;
import p149l.d3x0;
import p149l.d8x0;
import p149l.fbx0;
import p149l.n8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2213o4 extends AbstractC2222p5 implements abx0 {
    private static final C2213o4 zzb;
    private static volatile fbx0 zzd;
    private int zze;
    private zzgyl zzf = zzgyl.zzb;

    static {
        C2213o4 c2213o4 = new C2213o4();
        zzb = c2213o4;
        AbstractC2222p5.m13159C(C2213o4.class, c2213o4);
    }

    /* JADX INFO: renamed from: M */
    public static d3x0 m13087M() {
        return (d3x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2213o4 m13089O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2213o4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static fbx0 m13090Q() {
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
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2213o4();
        }
        c3x0 c3x0Var = null;
        if (i2 == 4) {
            return new d3x0(c3x0Var);
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
        synchronized (C2213o4.class) {
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
    public final int m13092L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m13093P() {
        return this.zzf;
    }
}

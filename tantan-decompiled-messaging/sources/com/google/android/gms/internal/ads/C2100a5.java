package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.fbx0;
import p149l.m4x0;
import p149l.n4x0;
import p149l.n8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2100a5 extends AbstractC2222p5 implements abx0 {
    private static final C2100a5 zzb;
    private static volatile fbx0 zzd;
    private int zze;
    private int zzf;
    private C2109b5 zzg;

    static {
        C2100a5 c2100a5 = new C2100a5();
        zzb = c2100a5;
        AbstractC2222p5.m13159C(C2100a5.class, c2100a5);
    }

    /* JADX INFO: renamed from: M */
    public static n4x0 m12516M() {
        return (n4x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2100a5 m12518O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2100a5) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static fbx0 m12519Q() {
        return (fbx0) zzb.mo12506H(7, null, null);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12520R(C2100a5 c2100a5, C2109b5 c2109b5) {
        c2109b5.getClass();
        c2100a5.zzg = c2109b5;
        c2100a5.zze |= 1;
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
            return new C2100a5();
        }
        m4x0 m4x0Var = null;
        if (i2 == 4) {
            return new n4x0(m4x0Var);
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
        synchronized (C2100a5.class) {
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
    public final int m12521L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2109b5 m12522P() {
        C2109b5 c2109b5 = this.zzg;
        return c2109b5 == null ? C2109b5.m12541N() : c2109b5;
    }
}

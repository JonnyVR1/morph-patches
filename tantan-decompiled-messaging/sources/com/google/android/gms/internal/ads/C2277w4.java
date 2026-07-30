package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g4x0;
import p149l.i4x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2277w4 extends AbstractC2222p5 implements abx0 {
    private static final C2277w4 zzb;
    private int zzd;
    private C2253t4 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C2277w4 c2277w4 = new C2277w4();
        zzb = c2277w4;
        AbstractC2222p5.m13159C(C2277w4.class, c2277w4);
    }

    /* JADX INFO: renamed from: N */
    public static i4x0 m13423N() {
        return (i4x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m13425Q(C2277w4 c2277w4, C2253t4 c2253t4) {
        c2253t4.getClass();
        c2277w4.zze = c2253t4;
        c2277w4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2277w4();
        }
        g4x0 g4x0Var = null;
        if (i2 == 4) {
            return new i4x0(g4x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13429L() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: M */
    public final C2253t4 m13430M() {
        C2253t4 c2253t4 = this.zze;
        return c2253t4 == null ? C2253t4.m13321O() : c2253t4;
    }

    /* JADX INFO: renamed from: P */
    public final zzgvz m13431P() {
        zzgvz zzgvzVarZzb = zzgvz.zzb(this.zzh);
        return zzgvzVarZzb == null ? zzgvz.UNRECOGNIZED : zzgvzVarZzb;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m13432T() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final int m13433U() {
        int i = this.zzf;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = i != 3 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}

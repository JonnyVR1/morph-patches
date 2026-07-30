package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mdx0;
import p153l.odx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2300w4 extends AbstractC2245p5 implements gkx0 {
    private static final C2300w4 zzb;
    private int zzd;
    private C2276t4 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C2300w4 c2300w4 = new C2300w4();
        zzb = c2300w4;
        AbstractC2245p5.m13213C(C2300w4.class, c2300w4);
    }

    /* JADX INFO: renamed from: N */
    public static odx0 m13477N() {
        return (odx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m13479Q(C2300w4 c2300w4, C2276t4 c2276t4) {
        c2276t4.getClass();
        c2300w4.zze = c2276t4;
        c2300w4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2300w4();
        }
        mdx0 mdx0Var = null;
        if (i2 == 4) {
            return new odx0(mdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13483L() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: M */
    public final C2276t4 m13484M() {
        C2276t4 c2276t4 = this.zze;
        return c2276t4 == null ? C2276t4.m13375O() : c2276t4;
    }

    /* JADX INFO: renamed from: P */
    public final zzgvz m13485P() {
        zzgvz zzgvzVarZzb = zzgvz.zzb(this.zzh);
        return zzgvzVarZzb == null ? zzgvz.UNRECOGNIZED : zzgvzVarZzb;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m13486T() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final int m13487U() {
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

package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.o3x0;
import p149l.p3x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2237r4 extends AbstractC2222p5 implements abx0 {
    private static final C2237r4 zzb;
    private int zzd;
    private C2245s4 zze;
    private int zzf;
    private int zzg;

    static {
        C2237r4 c2237r4 = new C2237r4();
        zzb = c2237r4;
        AbstractC2222p5.m13159C(C2237r4.class, c2237r4);
    }

    /* JADX INFO: renamed from: N */
    public static p3x0 m13224N() {
        return (p3x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: P */
    public static C2237r4 m13226P() {
        return zzb;
    }

    /* JADX INFO: renamed from: Q */
    public static C2237r4 m13227Q(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2237r4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13228S(C2237r4 c2237r4, C2245s4 c2245s4) {
        c2245s4.getClass();
        c2237r4.zze = c2245s4;
        c2237r4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2237r4();
        }
        o3x0 o3x0Var = null;
        if (i2 == 4) {
            return new p3x0(o3x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13230L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: M */
    public final int m13231M() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: R */
    public final C2245s4 m13232R() {
        C2245s4 c2245s4 = this.zze;
        return c2245s4 == null ? C2245s4.m13256P() : c2245s4;
    }
}

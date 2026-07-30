package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.ucx0;
import p153l.vcx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2260r4 extends AbstractC2245p5 implements gkx0 {
    private static final C2260r4 zzb;
    private int zzd;
    private C2268s4 zze;
    private int zzf;
    private int zzg;

    static {
        C2260r4 c2260r4 = new C2260r4();
        zzb = c2260r4;
        AbstractC2245p5.m13213C(C2260r4.class, c2260r4);
    }

    /* JADX INFO: renamed from: N */
    public static vcx0 m13278N() {
        return (vcx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: P */
    public static C2260r4 m13280P() {
        return zzb;
    }

    /* JADX INFO: renamed from: Q */
    public static C2260r4 m13281Q(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2260r4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13282S(C2260r4 c2260r4, C2268s4 c2268s4) {
        c2268s4.getClass();
        c2260r4.zze = c2268s4;
        c2260r4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2260r4();
        }
        ucx0 ucx0Var = null;
        if (i2 == 4) {
            return new vcx0(ucx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13284L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: M */
    public final int m13285M() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: R */
    public final C2268s4 m13286R() {
        C2268s4 c2268s4 = this.zze;
        return c2268s4 == null ? C2268s4.m13310P() : c2268s4;
    }
}

package com.google.android.gms.internal.ads;

import p153l.ddx0;
import p153l.edx0;
import p153l.gkx0;
import p153l.jhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2284u4 extends AbstractC2245p5 implements gkx0 {
    private static final C2284u4 zzb;
    private String zzd = "";
    private zzgyl zze = zzgyl.zzb;
    private int zzf;

    static {
        C2284u4 c2284u4 = new C2284u4();
        zzb = c2284u4;
        AbstractC2245p5.m13213C(C2284u4.class, c2284u4);
    }

    /* JADX INFO: renamed from: L */
    public static edx0 m13397L() {
        return (edx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static C2284u4 m13399N() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static C2284u4 m13400O(byte[] bArr, jhx0 jhx0Var) throws zzhag {
        return (C2284u4) AbstractC2245p5.m13221r(zzb, bArr, jhx0Var);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13401S(C2284u4 c2284u4, String str) {
        str.getClass();
        c2284u4.zzd = str;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13402T(C2284u4 c2284u4, zzgyl zzgylVar) {
        zzgylVar.getClass();
        c2284u4.zze = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2284u4();
        }
        ddx0 ddx0Var = null;
        if (i2 == 4) {
            return new edx0(ddx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: P */
    public final zzgvz m13404P() {
        zzgvz zzgvzVarZzb = zzgvz.zzb(this.zzf);
        return zzgvzVarZzb == null ? zzgvz.UNRECOGNIZED : zzgvzVarZzb;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m13405Q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: R */
    public final String m13406R() {
        return this.zzd;
    }
}

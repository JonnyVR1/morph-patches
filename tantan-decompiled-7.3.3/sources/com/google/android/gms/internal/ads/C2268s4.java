package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.wcx0;
import p153l.xcx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2268s4 extends AbstractC2245p5 implements gkx0 {
    private static final C2268s4 zzb;
    private int zzd;
    private int zze;

    static {
        C2268s4 c2268s4 = new C2268s4();
        zzb = c2268s4;
        AbstractC2245p5.m13213C(C2268s4.class, c2268s4);
    }

    /* JADX INFO: renamed from: N */
    public static xcx0 m13308N() {
        return (xcx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: P */
    public static C2268s4 m13310P() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2268s4();
        }
        wcx0 wcx0Var = null;
        if (i2 == 4) {
            return new xcx0(wcx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13313L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: M */
    public final zzguf m13314M() {
        zzguf zzgufVar;
        int i = this.zzd;
        zzguf zzgufVar2 = zzguf.UNKNOWN_HASH;
        if (i == 0) {
            zzgufVar = zzguf.UNKNOWN_HASH;
        } else if (i == 1) {
            zzgufVar = zzguf.SHA1;
        } else if (i == 2) {
            zzgufVar = zzguf.SHA384;
        } else if (i == 3) {
            zzgufVar = zzguf.SHA256;
        } else if (i != 4) {
            zzgufVar = i != 5 ? null : zzguf.SHA224;
        } else {
            zzgufVar = zzguf.SHA512;
        }
        return zzgufVar == null ? zzguf.UNRECOGNIZED : zzgufVar;
    }
}

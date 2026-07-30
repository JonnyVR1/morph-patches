package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.q3x0;
import p149l.r3x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2245s4 extends AbstractC2222p5 implements abx0 {
    private static final C2245s4 zzb;
    private int zzd;
    private int zze;

    static {
        C2245s4 c2245s4 = new C2245s4();
        zzb = c2245s4;
        AbstractC2222p5.m13159C(C2245s4.class, c2245s4);
    }

    /* JADX INFO: renamed from: N */
    public static r3x0 m13254N() {
        return (r3x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: P */
    public static C2245s4 m13256P() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2245s4();
        }
        q3x0 q3x0Var = null;
        if (i2 == 4) {
            return new r3x0(q3x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13259L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: M */
    public final zzguf m13260M() {
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

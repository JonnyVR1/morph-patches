package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.inx0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2182h6 extends AbstractC2245p5 implements gkx0 {
    private static final C2182h6 zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private byte zzg = 2;

    static {
        C2182h6 c2182h6 = new C2182h6();
        zzb = c2182h6;
        AbstractC2245p5.m13213C(C2182h6.class, c2182h6);
    }

    public C2182h6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zze = zzgylVar;
        this.zzf = zzgylVar;
    }

    /* JADX INFO: renamed from: L */
    public static inx0 m12799L() {
        return (inx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12801N(C2182h6 c2182h6, zzgyl zzgylVar) {
        c2182h6.zzd |= 1;
        c2182h6.zze = zzgylVar;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12802O(C2182h6 c2182h6, zzgyl zzgylVar) {
        c2182h6.zzd |= 2;
        c2182h6.zzf = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2182h6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new inx0(mmx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

package com.google.android.gms.internal.ads;

import p153l.cnx0;
import p153l.gkx0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2150d6 extends AbstractC2245p5 implements gkx0 {
    private static final C2150d6 zzb;
    private int zzd;
    private String zze = "";

    static {
        C2150d6 c2150d6 = new C2150d6();
        zzb = c2150d6;
        AbstractC2245p5.m13213C(C2150d6.class, c2150d6);
    }

    /* JADX INFO: renamed from: L */
    public static cnx0 m12717L() {
        return (cnx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12719N(C2150d6 c2150d6, String str) {
        c2150d6.zzd |= 1;
        c2150d6.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2150d6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new cnx0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

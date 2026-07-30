package com.google.android.gms.internal.ads;

import p153l.dnx0;
import p153l.gkx0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2166f6 extends AbstractC2245p5 implements gkx0 {
    private static final C2166f6 zzb;
    private int zzd;
    private C2158e6 zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        C2166f6 c2166f6 = new C2166f6();
        zzb = c2166f6;
        AbstractC2245p5.m13213C(C2166f6.class, c2166f6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2166f6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new dnx0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

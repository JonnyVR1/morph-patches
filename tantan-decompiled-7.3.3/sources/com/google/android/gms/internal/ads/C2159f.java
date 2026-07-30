package com.google.android.gms.internal.ads;

import p153l.dzr0;
import p153l.gkx0;
import p153l.oyr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C2159f extends AbstractC2245p5 implements gkx0 {
    private static final C2159f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C2159f c2159f = new C2159f();
        zzb = c2159f;
        AbstractC2245p5.m13213C(C2159f.class, c2159f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C2159f();
        }
        oyr0 oyr0Var = null;
        if (i2 == 4) {
            return new dzr0(oyr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

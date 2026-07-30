package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.gox0;
import p153l.hox0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2270s6 extends AbstractC2245p5 implements gkx0 {
    private static final C2270s6 zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C2270s6 c2270s6 = new C2270s6();
        zzb = c2270s6;
        AbstractC2245p5.m13213C(C2270s6.class, c2270s6);
    }

    /* JADX INFO: renamed from: L */
    public static gox0 m13357L() {
        return (gox0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13359N(C2270s6 c2270s6, String str) {
        c2270s6.zzd |= 1;
        c2270s6.zze = str;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13360O(C2270s6 c2270s6, long j) {
        c2270s6.zzd |= 2;
        c2270s6.zzf = j;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13361P(C2270s6 c2270s6, boolean z) {
        c2270s6.zzd |= 4;
        c2270s6.zzg = z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", hox0.f110965a, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C2270s6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new gox0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

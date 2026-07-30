package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.afx0;
import p149l.bfx0;
import p149l.gdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2247s6 extends AbstractC2222p5 implements abx0 {
    private static final C2247s6 zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C2247s6 c2247s6 = new C2247s6();
        zzb = c2247s6;
        AbstractC2222p5.m13159C(C2247s6.class, c2247s6);
    }

    /* JADX INFO: renamed from: L */
    public static afx0 m13303L() {
        return (afx0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13305N(C2247s6 c2247s6, String str) {
        c2247s6.zzd |= 1;
        c2247s6.zze = str;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13306O(C2247s6 c2247s6, long j) {
        c2247s6.zzd |= 2;
        c2247s6.zzf = j;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13307P(C2247s6 c2247s6, boolean z) {
        c2247s6.zzd |= 4;
        c2247s6.zzg = z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", bfx0.f75386a, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C2247s6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new afx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

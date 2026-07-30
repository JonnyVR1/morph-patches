package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.ipr0;
import p149l.xpr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C2136f extends AbstractC2222p5 implements abx0 {
    private static final C2136f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C2136f c2136f = new C2136f();
        zzb = c2136f;
        AbstractC2222p5.m13159C(C2136f.class, c2136f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C2136f();
        }
        ipr0 ipr0Var = null;
        if (i2 == 4) {
            return new xpr0(ipr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

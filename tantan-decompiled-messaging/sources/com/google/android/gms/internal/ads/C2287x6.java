package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.mfx0;
import p149l.u8x0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2287x6 extends AbstractC2222p5 implements abx0 {
    private static final C2287x6 zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private u8x0 zzg = AbstractC2222p5.m13168s();
    private z9x0 zzi = AbstractC2222p5.m13172w();
    private zzgyl zzj = zzgyl.zzb;

    static {
        C2287x6 c2287x6 = new C2287x6();
        zzb = c2287x6;
        AbstractC2222p5.m13159C(C2287x6.class, c2287x6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C2279w6.class, "zzj"});
        }
        if (i2 == 3) {
            return new C2287x6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new mfx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

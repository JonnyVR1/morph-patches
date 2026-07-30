package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.kdx0;
import p149l.ldx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2110b6 extends AbstractC2222p5 implements abx0 {
    private static final C2110b6 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgyl zzg = zzgyl.zzb;

    static {
        C2110b6 c2110b6 = new C2110b6();
        zzb = c2110b6;
        AbstractC2222p5.m13159C(C2110b6.class, c2110b6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", ldx0.f127622a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2110b6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new kdx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

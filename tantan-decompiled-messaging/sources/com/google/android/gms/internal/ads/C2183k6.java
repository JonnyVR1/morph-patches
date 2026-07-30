package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.gex0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2183k6 extends AbstractC2222p5 implements abx0 {
    private static final C2183k6 zzb;
    private int zzd;
    private int zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        C2183k6 c2183k6 = new C2183k6();
        zzb = c2183k6;
        AbstractC2222p5.m13159C(C2183k6.class, c2183k6);
    }

    public C2183k6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2183k6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new gex0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

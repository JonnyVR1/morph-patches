package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.eex0;
import p149l.gdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2167i6 extends AbstractC2222p5 implements abx0 {
    private static final C2167i6 zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        C2167i6 c2167i6 = new C2167i6();
        zzb = c2167i6;
        AbstractC2222p5.m13159C(C2167i6.class, c2167i6);
    }

    public C2167i6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zze = zzgylVar;
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
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2167i6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new eex0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

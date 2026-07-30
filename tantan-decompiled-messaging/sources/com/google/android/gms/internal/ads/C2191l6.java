package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.fex0;
import p149l.gdx0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2191l6 extends AbstractC2222p5 implements abx0 {
    private static final C2191l6 zzb;
    private int zzd;
    private C2183k6 zze;
    private zzgyl zzg;
    private zzgyl zzh;
    private int zzi;
    private zzgyl zzj;
    private byte zzk = 2;
    private z9x0 zzf = AbstractC2222p5.m13172w();

    static {
        C2191l6 c2191l6 = new C2191l6();
        zzb = c2191l6;
        AbstractC2222p5.m13159C(C2191l6.class, c2191l6);
    }

    public C2191l6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
        this.zzj = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", C2159h6.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C2191l6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new fex0(gdx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

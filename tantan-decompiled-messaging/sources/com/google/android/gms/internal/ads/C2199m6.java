package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.iex0;
import p149l.jex0;
import p149l.t8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2199m6 extends AbstractC2222p5 implements abx0 {
    private static final C2199m6 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C2199m6 c2199m6 = new C2199m6();
        zzb = c2199m6;
        AbstractC2222p5.m13159C(C2199m6.class, c2199m6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            t8x0 t8x0Var = iex0.f112933a;
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", t8x0Var, "zzf", "zzg", t8x0Var});
        }
        if (i2 == 3) {
            return new C2199m6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new jex0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

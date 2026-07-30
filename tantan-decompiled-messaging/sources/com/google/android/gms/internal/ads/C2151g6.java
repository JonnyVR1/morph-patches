package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.aex0;
import p149l.bex0;
import p149l.gdx0;
import p149l.zdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2151g6 extends AbstractC2222p5 implements abx0 {
    private static final C2151g6 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        C2151g6 c2151g6 = new C2151g6();
        zzb = c2151g6;
        AbstractC2222p5.m13159C(C2151g6.class, c2151g6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", bex0.f75256a, "zzf", zdx0.f202747a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2151g6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new aex0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

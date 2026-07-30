package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.rex0;
import p149l.sex0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2223p6 extends AbstractC2222p5 implements abx0 {
    private static final C2223p6 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        C2223p6 c2223p6 = new C2223p6();
        zzb = c2223p6;
        AbstractC2222p5.m13159C(C2223p6.class, c2223p6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", sex0.f164184a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2223p6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new rex0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.wdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2127d6 extends AbstractC2222p5 implements abx0 {
    private static final C2127d6 zzb;
    private int zzd;
    private String zze = "";

    static {
        C2127d6 c2127d6 = new C2127d6();
        zzb = c2127d6;
        AbstractC2222p5.m13159C(C2127d6.class, c2127d6);
    }

    /* JADX INFO: renamed from: L */
    public static wdx0 m12663L() {
        return (wdx0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12665N(C2127d6 c2127d6, String str) {
        c2127d6.zzd |= 1;
        c2127d6.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2127d6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new wdx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

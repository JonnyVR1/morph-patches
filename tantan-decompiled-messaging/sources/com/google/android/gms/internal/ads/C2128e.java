package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.ipr0;
import p149l.vpr0;
import p149l.wpr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C2128e extends AbstractC2222p5 implements abx0 {
    private static final C2128e zzb;
    private int zzd;
    private int zze = 2;

    static {
        C2128e c2128e = new C2128e();
        zzb = c2128e;
        AbstractC2222p5.m13159C(C2128e.class, c2128e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", wpr0.f187574a});
        }
        if (i2 == 3) {
            return new C2128e();
        }
        ipr0 ipr0Var = null;
        if (i2 == 4) {
            return new vpr0(ipr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

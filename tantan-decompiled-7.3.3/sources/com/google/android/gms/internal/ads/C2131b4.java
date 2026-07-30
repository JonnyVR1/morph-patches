package com.google.android.gms.internal.ads;

import p153l.ebx0;
import p153l.fbx0;
import p153l.gkx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2131b4 extends AbstractC2245p5 implements gkx0 {
    private static final C2131b4 zzb;
    private int zzd;

    static {
        C2131b4 c2131b4 = new C2131b4();
        zzb = c2131b4;
        AbstractC2245p5.m13213C(C2131b4.class, c2131b4);
    }

    /* JADX INFO: renamed from: M */
    public static fbx0 m12588M() {
        return (fbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2131b4 m12590O() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new C2131b4();
        }
        ebx0 ebx0Var = null;
        if (i2 == 4) {
            return new fbx0(ebx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12592L() {
        return this.zzd;
    }
}

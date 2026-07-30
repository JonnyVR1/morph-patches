package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.o4x0;
import p149l.p4x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2109b5 extends AbstractC2222p5 implements abx0 {
    private static final C2109b5 zzb;
    private String zzd = "";

    static {
        C2109b5 c2109b5 = new C2109b5();
        zzb = c2109b5;
        AbstractC2222p5.m13159C(C2109b5.class, c2109b5);
    }

    /* JADX INFO: renamed from: L */
    public static p4x0 m12539L() {
        return (p4x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static C2109b5 m12541N() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static C2109b5 m12542O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2109b5) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12543Q(C2109b5 c2109b5, String str) {
        str.getClass();
        c2109b5.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new C2109b5();
        }
        o4x0 o4x0Var = null;
        if (i2 == 4) {
            return new p4x0(o4x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: P */
    public final String m12544P() {
        return this.zzd;
    }
}

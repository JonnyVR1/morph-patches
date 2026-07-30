package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.x3x0;
import p149l.y3x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2261u4 extends AbstractC2222p5 implements abx0 {
    private static final C2261u4 zzb;
    private String zzd = "";
    private zzgyl zze = zzgyl.zzb;
    private int zzf;

    static {
        C2261u4 c2261u4 = new C2261u4();
        zzb = c2261u4;
        AbstractC2222p5.m13159C(C2261u4.class, c2261u4);
    }

    /* JADX INFO: renamed from: L */
    public static y3x0 m13343L() {
        return (y3x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static C2261u4 m13345N() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static C2261u4 m13346O(byte[] bArr, d8x0 d8x0Var) throws zzhag {
        return (C2261u4) AbstractC2222p5.m13167r(zzb, bArr, d8x0Var);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13347S(C2261u4 c2261u4, String str) {
        str.getClass();
        c2261u4.zzd = str;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13348T(C2261u4 c2261u4, zzgyl zzgylVar) {
        zzgylVar.getClass();
        c2261u4.zze = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2261u4();
        }
        x3x0 x3x0Var = null;
        if (i2 == 4) {
            return new y3x0(x3x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: P */
    public final zzgvz m13350P() {
        zzgvz zzgvzVarZzb = zzgvz.zzb(this.zzf);
        return zzgvzVarZzb == null ? zzgvz.UNRECOGNIZED : zzgvzVarZzb;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m13351Q() {
        return this.zze;
    }

    /* JADX INFO: renamed from: R */
    public final String m13352R() {
        return this.zzd;
    }
}

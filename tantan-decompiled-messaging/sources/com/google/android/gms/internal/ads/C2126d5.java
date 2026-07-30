package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.s4x0;
import p149l.t4x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2126d5 extends AbstractC2222p5 implements abx0 {
    private static final C2126d5 zzb;
    private int zzd;
    private String zze = "";
    private C2261u4 zzf;

    static {
        C2126d5 c2126d5 = new C2126d5();
        zzb = c2126d5;
        AbstractC2222p5.m13159C(C2126d5.class, c2126d5);
    }

    /* JADX INFO: renamed from: M */
    public static t4x0 m12655M() {
        return (t4x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2126d5 m12657O() {
        return zzb;
    }

    /* JADX INFO: renamed from: P */
    public static C2126d5 m12658P(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2126d5) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12659R(C2126d5 c2126d5, String str) {
        str.getClass();
        c2126d5.zze = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12660S(C2126d5 c2126d5, C2261u4 c2261u4) {
        c2261u4.getClass();
        c2126d5.zzf = c2261u4;
        c2126d5.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2126d5();
        }
        s4x0 s4x0Var = null;
        if (i2 == 4) {
            return new t4x0(s4x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final C2261u4 m12661L() {
        C2261u4 c2261u4 = this.zzf;
        return c2261u4 == null ? C2261u4.m13345N() : c2261u4;
    }

    /* JADX INFO: renamed from: Q */
    public final String m12662Q() {
        return this.zze;
    }
}

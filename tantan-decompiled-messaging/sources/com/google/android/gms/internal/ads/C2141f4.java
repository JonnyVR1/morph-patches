package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g2x0;
import p149l.h2x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2141f4 extends AbstractC2222p5 implements abx0 {
    private static final C2141f4 zzb;
    private int zzd;
    private C2149g4 zze;
    private int zzf;

    static {
        C2141f4 c2141f4 = new C2141f4();
        zzb = c2141f4;
        AbstractC2222p5.m13159C(C2141f4.class, c2141f4);
    }

    /* JADX INFO: renamed from: M */
    public static h2x0 m12694M() {
        return (h2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2141f4 m12696O() {
        return zzb;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12697Q(C2141f4 c2141f4, C2149g4 c2149g4) {
        c2149g4.getClass();
        c2141f4.zze = c2149g4;
        c2141f4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2141f4();
        }
        g2x0 g2x0Var = null;
        if (i2 == 4) {
            return new h2x0(g2x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12699L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2149g4 m12700P() {
        C2149g4 c2149g4 = this.zze;
        return c2149g4 == null ? C2149g4.m12717O() : c2149g4;
    }
}

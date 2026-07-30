package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.ydx0;
import p153l.zdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2149d5 extends AbstractC2245p5 implements gkx0 {
    private static final C2149d5 zzb;
    private int zzd;
    private String zze = "";
    private C2284u4 zzf;

    static {
        C2149d5 c2149d5 = new C2149d5();
        zzb = c2149d5;
        AbstractC2245p5.m13213C(C2149d5.class, c2149d5);
    }

    /* JADX INFO: renamed from: M */
    public static zdx0 m12709M() {
        return (zdx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2149d5 m12711O() {
        return zzb;
    }

    /* JADX INFO: renamed from: P */
    public static C2149d5 m12712P(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2149d5) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12713R(C2149d5 c2149d5, String str) {
        str.getClass();
        c2149d5.zze = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12714S(C2149d5 c2149d5, C2284u4 c2284u4) {
        c2284u4.getClass();
        c2149d5.zzf = c2284u4;
        c2149d5.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2149d5();
        }
        ydx0 ydx0Var = null;
        if (i2 == 4) {
            return new zdx0(ydx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final C2284u4 m12715L() {
        C2284u4 c2284u4 = this.zzf;
        return c2284u4 == null ? C2284u4.m13399N() : c2284u4;
    }

    /* JADX INFO: renamed from: Q */
    public final String m12716Q() {
        return this.zze;
    }
}

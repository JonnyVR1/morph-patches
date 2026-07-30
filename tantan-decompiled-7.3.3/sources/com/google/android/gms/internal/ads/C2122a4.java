package com.google.android.gms.internal.ads;

import p153l.cbx0;
import p153l.dbx0;
import p153l.gkx0;
import p153l.jhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2122a4 extends AbstractC2245p5 implements gkx0 {
    private static final C2122a4 zzb;
    private int zzd;
    private int zze;
    private C2131b4 zzf;

    static {
        C2122a4 c2122a4 = new C2122a4();
        zzb = c2122a4;
        AbstractC2245p5.m13213C(C2122a4.class, c2122a4);
    }

    /* JADX INFO: renamed from: M */
    public static dbx0 m12563M() {
        return (dbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2122a4 m12565O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2122a4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12567R(C2122a4 c2122a4, C2131b4 c2131b4) {
        c2131b4.getClass();
        c2122a4.zzf = c2131b4;
        c2122a4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2122a4();
        }
        cbx0 cbx0Var = null;
        if (i2 == 4) {
            return new dbx0(cbx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12568L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final C2131b4 m12569P() {
        C2131b4 c2131b4 = this.zzf;
        return c2131b4 == null ? C2131b4.m12590O() : c2131b4;
    }
}

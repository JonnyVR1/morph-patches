package com.google.android.gms.internal.ads;

import p153l.ces0;
import p153l.ees0;
import p153l.fes0;
import p153l.gkx0;
import p153l.hes0;
import p153l.ies0;
import p153l.mcs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2216m0 extends AbstractC2245p5 implements gkx0 {
    private static final C2216m0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C2216m0 c2216m0 = new C2216m0();
        zzb = c2216m0;
        AbstractC2245p5.m13213C(C2216m0.class, c2216m0);
    }

    /* JADX INFO: renamed from: L */
    public static ces0 m12947L() {
        return (ces0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static C2216m0 m12949N() {
        return zzb;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12950S(C2216m0 c2216m0, int i) {
        c2216m0.zze = i - 1;
        c2216m0.zzd |= 1;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12951T(C2216m0 c2216m0, int i) {
        c2216m0.zzf = i - 1;
        c2216m0.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", hes0.f109185a, "zzf", ees0.f93668a});
        }
        if (i2 == 3) {
            return new C2216m0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new ces0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m12952O() {
        return (this.zzd & 2) != 0;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m12953P() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public final int m12954Q() {
        int iM125330a = fes0.m125330a(this.zzf);
        if (iM125330a == 0) {
            return 1;
        }
        return iM125330a;
    }

    /* JADX INFO: renamed from: R */
    public final int m12955R() {
        int iM139647a = ies0.m139647a(this.zze);
        if (iM139647a == 0) {
            return 1;
        }
        return iM139647a;
    }
}

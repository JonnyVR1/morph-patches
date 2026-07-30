package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.b5s0;
import p149l.c5s0;
import p149l.g3s0;
import p149l.w4s0;
import p149l.y4s0;
import p149l.z4s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2193m0 extends AbstractC2222p5 implements abx0 {
    private static final C2193m0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C2193m0 c2193m0 = new C2193m0();
        zzb = c2193m0;
        AbstractC2222p5.m13159C(C2193m0.class, c2193m0);
    }

    /* JADX INFO: renamed from: L */
    public static w4s0 m12893L() {
        return (w4s0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static C2193m0 m12895N() {
        return zzb;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12896S(C2193m0 c2193m0, int i) {
        c2193m0.zze = i - 1;
        c2193m0.zzd |= 1;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12897T(C2193m0 c2193m0, int i) {
        c2193m0.zzf = i - 1;
        c2193m0.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", b5s0.f73696a, "zzf", y4s0.f196337a});
        }
        if (i2 == 3) {
            return new C2193m0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new w4s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m12898O() {
        return (this.zzd & 2) != 0;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m12899P() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public final int m12900Q() {
        int iM217126a = z4s0.m217126a(this.zzf);
        if (iM217126a == 0) {
            return 1;
        }
        return iM217126a;
    }

    /* JADX INFO: renamed from: R */
    public final int m12901R() {
        int iM105356a = c5s0.m105356a(this.zze);
        if (iM105356a == 0) {
            return 1;
        }
        return iM105356a;
    }
}

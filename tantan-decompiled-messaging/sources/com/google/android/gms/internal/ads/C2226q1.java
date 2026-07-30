package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.e5w0;
import p149l.g5w0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2226q1 extends AbstractC2222p5 implements abx0 {
    private static final C2226q1 zzb;
    private int zzd;
    private C2218p1 zze;

    static {
        C2226q1 c2226q1 = new C2226q1();
        zzb = c2226q1;
        AbstractC2222p5.m13159C(C2226q1.class, c2226q1);
    }

    /* JADX INFO: renamed from: L */
    public static g5w0 m13195L() {
        return (g5w0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13197N(C2226q1 c2226q1, C2218p1 c2218p1) {
        c2218p1.getClass();
        c2226q1.zze = c2218p1;
        c2226q1.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2226q1();
        }
        e5w0 e5w0Var = null;
        if (i2 == 4) {
            return new g5w0(e5w0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

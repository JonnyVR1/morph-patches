package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.e5w0;
import p149l.f5w0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2234r1 extends AbstractC2222p5 implements abx0 {
    private static final C2234r1 zzb;
    private z9x0 zzd = AbstractC2222p5.m13172w();

    static {
        C2234r1 c2234r1 = new C2234r1();
        zzb = c2234r1;
        AbstractC2222p5.m13159C(C2234r1.class, c2234r1);
    }

    /* JADX INFO: renamed from: M */
    public static f5w0 m13219M() {
        return (f5w0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13222P(C2234r1 c2234r1, C2226q1 c2226q1) {
        c2226q1.getClass();
        z9x0 z9x0Var = c2234r1.zzd;
        if (!z9x0Var.zzc()) {
            c2234r1.zzd = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2234r1.zzd.add(c2226q1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2226q1.class});
        }
        if (i2 == 3) {
            return new C2234r1();
        }
        e5w0 e5w0Var = null;
        if (i2 == 4) {
            return new f5w0(e5w0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13223L() {
        return this.zzd.size();
    }
}

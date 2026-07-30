package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.n9w0;
import p149l.o9w0;
import p149l.p9w0;
import p149l.u8x0;
import p149l.w9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2266v1 extends AbstractC2222p5 implements abx0 {
    private static final w9x0 zzb = new n9w0();
    private static final C2266v1 zzd;
    private int zze;
    private u8x0 zzf = AbstractC2222p5.m13168s();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C2266v1 c2266v1 = new C2266v1();
        zzd = c2266v1;
        AbstractC2222p5.m13159C(C2266v1.class, c2266v1);
    }

    /* JADX INFO: renamed from: L */
    public static p9w0 m13375L() {
        return (p9w0) zzd.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13377N(C2266v1 c2266v1, String str) {
        str.getClass();
        c2266v1.zze |= 1;
        c2266v1.zzg = str;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13378O(C2266v1 c2266v1, int i) {
        u8x0 u8x0Var = c2266v1.zzf;
        if (!u8x0Var.zzc()) {
            c2266v1.zzf = AbstractC2222p5.m13169t(u8x0Var);
        }
        c2266v1.zzf.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", o9w0.f142747a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C2266v1();
        }
        n9w0 n9w0Var = null;
        if (i2 == 4) {
            return new p9w0(n9w0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}

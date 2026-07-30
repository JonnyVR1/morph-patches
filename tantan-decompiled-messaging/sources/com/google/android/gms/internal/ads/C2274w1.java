package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.q9w0;
import p149l.r9w0;
import p149l.s9w0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2274w1 extends AbstractC2222p5 implements abx0 {
    private static final C2274w1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C2266v1 zzh;

    static {
        C2274w1 c2274w1 = new C2274w1();
        zzb = c2274w1;
        AbstractC2222p5.m13159C(C2274w1.class, c2274w1);
    }

    /* JADX INFO: renamed from: L */
    public static r9w0 m13414L() {
        return (r9w0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13416N(C2274w1 c2274w1, String str) {
        str.getClass();
        c2274w1.zzd |= 2;
        c2274w1.zzf = str;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13417O(C2274w1 c2274w1, C2266v1 c2266v1) {
        c2266v1.getClass();
        c2274w1.zzh = c2266v1;
        c2274w1.zzd |= 8;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13418P(C2274w1 c2274w1, int i) {
        c2274w1.zze = 1;
        c2274w1.zzd = 1 | c2274w1.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", s9w0.f163244a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2274w1();
        }
        q9w0 q9w0Var = null;
        if (i2 == 4) {
            return new r9w0(q9w0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

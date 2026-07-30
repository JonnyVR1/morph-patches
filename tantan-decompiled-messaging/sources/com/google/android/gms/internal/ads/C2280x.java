package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.i3s0;
import p149l.q4s0;
import p149l.s3s0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C2280x extends AbstractC2222p5 implements abx0 {
    private static final C2280x zzb;
    private int zzd;
    private int zze;
    private C2121d0 zzg;
    private C2129e0 zzh;
    private C2137f0 zzj;
    private C2225q0 zzk;
    private C2201n0 zzl;
    private C2177k0 zzm;
    private C2185l0 zzn;
    private int zzf = 1000;
    private z9x0 zzi = AbstractC2222p5.m13172w();
    private z9x0 zzo = AbstractC2222p5.m13172w();

    static {
        C2280x c2280x = new C2280x();
        zzb = c2280x;
        AbstractC2222p5.m13159C(C2280x.class, c2280x);
    }

    /* JADX INFO: renamed from: M */
    public static C2280x m13438M() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13439O(C2280x c2280x, zzbbz zzbbzVar) {
        c2280x.zze = zzbbzVar.zza();
        c2280x.zzd |= 1;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13440P(C2280x c2280x, C2129e0 c2129e0) {
        c2129e0.getClass();
        c2280x.zzh = c2129e0;
        c2280x.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", i3s0.f111370a, "zzf", q4s0.f152670a, "zzg", "zzh", "zzi", C2113c0.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", C2273w0.class});
        }
        if (i2 == 3) {
            return new C2280x();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new s3s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public final C2129e0 m13441N() {
        C2129e0 c2129e0 = this.zzh;
        return c2129e0 == null ? C2129e0.m12668M() : c2129e0;
    }
}

package com.google.android.gms.internal.ads;

import p153l.d0s0;
import p153l.ezr0;
import p153l.gkx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C2215m extends AbstractC2245p5 implements gkx0 {
    private static final C2215m zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        C2215m c2215m = new C2215m();
        zzb = c2215m;
        AbstractC2245p5.m13213C(C2215m.class, c2215m);
    }

    /* JADX INFO: renamed from: L */
    public static d0s0 m12940L() {
        return (d0s0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12942N(C2215m c2215m, long j) {
        c2215m.zzd |= 1;
        c2215m.zze = j;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12943O(C2215m c2215m, long j) {
        c2215m.zzd |= 4;
        c2215m.zzg = j;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m12944P(C2215m c2215m, long j) {
        c2215m.zzd |= 8;
        c2215m.zzh = j;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12945Q(C2215m c2215m, long j) {
        c2215m.zzd |= 16;
        c2215m.zzi = j;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12946R(C2215m c2215m, long j) {
        c2215m.zzd |= 32;
        c2215m.zzj = j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C2215m();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new d0s0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

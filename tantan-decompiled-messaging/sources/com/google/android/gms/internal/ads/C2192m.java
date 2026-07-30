package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.xqr0;
import p149l.ypr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C2192m extends AbstractC2222p5 implements abx0 {
    private static final C2192m zzb;
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
        C2192m c2192m = new C2192m();
        zzb = c2192m;
        AbstractC2222p5.m13159C(C2192m.class, c2192m);
    }

    /* JADX INFO: renamed from: L */
    public static xqr0 m12886L() {
        return (xqr0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12888N(C2192m c2192m, long j) {
        c2192m.zzd |= 1;
        c2192m.zze = j;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12889O(C2192m c2192m, long j) {
        c2192m.zzd |= 4;
        c2192m.zzg = j;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m12890P(C2192m c2192m, long j) {
        c2192m.zzd |= 8;
        c2192m.zzh = j;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12891Q(C2192m c2192m, long j) {
        c2192m.zzd |= 16;
        c2192m.zzi = j;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12892R(C2192m c2192m, long j) {
        c2192m.zzd |= 32;
        c2192m.zzj = j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C2192m();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new xqr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

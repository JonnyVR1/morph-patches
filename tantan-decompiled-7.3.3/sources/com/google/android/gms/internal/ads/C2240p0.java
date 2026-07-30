package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.mcs0;
import p153l.mes0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2240p0 extends AbstractC2245p5 implements gkx0 {
    private static final C2240p0 zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private fjx0 zze = AbstractC2245p5.m13226w();
    private String zzi = "";
    private String zzj = "";

    static {
        C2240p0 c2240p0 = new C2240p0();
        zzb = c2240p0;
        AbstractC2245p5.m13213C(C2240p0.class, c2240p0);
    }

    /* JADX INFO: renamed from: L */
    public static mes0 m13169L() {
        return (mes0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13171N(C2240p0 c2240p0, Iterable iterable) {
        fjx0 fjx0Var = c2240p0.zze;
        if (!fjx0Var.zzc()) {
            c2240p0.zze = AbstractC2245p5.m13227x(fjx0Var);
        }
        AbstractC2181h5.m12794f(iterable, c2240p0.zze);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13172O(C2240p0 c2240p0, int i) {
        c2240p0.zzd |= 1;
        c2240p0.zzf = i;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13173P(C2240p0 c2240p0, int i) {
        c2240p0.zzd |= 2;
        c2240p0.zzg = i;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m13174Q(C2240p0 c2240p0, long j) {
        c2240p0.zzd |= 4;
        c2240p0.zzh = j;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m13175R(C2240p0 c2240p0, String str) {
        str.getClass();
        c2240p0.zzd |= 8;
        c2240p0.zzi = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13176S(C2240p0 c2240p0, String str) {
        str.getClass();
        c2240p0.zzd |= 16;
        c2240p0.zzj = str;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13177T(C2240p0 c2240p0, long j) {
        c2240p0.zzd |= 32;
        c2240p0.zzk = j;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m13178U(C2240p0 c2240p0, int i) {
        c2240p0.zzd |= 64;
        c2240p0.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", C2232o0.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C2240p0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new mes0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

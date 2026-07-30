package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.g5s0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2217p0 extends AbstractC2222p5 implements abx0 {
    private static final C2217p0 zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private z9x0 zze = AbstractC2222p5.m13172w();
    private String zzi = "";
    private String zzj = "";

    static {
        C2217p0 c2217p0 = new C2217p0();
        zzb = c2217p0;
        AbstractC2222p5.m13159C(C2217p0.class, c2217p0);
    }

    /* JADX INFO: renamed from: L */
    public static g5s0 m13115L() {
        return (g5s0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13117N(C2217p0 c2217p0, Iterable iterable) {
        z9x0 z9x0Var = c2217p0.zze;
        if (!z9x0Var.zzc()) {
            c2217p0.zze = AbstractC2222p5.m13173x(z9x0Var);
        }
        AbstractC2158h5.m12740f(iterable, c2217p0.zze);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13118O(C2217p0 c2217p0, int i) {
        c2217p0.zzd |= 1;
        c2217p0.zzf = i;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13119P(C2217p0 c2217p0, int i) {
        c2217p0.zzd |= 2;
        c2217p0.zzg = i;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m13120Q(C2217p0 c2217p0, long j) {
        c2217p0.zzd |= 4;
        c2217p0.zzh = j;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m13121R(C2217p0 c2217p0, String str) {
        str.getClass();
        c2217p0.zzd |= 8;
        c2217p0.zzi = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13122S(C2217p0 c2217p0, String str) {
        str.getClass();
        c2217p0.zzd |= 16;
        c2217p0.zzj = str;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13123T(C2217p0 c2217p0, long j) {
        c2217p0.zzd |= 32;
        c2217p0.zzk = j;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m13124U(C2217p0 c2217p0, int i) {
        c2217p0.zzd |= 64;
        c2217p0.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", C2209o0.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C2217p0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new g5s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

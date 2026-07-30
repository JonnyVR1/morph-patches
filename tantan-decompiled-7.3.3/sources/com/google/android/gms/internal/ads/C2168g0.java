package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.kds0;
import p153l.mcs0;
import p153l.wds0;
import p153l.zhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2168g0 extends AbstractC2245p5 implements gkx0 {
    private static final C2168g0 zzb;
    private int zzd;
    private C2280u0 zzf;
    private int zzg;
    private C2288v0 zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        C2168g0 c2168g0 = new C2168g0();
        zzb = c2168g0;
        AbstractC2245p5.m13213C(C2168g0.class, c2168g0);
    }

    /* JADX INFO: renamed from: M */
    public static C2168g0 m12765M() {
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12766N(C2168g0 c2168g0, String str) {
        c2168g0.zzd |= 1;
        c2168g0.zze = str;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12767O(C2168g0 c2168g0, C2288v0 c2288v0) {
        c2288v0.getClass();
        c2168g0.zzh = c2288v0;
        c2168g0.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zhx0 zhx0Var = wds0.f188633a;
            return AbstractC2245p5.m13229z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zhx0Var, "zzk", zhx0Var, "zzl", zhx0Var});
        }
        if (i2 == 3) {
            return new C2168g0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new kds0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

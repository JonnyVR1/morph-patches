package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.ids0;
import p153l.mcs0;
import p153l.wds0;
import p153l.zhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2152e0 extends AbstractC2245p5 implements gkx0 {
    private static final C2152e0 zzb;
    private int zzd;
    private String zze = "";
    private fjx0 zzf = AbstractC2245p5.m13226w();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        C2152e0 c2152e0 = new C2152e0();
        zzb = c2152e0;
        AbstractC2245p5.m13213C(C2152e0.class, c2152e0);
    }

    /* JADX INFO: renamed from: M */
    public static C2152e0 m12722M() {
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12723N(C2152e0 c2152e0, String str) {
        str.getClass();
        c2152e0.zzd |= 1;
        c2152e0.zze = str;
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
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", C2136c0.class, "zzg", zhx0Var, "zzh", zhx0Var, "zzi", zhx0Var});
        }
        if (i2 == 3) {
            return new C2152e0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new ids0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

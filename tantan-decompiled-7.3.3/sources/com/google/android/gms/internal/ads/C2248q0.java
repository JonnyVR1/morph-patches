package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mcs0;
import p153l.wds0;
import p153l.wes0;
import p153l.zhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2248q0 extends AbstractC2245p5 implements gkx0 {
    private static final C2248q0 zzb;
    private int zzd;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private C2256r0 zzo;

    static {
        C2248q0 c2248q0 = new C2248q0();
        zzb = c2248q0;
        AbstractC2245p5.m13213C(C2248q0.class, c2248q0);
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
            return AbstractC2245p5.m13229z(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", zhx0Var, "zzf", zhx0Var, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new C2248q0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new wes0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.mcs0;
import p153l.ocs0;
import p153l.wds0;
import p153l.ycs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C2303x extends AbstractC2245p5 implements gkx0 {
    private static final C2303x zzb;
    private int zzd;
    private int zze;
    private C2144d0 zzg;
    private C2152e0 zzh;
    private C2160f0 zzj;
    private C2248q0 zzk;
    private C2224n0 zzl;
    private C2200k0 zzm;
    private C2208l0 zzn;
    private int zzf = 1000;
    private fjx0 zzi = AbstractC2245p5.m13226w();
    private fjx0 zzo = AbstractC2245p5.m13226w();

    static {
        C2303x c2303x = new C2303x();
        zzb = c2303x;
        AbstractC2245p5.m13213C(C2303x.class, c2303x);
    }

    /* JADX INFO: renamed from: M */
    public static C2303x m13492M() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13493O(C2303x c2303x, zzbbz zzbbzVar) {
        c2303x.zze = zzbbzVar.zza();
        c2303x.zzd |= 1;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13494P(C2303x c2303x, C2152e0 c2152e0) {
        c2152e0.getClass();
        c2303x.zzh = c2152e0;
        c2303x.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", ocs0.f146732a, "zzf", wds0.f188633a, "zzg", "zzh", "zzi", C2136c0.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", C2296w0.class});
        }
        if (i2 == 3) {
            return new C2303x();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new ycs0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public final C2152e0 m13495N() {
        C2152e0 c2152e0 = this.zzh;
        return c2152e0 == null ? C2152e0.m12722M() : c2152e0;
    }
}

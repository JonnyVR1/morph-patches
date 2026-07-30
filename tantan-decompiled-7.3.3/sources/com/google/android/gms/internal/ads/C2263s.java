package com.google.android.gms.internal.ads;

import p153l.ezr0;
import p153l.fjx0;
import p153l.g0s0;
import p153l.gkx0;
import p153l.i0s0;
import p153l.l0s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C2263s extends AbstractC2245p5 implements gkx0 {
    private static final C2263s zzb;
    private int zzd;
    private fjx0 zze = AbstractC2245p5.m13226w();
    private zzgyl zzf = zzgyl.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        C2263s c2263s = new C2263s();
        zzb = c2263s;
        AbstractC2245p5.m13213C(C2263s.class, c2263s);
    }

    /* JADX INFO: renamed from: L */
    public static l0s0 m13300L() {
        return (l0s0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13302N(C2263s c2263s, zzgyl zzgylVar) {
        fjx0 fjx0Var = c2263s.zze;
        if (!fjx0Var.zzc()) {
            c2263s.zze = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2263s.zze.add(zzgylVar);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13303O(C2263s c2263s, zzgyl zzgylVar) {
        c2263s.zzd |= 1;
        c2263s.zzf = zzgylVar;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13304P(C2263s c2263s, int i) {
        c2263s.zzh = 4;
        c2263s.zzd = 4 | c2263s.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", i0s0.f112449a, "zzh", g0s0.f101678a});
        }
        if (i2 == 3) {
            return new C2263s();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new l0s0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

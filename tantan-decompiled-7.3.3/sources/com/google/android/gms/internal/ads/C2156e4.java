package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.kbx0;
import p153l.lbx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2156e4 extends AbstractC2245p5 implements gkx0 {
    private static final C2156e4 zzb;
    private int zzd;
    private int zze;
    private C2172g4 zzf;
    private zzgyl zzg = zzgyl.zzb;

    static {
        C2156e4 c2156e4 = new C2156e4();
        zzb = c2156e4;
        AbstractC2245p5.m13213C(C2156e4.class, c2156e4);
    }

    /* JADX INFO: renamed from: M */
    public static lbx0 m12725M() {
        return (lbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2156e4 m12727O() {
        return zzb;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12728R(C2156e4 c2156e4, C2172g4 c2172g4) {
        c2172g4.getClass();
        c2156e4.zzf = c2172g4;
        c2156e4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2156e4();
        }
        kbx0 kbx0Var = null;
        if (i2 == 4) {
            return new lbx0(kbx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12730L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final C2172g4 m12731P() {
        C2172g4 c2172g4 = this.zzf;
        return c2172g4 == null ? C2172g4.m12771O() : c2172g4;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m12732Q() {
        return this.zzg;
    }
}

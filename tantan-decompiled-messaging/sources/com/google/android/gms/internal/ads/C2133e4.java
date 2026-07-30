package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.e2x0;
import p149l.f2x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2133e4 extends AbstractC2222p5 implements abx0 {
    private static final C2133e4 zzb;
    private int zzd;
    private int zze;
    private C2149g4 zzf;
    private zzgyl zzg = zzgyl.zzb;

    static {
        C2133e4 c2133e4 = new C2133e4();
        zzb = c2133e4;
        AbstractC2222p5.m13159C(C2133e4.class, c2133e4);
    }

    /* JADX INFO: renamed from: M */
    public static f2x0 m12671M() {
        return (f2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2133e4 m12673O() {
        return zzb;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12674R(C2133e4 c2133e4, C2149g4 c2149g4) {
        c2149g4.getClass();
        c2133e4.zzf = c2149g4;
        c2133e4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2133e4();
        }
        e2x0 e2x0Var = null;
        if (i2 == 4) {
            return new f2x0(e2x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12676L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final C2149g4 m12677P() {
        C2149g4 c2149g4 = this.zzf;
        return c2149g4 == null ? C2149g4.m12717O() : c2149g4;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m12678Q() {
        return this.zzg;
    }
}

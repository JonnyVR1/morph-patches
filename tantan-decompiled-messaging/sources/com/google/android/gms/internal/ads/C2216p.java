package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.ypr0;
import p149l.zqr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C2216p extends AbstractC2222p5 implements abx0 {
    private static final C2216p zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private zzgyl zzg;
    private zzgyl zzh;

    static {
        C2216p c2216p = new C2216p();
        zzb = c2216p;
        AbstractC2222p5.m13159C(C2216p.class, c2216p);
    }

    public C2216p() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zze = zzgylVar;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    /* JADX INFO: renamed from: L */
    public static zqr0 m13104L() {
        return (zqr0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static C2216p m13106N(byte[] bArr, d8x0 d8x0Var) throws zzhag {
        return (C2216p) AbstractC2222p5.m13167r(zzb, bArr, d8x0Var);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13107S(C2216p c2216p, zzgyl zzgylVar) {
        c2216p.zzd |= 1;
        c2216p.zze = zzgylVar;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13108T(C2216p c2216p, zzgyl zzgylVar) {
        c2216p.zzd |= 2;
        c2216p.zzf = zzgylVar;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m13109U(C2216p c2216p, zzgyl zzgylVar) {
        c2216p.zzd |= 4;
        c2216p.zzg = zzgylVar;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m13110V(C2216p c2216p, zzgyl zzgylVar) {
        c2216p.zzd |= 8;
        c2216p.zzh = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2216p();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new zqr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public final zzgyl m13111O() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m13112P() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m13113Q() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: R */
    public final zzgyl m13114R() {
        return this.zzg;
    }
}

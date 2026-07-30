package com.google.android.gms.internal.ads;

import p153l.ezr0;
import p153l.f0s0;
import p153l.gkx0;
import p153l.jhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C2239p extends AbstractC2245p5 implements gkx0 {
    private static final C2239p zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private zzgyl zzg;
    private zzgyl zzh;

    static {
        C2239p c2239p = new C2239p();
        zzb = c2239p;
        AbstractC2245p5.m13213C(C2239p.class, c2239p);
    }

    public C2239p() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zze = zzgylVar;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    /* JADX INFO: renamed from: L */
    public static f0s0 m13158L() {
        return (f0s0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static C2239p m13160N(byte[] bArr, jhx0 jhx0Var) throws zzhag {
        return (C2239p) AbstractC2245p5.m13221r(zzb, bArr, jhx0Var);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13161S(C2239p c2239p, zzgyl zzgylVar) {
        c2239p.zzd |= 1;
        c2239p.zze = zzgylVar;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13162T(C2239p c2239p, zzgyl zzgylVar) {
        c2239p.zzd |= 2;
        c2239p.zzf = zzgylVar;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m13163U(C2239p c2239p, zzgyl zzgylVar) {
        c2239p.zzd |= 4;
        c2239p.zzg = zzgylVar;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m13164V(C2239p c2239p, zzgyl zzgylVar) {
        c2239p.zzd |= 8;
        c2239p.zzh = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2239p();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new f0s0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public final zzgyl m13165O() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m13166P() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m13167Q() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: R */
    public final zzgyl m13168R() {
        return this.zzg;
    }
}

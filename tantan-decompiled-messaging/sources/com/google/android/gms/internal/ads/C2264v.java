package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.hxr0;
import p149l.ixr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C2264v extends AbstractC2222p5 implements abx0 {
    private static final C2264v zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        C2264v c2264v = new C2264v();
        zzb = c2264v;
        AbstractC2222p5.m13159C(C2264v.class, c2264v);
    }

    /* JADX INFO: renamed from: O */
    public static ixr0 m13355O() {
        return (ixr0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: Q */
    public static C2264v m13357Q() {
        return zzb;
    }

    /* JADX INFO: renamed from: R */
    public static C2264v m13358R(zzgyl zzgylVar) throws zzhag {
        return (C2264v) AbstractC2222p5.m13163n(zzb, zzgylVar);
    }

    /* JADX INFO: renamed from: S */
    public static C2264v m13359S(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2264v) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m13360V(C2264v c2264v, String str) {
        str.getClass();
        c2264v.zzd |= 1;
        c2264v.zze = str;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m13361W(C2264v c2264v, long j) {
        c2264v.zzd |= 16;
        c2264v.zzi = j;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m13362X(C2264v c2264v, String str) {
        str.getClass();
        c2264v.zzd |= 2;
        c2264v.zzf = str;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m13363Y(C2264v c2264v, long j) {
        c2264v.zzd |= 4;
        c2264v.zzg = j;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m13364Z(C2264v c2264v, long j) {
        c2264v.zzd |= 8;
        c2264v.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C2264v();
        }
        hxr0 hxr0Var = null;
        if (i2 == 4) {
            return new ixr0(hxr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final long m13365L() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: M */
    public final long m13366M() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: N */
    public final long m13367N() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: T */
    public final String m13368T() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: U */
    public final String m13369U() {
        return this.zze;
    }
}

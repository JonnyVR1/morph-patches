package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.n6s0;
import p153l.o6s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C2287v extends AbstractC2245p5 implements gkx0 {
    private static final C2287v zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        C2287v c2287v = new C2287v();
        zzb = c2287v;
        AbstractC2245p5.m13213C(C2287v.class, c2287v);
    }

    /* JADX INFO: renamed from: O */
    public static o6s0 m13409O() {
        return (o6s0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: Q */
    public static C2287v m13411Q() {
        return zzb;
    }

    /* JADX INFO: renamed from: R */
    public static C2287v m13412R(zzgyl zzgylVar) throws zzhag {
        return (C2287v) AbstractC2245p5.m13217n(zzb, zzgylVar);
    }

    /* JADX INFO: renamed from: S */
    public static C2287v m13413S(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2287v) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m13414V(C2287v c2287v, String str) {
        str.getClass();
        c2287v.zzd |= 1;
        c2287v.zze = str;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m13415W(C2287v c2287v, long j) {
        c2287v.zzd |= 16;
        c2287v.zzi = j;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m13416X(C2287v c2287v, String str) {
        str.getClass();
        c2287v.zzd |= 2;
        c2287v.zzf = str;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m13417Y(C2287v c2287v, long j) {
        c2287v.zzd |= 4;
        c2287v.zzg = j;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m13418Z(C2287v c2287v, long j) {
        c2287v.zzd |= 8;
        c2287v.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C2287v();
        }
        n6s0 n6s0Var = null;
        if (i2 == 4) {
            return new o6s0(n6s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final long m13419L() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: M */
    public final long m13420M() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: N */
    public final long m13421N() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: T */
    public final String m13422T() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: U */
    public final String m13423U() {
        return this.zze;
    }
}

package com.google.android.gms.internal.ads;

import p153l.ejx0;
import p153l.gkx0;
import p153l.mcs0;
import p153l.wds0;
import p153l.yds0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2184i0 extends AbstractC2245p5 implements gkx0 {
    private static final C2184i0 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private C2288v0 zzi;
    private C2168g0 zzk;
    private C2176h0 zzl;
    private C2216m0 zzm;
    private C2303x zzn;
    private C2240p0 zzo;
    private C2161f1 zzp;
    private C2127b0 zzq;
    private String zzf = "";
    private int zzh = 1000;
    private ejx0 zzj = AbstractC2245p5.m13224u();

    static {
        C2184i0 c2184i0 = new C2184i0();
        zzb = c2184i0;
        AbstractC2245p5.m13213C(C2184i0.class, c2184i0);
    }

    /* JADX INFO: renamed from: N */
    public static yds0 m12804N() {
        return (yds0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12806Q(C2184i0 c2184i0, String str) {
        str.getClass();
        c2184i0.zzd |= 2;
        c2184i0.zzf = str;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12807R(C2184i0 c2184i0, Iterable iterable) {
        ejx0 ejx0Var = c2184i0.zzj;
        if (!ejx0Var.zzc()) {
            c2184i0.zzj = AbstractC2245p5.m13225v(ejx0Var);
        }
        AbstractC2181h5.m12794f(iterable, c2184i0.zzj);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12809T(C2184i0 c2184i0, C2168g0 c2168g0) {
        c2168g0.getClass();
        c2184i0.zzk = c2168g0;
        c2184i0.zzd |= 32;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m12810U(C2184i0 c2184i0, C2303x c2303x) {
        c2303x.getClass();
        c2184i0.zzn = c2303x;
        c2184i0.zzd |= 256;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m12811V(C2184i0 c2184i0, C2240p0 c2240p0) {
        c2240p0.getClass();
        c2184i0.zzo = c2240p0;
        c2184i0.zzd |= 512;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m12812W(C2184i0 c2184i0, C2161f1 c2161f1) {
        c2161f1.getClass();
        c2184i0.zzp = c2161f1;
        c2184i0.zzd |= 1024;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m12813X(C2184i0 c2184i0, C2127b0 c2127b0) {
        c2127b0.getClass();
        c2184i0.zzq = c2127b0;
        c2184i0.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", wds0.f188633a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new C2184i0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new yds0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final C2303x m12814L() {
        C2303x c2303x = this.zzn;
        return c2303x == null ? C2303x.m13492M() : c2303x;
    }

    /* JADX INFO: renamed from: M */
    public final C2168g0 m12815M() {
        C2168g0 c2168g0 = this.zzk;
        return c2168g0 == null ? C2168g0.m12765M() : c2168g0;
    }

    /* JADX INFO: renamed from: P */
    public final String m12816P() {
        return this.zzf;
    }
}

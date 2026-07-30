package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.q4s0;
import p149l.s4s0;
import p149l.y9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2161i0 extends AbstractC2222p5 implements abx0 {
    private static final C2161i0 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private C2265v0 zzi;
    private C2145g0 zzk;
    private C2153h0 zzl;
    private C2193m0 zzm;
    private C2280x zzn;
    private C2217p0 zzo;
    private C2138f1 zzp;
    private C2104b0 zzq;
    private String zzf = "";
    private int zzh = 1000;
    private y9x0 zzj = AbstractC2222p5.m13170u();

    static {
        C2161i0 c2161i0 = new C2161i0();
        zzb = c2161i0;
        AbstractC2222p5.m13159C(C2161i0.class, c2161i0);
    }

    /* JADX INFO: renamed from: N */
    public static s4s0 m12750N() {
        return (s4s0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12752Q(C2161i0 c2161i0, String str) {
        str.getClass();
        c2161i0.zzd |= 2;
        c2161i0.zzf = str;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12753R(C2161i0 c2161i0, Iterable iterable) {
        y9x0 y9x0Var = c2161i0.zzj;
        if (!y9x0Var.zzc()) {
            c2161i0.zzj = AbstractC2222p5.m13171v(y9x0Var);
        }
        AbstractC2158h5.m12740f(iterable, c2161i0.zzj);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12755T(C2161i0 c2161i0, C2145g0 c2145g0) {
        c2145g0.getClass();
        c2161i0.zzk = c2145g0;
        c2161i0.zzd |= 32;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m12756U(C2161i0 c2161i0, C2280x c2280x) {
        c2280x.getClass();
        c2161i0.zzn = c2280x;
        c2161i0.zzd |= 256;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m12757V(C2161i0 c2161i0, C2217p0 c2217p0) {
        c2217p0.getClass();
        c2161i0.zzo = c2217p0;
        c2161i0.zzd |= 512;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m12758W(C2161i0 c2161i0, C2138f1 c2138f1) {
        c2138f1.getClass();
        c2161i0.zzp = c2138f1;
        c2161i0.zzd |= 1024;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m12759X(C2161i0 c2161i0, C2104b0 c2104b0) {
        c2104b0.getClass();
        c2161i0.zzq = c2104b0;
        c2161i0.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", q4s0.f152670a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new C2161i0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new s4s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final C2280x m12760L() {
        C2280x c2280x = this.zzn;
        return c2280x == null ? C2280x.m13438M() : c2280x;
    }

    /* JADX INFO: renamed from: M */
    public final C2145g0 m12761M() {
        C2145g0 c2145g0 = this.zzk;
        return c2145g0 == null ? C2145g0.m12711M() : c2145g0;
    }

    /* JADX INFO: renamed from: P */
    public final String m12762P() {
        return this.zzf;
    }
}

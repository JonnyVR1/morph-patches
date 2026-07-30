package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.brr0;
import p149l.nqr0;
import p149l.t8x0;
import p149l.ypr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C2184l extends AbstractC2222p5 implements abx0 {
    private static final C2184l zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        C2184l c2184l = new C2184l();
        zzb = c2184l;
        AbstractC2222p5.m13159C(C2184l.class, c2184l);
    }

    /* JADX INFO: renamed from: L */
    public static nqr0 m12840L() {
        return (nqr0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12842N(C2184l c2184l, long j) {
        c2184l.zzd |= 1;
        c2184l.zze = j;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12843O(C2184l c2184l, long j) {
        c2184l.zzd |= 2;
        c2184l.zzf = j;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m12844P(C2184l c2184l, long j) {
        c2184l.zzd |= 4;
        c2184l.zzg = j;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12845Q(C2184l c2184l, long j) {
        c2184l.zzd |= 8;
        c2184l.zzh = j;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12846R(C2184l c2184l) {
        c2184l.zzd &= -9;
        c2184l.zzh = -1L;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12847S(C2184l c2184l, long j) {
        c2184l.zzd |= 16;
        c2184l.zzi = j;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12848T(C2184l c2184l, long j) {
        c2184l.zzd |= 32;
        c2184l.zzj = j;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m12849U(C2184l c2184l, long j) {
        c2184l.zzd |= 128;
        c2184l.zzl = j;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m12850V(C2184l c2184l, long j) {
        c2184l.zzd |= 256;
        c2184l.zzm = j;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m12851W(C2184l c2184l, long j) {
        c2184l.zzd |= 512;
        c2184l.zzn = j;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m12852X(C2184l c2184l, long j) {
        c2184l.zzd |= 2048;
        c2184l.zzp = j;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m12853Y(C2184l c2184l, long j) {
        c2184l.zzd |= 4096;
        c2184l.zzq = j;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m12854Z(C2184l c2184l, long j) {
        c2184l.zzd |= 8192;
        c2184l.zzr = j;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m12855a0(C2184l c2184l, long j) {
        c2184l.zzd |= 16384;
        c2184l.zzs = j;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m12856b0(C2184l c2184l, long j) {
        c2184l.zzd |= 32768;
        c2184l.zzt = j;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m12857c0(C2184l c2184l, long j) {
        c2184l.zzd |= 65536;
        c2184l.zzu = j;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m12858d0(C2184l c2184l, long j) {
        c2184l.zzd |= 131072;
        c2184l.zzv = j;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m12859e0(C2184l c2184l, long j) {
        c2184l.zzd |= 262144;
        c2184l.zzw = j;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m12860f0(C2184l c2184l, int i) {
        c2184l.zzk = i - 1;
        c2184l.zzd |= 64;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m12861g0(C2184l c2184l, int i) {
        c2184l.zzo = i - 1;
        c2184l.zzd |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            t8x0 t8x0Var = brr0.f76937a;
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", t8x0Var, "zzl", "zzm", "zzn", "zzo", t8x0Var, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new C2184l();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new nqr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

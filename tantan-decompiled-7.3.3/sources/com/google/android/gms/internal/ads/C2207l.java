package com.google.android.gms.internal.ads;

import p153l.ezr0;
import p153l.gkx0;
import p153l.h0s0;
import p153l.tzr0;
import p153l.zhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C2207l extends AbstractC2245p5 implements gkx0 {
    private static final C2207l zzb;
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
        C2207l c2207l = new C2207l();
        zzb = c2207l;
        AbstractC2245p5.m13213C(C2207l.class, c2207l);
    }

    /* JADX INFO: renamed from: L */
    public static tzr0 m12894L() {
        return (tzr0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12896N(C2207l c2207l, long j) {
        c2207l.zzd |= 1;
        c2207l.zze = j;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12897O(C2207l c2207l, long j) {
        c2207l.zzd |= 2;
        c2207l.zzf = j;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m12898P(C2207l c2207l, long j) {
        c2207l.zzd |= 4;
        c2207l.zzg = j;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12899Q(C2207l c2207l, long j) {
        c2207l.zzd |= 8;
        c2207l.zzh = j;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12900R(C2207l c2207l) {
        c2207l.zzd &= -9;
        c2207l.zzh = -1L;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12901S(C2207l c2207l, long j) {
        c2207l.zzd |= 16;
        c2207l.zzi = j;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12902T(C2207l c2207l, long j) {
        c2207l.zzd |= 32;
        c2207l.zzj = j;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m12903U(C2207l c2207l, long j) {
        c2207l.zzd |= 128;
        c2207l.zzl = j;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m12904V(C2207l c2207l, long j) {
        c2207l.zzd |= 256;
        c2207l.zzm = j;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m12905W(C2207l c2207l, long j) {
        c2207l.zzd |= 512;
        c2207l.zzn = j;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m12906X(C2207l c2207l, long j) {
        c2207l.zzd |= 2048;
        c2207l.zzp = j;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m12907Y(C2207l c2207l, long j) {
        c2207l.zzd |= 4096;
        c2207l.zzq = j;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m12908Z(C2207l c2207l, long j) {
        c2207l.zzd |= 8192;
        c2207l.zzr = j;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m12909a0(C2207l c2207l, long j) {
        c2207l.zzd |= 16384;
        c2207l.zzs = j;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m12910b0(C2207l c2207l, long j) {
        c2207l.zzd |= 32768;
        c2207l.zzt = j;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m12911c0(C2207l c2207l, long j) {
        c2207l.zzd |= 65536;
        c2207l.zzu = j;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m12912d0(C2207l c2207l, long j) {
        c2207l.zzd |= 131072;
        c2207l.zzv = j;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m12913e0(C2207l c2207l, long j) {
        c2207l.zzd |= 262144;
        c2207l.zzw = j;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m12914f0(C2207l c2207l, int i) {
        c2207l.zzk = i - 1;
        c2207l.zzd |= 64;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m12915g0(C2207l c2207l, int i) {
        c2207l.zzo = i - 1;
        c2207l.zzd |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zhx0 zhx0Var = h0s0.f107329a;
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zhx0Var, "zzl", "zzm", "zzn", "zzo", zhx0Var, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new C2207l();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new tzr0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

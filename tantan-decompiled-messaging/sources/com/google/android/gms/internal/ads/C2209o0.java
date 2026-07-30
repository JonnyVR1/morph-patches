package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import p149l.abx0;
import p149l.e5s0;
import p149l.f5s0;
import p149l.g3s0;
import p149l.p5s0;
import p149l.q4s0;
import p149l.r4s0;
import p149l.t8x0;
import p149l.u8x0;
import p149l.w9x0;
import p149l.x9x0;
import p149l.z3s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2209o0 extends AbstractC2222p5 implements abx0 {
    private static final w9x0 zzb = new e5s0();
    private static final C2209o0 zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private u8x0 zzj = AbstractC2222p5.m13168s();
    private C2193m0 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        C2209o0 c2209o0 = new C2209o0();
        zzd = c2209o0;
        AbstractC2222p5.m13159C(C2209o0.class, c2209o0);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m13042L(C2209o0 c2209o0, int i) {
        c2209o0.zzm = i - 1;
        c2209o0.zze |= 64;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m13043M(C2209o0 c2209o0, int i) {
        c2209o0.zzn = i - 1;
        c2209o0.zze |= 128;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13044N(C2209o0 c2209o0, int i) {
        c2209o0.zzp = i - 1;
        c2209o0.zze |= 512;
    }

    /* JADX INFO: renamed from: T */
    public static f5s0 m13045T() {
        return (f5s0) zzd.m13186j();
    }

    /* JADX INFO: renamed from: V */
    public static C2209o0 m13047V(byte[] bArr) throws zzhag {
        return (C2209o0) AbstractC2222p5.m13164o(zzd, bArr);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m13048Y(C2209o0 c2209o0, long j) {
        c2209o0.zze |= 1;
        c2209o0.zzf = j;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m13049Z(C2209o0 c2209o0, long j) {
        c2209o0.zze |= 4;
        c2209o0.zzh = j;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m13050a0(C2209o0 c2209o0, long j) {
        c2209o0.zze |= 8;
        c2209o0.zzi = j;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m13051b0(C2209o0 c2209o0, Iterable iterable) {
        u8x0 u8x0Var = c2209o0.zzj;
        if (!u8x0Var.zzc()) {
            c2209o0.zzj = AbstractC2222p5.m13169t(u8x0Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c2209o0.zzj.zzh(((zzbcn) it.next()).zza());
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m13052c0(C2209o0 c2209o0, C2193m0 c2193m0) {
        c2193m0.getClass();
        c2209o0.zzk = c2193m0;
        c2209o0.zze |= 16;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m13053d0(C2209o0 c2209o0, int i) {
        c2209o0.zze |= 256;
        c2209o0.zzo = i;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m13054e0(C2209o0 c2209o0, zzbec zzbecVar) {
        c2209o0.zzq = zzbecVar.zza();
        c2209o0.zze |= 1024;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m13055f0(C2209o0 c2209o0, long j) {
        c2209o0.zze |= 2048;
        c2209o0.zzr = j;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m13056l0(C2209o0 c2209o0, int i) {
        c2209o0.zzg = i - 1;
        c2209o0.zze |= 2;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m13057m0(C2209o0 c2209o0, int i) {
        c2209o0.zzl = i - 1;
        c2209o0.zze |= 32;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            t8x0 t8x0Var = q4s0.f152670a;
            return AbstractC2222p5.m13175z(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", t8x0Var, "zzh", "zzi", "zzj", z3s0.f201403a, "zzk", "zzl", t8x0Var, "zzm", t8x0Var, "zzn", t8x0Var, "zzo", "zzp", t8x0Var, "zzq", p5s0.f147321a, "zzr"});
        }
        if (i2 == 3) {
            return new C2209o0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new f5s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }

    /* JADX INFO: renamed from: O */
    public final int m13058O() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: P */
    public final long m13059P() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: Q */
    public final long m13060Q() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: R */
    public final long m13061R() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: S */
    public final C2193m0 m13062S() {
        C2193m0 c2193m0 = this.zzk;
        return c2193m0 == null ? C2193m0.m12895N() : c2193m0;
    }

    /* JADX INFO: renamed from: W */
    public final zzbec m13063W() {
        zzbec zzbecVarZzb = zzbec.zzb(this.zzq);
        return zzbecVarZzb == null ? zzbec.UNSPECIFIED : zzbecVarZzb;
    }

    /* JADX INFO: renamed from: X */
    public final List m13064X() {
        return new x9x0(this.zzj, zzb);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m13065g0() {
        int iM177834a = r4s0.m177834a(this.zzm);
        if (iM177834a == 0) {
            return 1;
        }
        return iM177834a;
    }

    /* JADX INFO: renamed from: h0 */
    public final int m13066h0() {
        int iM177834a = r4s0.m177834a(this.zzn);
        if (iM177834a == 0) {
            return 1;
        }
        return iM177834a;
    }

    /* JADX INFO: renamed from: i0 */
    public final int m13067i0() {
        int iM177834a = r4s0.m177834a(this.zzp);
        if (iM177834a == 0) {
            return 1;
        }
        return iM177834a;
    }

    /* JADX INFO: renamed from: j0 */
    public final int m13068j0() {
        int iM177834a = r4s0.m177834a(this.zzg);
        if (iM177834a == 0) {
            return 1;
        }
        return iM177834a;
    }

    /* JADX INFO: renamed from: k0 */
    public final int m13069k0() {
        int iM177834a = r4s0.m177834a(this.zzl);
        if (iM177834a == 0) {
            return 1;
        }
        return iM177834a;
    }
}

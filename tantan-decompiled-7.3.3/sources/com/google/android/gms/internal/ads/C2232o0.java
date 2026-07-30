package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import p153l.aix0;
import p153l.cjx0;
import p153l.djx0;
import p153l.fds0;
import p153l.gkx0;
import p153l.kes0;
import p153l.les0;
import p153l.mcs0;
import p153l.ves0;
import p153l.wds0;
import p153l.xds0;
import p153l.zhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2232o0 extends AbstractC2245p5 implements gkx0 {
    private static final cjx0 zzb = new kes0();
    private static final C2232o0 zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private aix0 zzj = AbstractC2245p5.m13222s();
    private C2216m0 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        C2232o0 c2232o0 = new C2232o0();
        zzd = c2232o0;
        AbstractC2245p5.m13213C(C2232o0.class, c2232o0);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m13096L(C2232o0 c2232o0, int i) {
        c2232o0.zzm = i - 1;
        c2232o0.zze |= 64;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m13097M(C2232o0 c2232o0, int i) {
        c2232o0.zzn = i - 1;
        c2232o0.zze |= 128;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13098N(C2232o0 c2232o0, int i) {
        c2232o0.zzp = i - 1;
        c2232o0.zze |= 512;
    }

    /* JADX INFO: renamed from: T */
    public static les0 m13099T() {
        return (les0) zzd.m13240j();
    }

    /* JADX INFO: renamed from: V */
    public static C2232o0 m13101V(byte[] bArr) throws zzhag {
        return (C2232o0) AbstractC2245p5.m13218o(zzd, bArr);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m13102Y(C2232o0 c2232o0, long j) {
        c2232o0.zze |= 1;
        c2232o0.zzf = j;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m13103Z(C2232o0 c2232o0, long j) {
        c2232o0.zze |= 4;
        c2232o0.zzh = j;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m13104a0(C2232o0 c2232o0, long j) {
        c2232o0.zze |= 8;
        c2232o0.zzi = j;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m13105b0(C2232o0 c2232o0, Iterable iterable) {
        aix0 aix0Var = c2232o0.zzj;
        if (!aix0Var.zzc()) {
            c2232o0.zzj = AbstractC2245p5.m13223t(aix0Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c2232o0.zzj.zzh(((zzbcn) it.next()).zza());
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m13106c0(C2232o0 c2232o0, C2216m0 c2216m0) {
        c2216m0.getClass();
        c2232o0.zzk = c2216m0;
        c2232o0.zze |= 16;
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m13107d0(C2232o0 c2232o0, int i) {
        c2232o0.zze |= 256;
        c2232o0.zzo = i;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m13108e0(C2232o0 c2232o0, zzbec zzbecVar) {
        c2232o0.zzq = zzbecVar.zza();
        c2232o0.zze |= 1024;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m13109f0(C2232o0 c2232o0, long j) {
        c2232o0.zze |= 2048;
        c2232o0.zzr = j;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m13110l0(C2232o0 c2232o0, int i) {
        c2232o0.zzg = i - 1;
        c2232o0.zze |= 2;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m13111m0(C2232o0 c2232o0, int i) {
        c2232o0.zzl = i - 1;
        c2232o0.zze |= 32;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zhx0 zhx0Var = wds0.f188633a;
            return AbstractC2245p5.m13229z(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zhx0Var, "zzh", "zzi", "zzj", fds0.f98501a, "zzk", "zzl", zhx0Var, "zzm", zhx0Var, "zzn", zhx0Var, "zzo", "zzp", zhx0Var, "zzq", ves0.f183843a, "zzr"});
        }
        if (i2 == 3) {
            return new C2232o0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new les0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }

    /* JADX INFO: renamed from: O */
    public final int m13112O() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: P */
    public final long m13113P() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: Q */
    public final long m13114Q() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: R */
    public final long m13115R() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: S */
    public final C2216m0 m13116S() {
        C2216m0 c2216m0 = this.zzk;
        return c2216m0 == null ? C2216m0.m12949N() : c2216m0;
    }

    /* JADX INFO: renamed from: W */
    public final zzbec m13117W() {
        zzbec zzbecVarZzb = zzbec.zzb(this.zzq);
        return zzbecVarZzb == null ? zzbec.UNSPECIFIED : zzbecVarZzb;
    }

    /* JADX INFO: renamed from: X */
    public final List m13118X() {
        return new djx0(this.zzj, zzb);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m13119g0() {
        int iM210488a = xds0.m210488a(this.zzm);
        if (iM210488a == 0) {
            return 1;
        }
        return iM210488a;
    }

    /* JADX INFO: renamed from: h0 */
    public final int m13120h0() {
        int iM210488a = xds0.m210488a(this.zzn);
        if (iM210488a == 0) {
            return 1;
        }
        return iM210488a;
    }

    /* JADX INFO: renamed from: i0 */
    public final int m13121i0() {
        int iM210488a = xds0.m210488a(this.zzp);
        if (iM210488a == 0) {
            return 1;
        }
        return iM210488a;
    }

    /* JADX INFO: renamed from: j0 */
    public final int m13122j0() {
        int iM210488a = xds0.m210488a(this.zzg);
        if (iM210488a == 0) {
            return 1;
        }
        return iM210488a;
    }

    /* JADX INFO: renamed from: k0 */
    public final int m13123k0() {
        int iM210488a = xds0.m210488a(this.zzl);
        if (iM210488a == 0) {
            return 1;
        }
        return iM210488a;
    }
}

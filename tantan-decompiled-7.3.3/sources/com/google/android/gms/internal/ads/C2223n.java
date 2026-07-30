package com.google.android.gms.internal.ads;

import io.agora.rtc2.internal.AudioRoutingController;
import io.requery.android.database.sqlite.SQLiteDatabase;
import p153l.ezr0;
import p153l.fjx0;
import p153l.fzr0;
import p153l.g0s0;
import p153l.gkx0;
import p153l.gzr0;
import p153l.h0s0;
import p153l.i0s0;
import p153l.jhx0;
import p153l.jzr0;
import p153l.kzr0;
import p153l.pzr0;
import p153l.zhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C2223n extends AbstractC2245p5 implements gkx0 {
    private static final C2223n zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private C2231o zzM;
    private C2199k zzaC;
    private long zzaI;
    private C2175h zzaL;
    private C2183i zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private C2247q zzaW;
    private C2207l zzae;
    private C2215m zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private C2255r zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private fjx0 zzaf = AbstractC2245p5.m13226w();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private fjx0 zzaz = AbstractC2245p5.m13226w();
    private int zzaA = 1000;
    private fjx0 zzaB = AbstractC2245p5.m13226w();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        C2223n c2223n = new C2223n();
        zzb = c2223n;
        AbstractC2245p5.m13213C(C2223n.class, c2223n);
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m12985A0(C2223n c2223n, int i) {
        c2223n.zzad = i - 1;
        c2223n.zze |= 131072;
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m12986B0(C2223n c2223n, int i) {
        c2223n.zzaw = i - 1;
        c2223n.zzf |= 8;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m12987C0(C2223n c2223n, int i) {
        c2223n.zzax = i - 1;
        c2223n.zzf |= 16;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m12988D0(C2223n c2223n, int i) {
        c2223n.zzaP = i - 1;
        c2223n.zzf |= 1048576;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m12989E0(C2223n c2223n, int i) {
        c2223n.zzaS = 5;
        c2223n.zzf |= 8388608;
    }

    /* JADX INFO: renamed from: G0 */
    public static C2223n m12991G0() {
        return zzb;
    }

    /* JADX INFO: renamed from: H0 */
    public static C2223n m12992H0(byte[] bArr, jhx0 jhx0Var) throws zzhag {
        return (C2223n) AbstractC2245p5.m13221r(zzb, bArr, jhx0Var);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m12993L(C2223n c2223n, long j) {
        c2223n.zzd |= 134217728;
        c2223n.zzH = j;
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m12994L0(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zzd |= 1;
        c2223n.zzg = str;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m12995M(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zzd |= SQLiteDatabase.CREATE_IF_NECESSARY;
        c2223n.zzI = str;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m12996M0(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zzd |= 2;
        c2223n.zzh = str;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12997N(C2223n c2223n, long j) {
        c2223n.zzd |= 536870912;
        c2223n.zzJ = j;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m12998N0(C2223n c2223n, long j) {
        c2223n.zzd |= 4;
        c2223n.zzi = j;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12999O(C2223n c2223n, long j) {
        c2223n.zzd |= 1073741824;
        c2223n.zzK = j;
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ void m13000O0(C2223n c2223n, long j) {
        c2223n.zzd |= 16;
        c2223n.zzk = j;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13001P(C2223n c2223n, long j) {
        c2223n.zzd |= Integer.MIN_VALUE;
        c2223n.zzL = j;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m13002P0(C2223n c2223n, long j) {
        c2223n.zzd |= 32;
        c2223n.zzl = j;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m13003Q(C2223n c2223n, long j) {
        c2223n.zze |= 2;
        c2223n.zzN = j;
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m13004Q0(C2223n c2223n, long j) {
        c2223n.zzd |= 1024;
        c2223n.zzq = j;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m13005R(C2223n c2223n, long j) {
        c2223n.zze |= 4;
        c2223n.zzO = j;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m13006R0(C2223n c2223n, long j) {
        c2223n.zzd |= 2048;
        c2223n.zzr = j;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13007S(C2223n c2223n, long j) {
        c2223n.zze |= 8;
        c2223n.zzP = j;
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m13008S0(C2223n c2223n, long j) {
        c2223n.zzd |= 8192;
        c2223n.zzt = j;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13009T(C2223n c2223n, long j) {
        c2223n.zze |= 16;
        c2223n.zzQ = j;
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m13010T0(C2223n c2223n, long j) {
        c2223n.zzd |= 16384;
        c2223n.zzu = j;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m13011U(C2223n c2223n, long j) {
        c2223n.zze |= 32;
        c2223n.zzR = j;
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m13012U0(C2223n c2223n, long j) {
        c2223n.zzd |= 32768;
        c2223n.zzv = j;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m13013V(C2223n c2223n, long j) {
        c2223n.zze |= 64;
        c2223n.zzS = j;
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m13014V0(C2223n c2223n, long j) {
        c2223n.zzd |= 65536;
        c2223n.zzw = j;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m13015W(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zze |= 128;
        c2223n.zzT = str;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m13016W0(C2223n c2223n, long j) {
        c2223n.zzd |= 524288;
        c2223n.zzz = j;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m13017X(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zze |= 256;
        c2223n.zzU = str;
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m13018X0(C2223n c2223n, long j) {
        c2223n.zzd |= 1048576;
        c2223n.zzA = j;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m13019Y(C2223n c2223n, long j) {
        c2223n.zze |= 4096;
        c2223n.zzY = j;
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m13020Y0(C2223n c2223n, long j) {
        c2223n.zzd |= 2097152;
        c2223n.zzB = j;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m13021Z(C2223n c2223n, long j) {
        c2223n.zze |= 8192;
        c2223n.zzZ = j;
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ void m13022Z0(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zzd |= 4194304;
        c2223n.zzC = str;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m13023a0(C2223n c2223n, long j) {
        c2223n.zze |= 16384;
        c2223n.zzaa = j;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m13024a1(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zzd |= 16777216;
        c2223n.zzE = str;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m13025b0(C2223n c2223n, C2207l c2207l) {
        c2207l.getClass();
        c2223n.zzae = c2207l;
        c2223n.zze |= 262144;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m13026b1(C2223n c2223n, long j) {
        c2223n.zzd |= 33554432;
        c2223n.zzF = j;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m13027c0(C2223n c2223n, C2207l c2207l) {
        c2207l.getClass();
        fjx0 fjx0Var = c2223n.zzaf;
        if (!fjx0Var.zzc()) {
            c2223n.zzaf = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2223n.zzaf.add(c2207l);
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m13028c1(C2223n c2223n, long j) {
        c2223n.zzd |= AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        c2223n.zzG = j;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m13030e0(C2223n c2223n, C2215m c2215m) {
        c2215m.getClass();
        c2223n.zzag = c2215m;
        c2223n.zze |= 524288;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m13031f0(C2223n c2223n, long j) {
        c2223n.zze |= 2097152;
        c2223n.zzai = j;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m13032g0(C2223n c2223n, long j) {
        c2223n.zze |= 4194304;
        c2223n.zzaj = j;
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m13033h0(C2223n c2223n, long j) {
        c2223n.zze |= 8388608;
        c2223n.zzak = j;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m13034i0(C2223n c2223n, long j) {
        c2223n.zze |= AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        c2223n.zzan = j;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m13035j0(C2223n c2223n, long j) {
        c2223n.zze |= 134217728;
        c2223n.zzao = j;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m13036k0(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zze |= SQLiteDatabase.CREATE_IF_NECESSARY;
        c2223n.zzap = str;
    }

    /* JADX INFO: renamed from: l0 */
    public static fzr0 m13037l0() {
        return (fzr0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m13038m0(C2223n c2223n, long j) {
        c2223n.zzf |= 512;
        c2223n.zzaE = j;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m13039n0(C2223n c2223n, long j) {
        c2223n.zzf |= 1024;
        c2223n.zzaF = j;
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m13040o0(C2223n c2223n, long j) {
        c2223n.zzf |= 2048;
        c2223n.zzaG = j;
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m13041p0(C2223n c2223n, long j) {
        c2223n.zzf |= 4096;
        c2223n.zzaH = j;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m13042q0(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zzf |= 32768;
        c2223n.zzaK = str;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m13043r0(C2223n c2223n, String str) {
        str.getClass();
        c2223n.zzf |= 4194304;
        c2223n.zzaR = str;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m13044s0(C2223n c2223n, boolean z) {
        c2223n.zzf |= 16777216;
        c2223n.zzaT = z;
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m13045t0(C2223n c2223n, long j) {
        c2223n.zzf |= AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        c2223n.zzaV = j;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m13046y0(C2223n c2223n, int i) {
        c2223n.zzW = i - 1;
        c2223n.zze |= 1024;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m13047z0(C2223n c2223n, int i) {
        c2223n.zzX = i - 1;
        c2223n.zze |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zhx0 zhx0Var = jzr0.f123312a;
            zhx0 zhx0Var2 = h0s0.f107329a;
            return AbstractC2245p5.m13229z(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", zhx0Var, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", C2207l.class, "zzR", "zzS", "zzT", "zzU", "zzW", zhx0Var2, "zzX", zhx0Var2, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", zhx0Var2, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", g0s0.f101678a, "zzas", i0s0.f112449a, "zzap", "zzat", gzr0.f107229a, "zzau", "zzav", "zzal", "zzam", "zzaw", zhx0Var2, "zzV", "zzD", "zzax", zhx0Var2, "zzay", "zzaz", C2191j.class, "zzaA", zhx0Var2, "zzaB", C2167g.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", pzr0.f154962a, "zzaW", "zzaX", "zzaY"});
        }
        if (i2 == 3) {
            return new C2223n();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new fzr0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: I0 */
    public final C2247q m13048I0() {
        C2247q c2247q = this.zzaW;
        return c2247q == null ? C2247q.m13245N() : c2247q;
    }

    /* JADX INFO: renamed from: J0 */
    public final String m13049J0() {
        return this.zzaR;
    }

    /* JADX INFO: renamed from: K0 */
    public final String m13050K0() {
        return this.zzC;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m13051u0() {
        return this.zzaT;
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m13052v0() {
        return (this.zzd & 4194304) != 0;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m13053w0() {
        return (this.zzf & 134217728) != 0;
    }

    /* JADX INFO: renamed from: x0 */
    public final int m13054x0() {
        int iM152224a = kzr0.m152224a(this.zzaS);
        if (iM152224a == 0) {
            return 3;
        }
        return iM152224a;
    }
}

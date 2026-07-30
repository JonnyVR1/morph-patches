package com.google.android.gms.internal.ads;

import io.agora.rtc2.internal.AudioRoutingController;
import p149l.abx0;
import p149l.aqr0;
import p149l.arr0;
import p149l.brr0;
import p149l.crr0;
import p149l.d8x0;
import p149l.dqr0;
import p149l.eqr0;
import p149l.jqr0;
import p149l.t8x0;
import p149l.ypr0;
import p149l.z9x0;
import p149l.zpr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C2200n extends AbstractC2222p5 implements abx0 {
    private static final C2200n zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private C2208o zzM;
    private C2176k zzaC;
    private long zzaI;
    private C2152h zzaL;
    private C2160i zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private C2224q zzaW;
    private C2184l zzae;
    private C2192m zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private C2232r zzau;
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
    private z9x0 zzaf = AbstractC2222p5.m13172w();
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
    private z9x0 zzaz = AbstractC2222p5.m13172w();
    private int zzaA = 1000;
    private z9x0 zzaB = AbstractC2222p5.m13172w();
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
        C2200n c2200n = new C2200n();
        zzb = c2200n;
        AbstractC2222p5.m13159C(C2200n.class, c2200n);
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m12931A0(C2200n c2200n, int i) {
        c2200n.zzad = i - 1;
        c2200n.zze |= 131072;
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m12932B0(C2200n c2200n, int i) {
        c2200n.zzaw = i - 1;
        c2200n.zzf |= 8;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m12933C0(C2200n c2200n, int i) {
        c2200n.zzax = i - 1;
        c2200n.zzf |= 16;
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m12934D0(C2200n c2200n, int i) {
        c2200n.zzaP = i - 1;
        c2200n.zzf |= 1048576;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m12935E0(C2200n c2200n, int i) {
        c2200n.zzaS = 5;
        c2200n.zzf |= 8388608;
    }

    /* JADX INFO: renamed from: G0 */
    public static C2200n m12937G0() {
        return zzb;
    }

    /* JADX INFO: renamed from: H0 */
    public static C2200n m12938H0(byte[] bArr, d8x0 d8x0Var) throws zzhag {
        return (C2200n) AbstractC2222p5.m13167r(zzb, bArr, d8x0Var);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m12939L(C2200n c2200n, long j) {
        c2200n.zzd |= 134217728;
        c2200n.zzH = j;
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m12940L0(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zzd |= 1;
        c2200n.zzg = str;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m12941M(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zzd |= 268435456;
        c2200n.zzI = str;
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m12942M0(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zzd |= 2;
        c2200n.zzh = str;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12943N(C2200n c2200n, long j) {
        c2200n.zzd |= 536870912;
        c2200n.zzJ = j;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m12944N0(C2200n c2200n, long j) {
        c2200n.zzd |= 4;
        c2200n.zzi = j;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12945O(C2200n c2200n, long j) {
        c2200n.zzd |= 1073741824;
        c2200n.zzK = j;
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ void m12946O0(C2200n c2200n, long j) {
        c2200n.zzd |= 16;
        c2200n.zzk = j;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m12947P(C2200n c2200n, long j) {
        c2200n.zzd |= Integer.MIN_VALUE;
        c2200n.zzL = j;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m12948P0(C2200n c2200n, long j) {
        c2200n.zzd |= 32;
        c2200n.zzl = j;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12949Q(C2200n c2200n, long j) {
        c2200n.zze |= 2;
        c2200n.zzN = j;
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m12950Q0(C2200n c2200n, long j) {
        c2200n.zzd |= 1024;
        c2200n.zzq = j;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12951R(C2200n c2200n, long j) {
        c2200n.zze |= 4;
        c2200n.zzO = j;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m12952R0(C2200n c2200n, long j) {
        c2200n.zzd |= 2048;
        c2200n.zzr = j;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12953S(C2200n c2200n, long j) {
        c2200n.zze |= 8;
        c2200n.zzP = j;
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m12954S0(C2200n c2200n, long j) {
        c2200n.zzd |= 8192;
        c2200n.zzt = j;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12955T(C2200n c2200n, long j) {
        c2200n.zze |= 16;
        c2200n.zzQ = j;
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m12956T0(C2200n c2200n, long j) {
        c2200n.zzd |= 16384;
        c2200n.zzu = j;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m12957U(C2200n c2200n, long j) {
        c2200n.zze |= 32;
        c2200n.zzR = j;
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m12958U0(C2200n c2200n, long j) {
        c2200n.zzd |= 32768;
        c2200n.zzv = j;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m12959V(C2200n c2200n, long j) {
        c2200n.zze |= 64;
        c2200n.zzS = j;
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m12960V0(C2200n c2200n, long j) {
        c2200n.zzd |= 65536;
        c2200n.zzw = j;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m12961W(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zze |= 128;
        c2200n.zzT = str;
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m12962W0(C2200n c2200n, long j) {
        c2200n.zzd |= 524288;
        c2200n.zzz = j;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m12963X(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zze |= 256;
        c2200n.zzU = str;
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m12964X0(C2200n c2200n, long j) {
        c2200n.zzd |= 1048576;
        c2200n.zzA = j;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m12965Y(C2200n c2200n, long j) {
        c2200n.zze |= 4096;
        c2200n.zzY = j;
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m12966Y0(C2200n c2200n, long j) {
        c2200n.zzd |= 2097152;
        c2200n.zzB = j;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m12967Z(C2200n c2200n, long j) {
        c2200n.zze |= 8192;
        c2200n.zzZ = j;
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ void m12968Z0(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zzd |= 4194304;
        c2200n.zzC = str;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m12969a0(C2200n c2200n, long j) {
        c2200n.zze |= 16384;
        c2200n.zzaa = j;
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m12970a1(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zzd |= 16777216;
        c2200n.zzE = str;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m12971b0(C2200n c2200n, C2184l c2184l) {
        c2184l.getClass();
        c2200n.zzae = c2184l;
        c2200n.zze |= 262144;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m12972b1(C2200n c2200n, long j) {
        c2200n.zzd |= 33554432;
        c2200n.zzF = j;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m12973c0(C2200n c2200n, C2184l c2184l) {
        c2184l.getClass();
        z9x0 z9x0Var = c2200n.zzaf;
        if (!z9x0Var.zzc()) {
            c2200n.zzaf = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2200n.zzaf.add(c2184l);
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m12974c1(C2200n c2200n, long j) {
        c2200n.zzd |= AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        c2200n.zzG = j;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m12976e0(C2200n c2200n, C2192m c2192m) {
        c2192m.getClass();
        c2200n.zzag = c2192m;
        c2200n.zze |= 524288;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m12977f0(C2200n c2200n, long j) {
        c2200n.zze |= 2097152;
        c2200n.zzai = j;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m12978g0(C2200n c2200n, long j) {
        c2200n.zze |= 4194304;
        c2200n.zzaj = j;
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m12979h0(C2200n c2200n, long j) {
        c2200n.zze |= 8388608;
        c2200n.zzak = j;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m12980i0(C2200n c2200n, long j) {
        c2200n.zze |= AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        c2200n.zzan = j;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m12981j0(C2200n c2200n, long j) {
        c2200n.zze |= 134217728;
        c2200n.zzao = j;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m12982k0(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zze |= 268435456;
        c2200n.zzap = str;
    }

    /* JADX INFO: renamed from: l0 */
    public static zpr0 m12983l0() {
        return (zpr0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m12984m0(C2200n c2200n, long j) {
        c2200n.zzf |= 512;
        c2200n.zzaE = j;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m12985n0(C2200n c2200n, long j) {
        c2200n.zzf |= 1024;
        c2200n.zzaF = j;
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m12986o0(C2200n c2200n, long j) {
        c2200n.zzf |= 2048;
        c2200n.zzaG = j;
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m12987p0(C2200n c2200n, long j) {
        c2200n.zzf |= 4096;
        c2200n.zzaH = j;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m12988q0(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zzf |= 32768;
        c2200n.zzaK = str;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m12989r0(C2200n c2200n, String str) {
        str.getClass();
        c2200n.zzf |= 4194304;
        c2200n.zzaR = str;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m12990s0(C2200n c2200n, boolean z) {
        c2200n.zzf |= 16777216;
        c2200n.zzaT = z;
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m12991t0(C2200n c2200n, long j) {
        c2200n.zzf |= AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        c2200n.zzaV = j;
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m12992y0(C2200n c2200n, int i) {
        c2200n.zzW = i - 1;
        c2200n.zze |= 1024;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m12993z0(C2200n c2200n, int i) {
        c2200n.zzX = i - 1;
        c2200n.zze |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            t8x0 t8x0Var = dqr0.f87497a;
            t8x0 t8x0Var2 = brr0.f76937a;
            return AbstractC2222p5.m13175z(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", t8x0Var, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", C2184l.class, "zzR", "zzS", "zzT", "zzU", "zzW", t8x0Var2, "zzX", t8x0Var2, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", t8x0Var2, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", arr0.f71338a, "zzas", crr0.f82303a, "zzap", "zzat", aqr0.f71201a, "zzau", "zzav", "zzal", "zzam", "zzaw", t8x0Var2, "zzV", "zzD", "zzax", t8x0Var2, "zzay", "zzaz", C2168j.class, "zzaA", t8x0Var2, "zzaB", C2144g.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", jqr0.f119322a, "zzaW", "zzaX", "zzaY"});
        }
        if (i2 == 3) {
            return new C2200n();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new zpr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: I0 */
    public final C2224q m12994I0() {
        C2224q c2224q = this.zzaW;
        return c2224q == null ? C2224q.m13191N() : c2224q;
    }

    /* JADX INFO: renamed from: J0 */
    public final String m12995J0() {
        return this.zzaR;
    }

    /* JADX INFO: renamed from: K0 */
    public final String m12996K0() {
        return this.zzC;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m12997u0() {
        return this.zzaT;
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m12998v0() {
        return (this.zzd & 4194304) != 0;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m12999w0() {
        return (this.zzf & 134217728) != 0;
    }

    /* JADX INFO: renamed from: x0 */
    public final int m13000x0() {
        int iM117772a = eqr0.m117772a(this.zzaS);
        if (iM117772a == 0) {
            return 3;
        }
        return iM117772a;
    }
}

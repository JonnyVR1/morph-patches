package com.google.android.gms.internal.ads;

import java.util.List;
import p149l.abx0;
import p149l.cfx0;
import p149l.gdx0;
import p149l.udx0;
import p149l.vdx0;
import p149l.vex0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2271v6 extends AbstractC2222p5 implements abx0 {
    private static final C2271v6 zzb;
    private C2143f6 zzB;
    private C2119c6 zzD;
    private C2207n6 zzF;
    private int zzG;
    private long zzJ;
    private C2263u6 zzK;
    private int zzd;
    private int zze;
    private int zzf;
    private C2127d6 zzj;
    private C2231q6 zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private C2247s6 zzu;
    private boolean zzv;
    private C2255t6 zzz;
    private byte zzL = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private z9x0 zzk = AbstractC2222p5.m13172w();
    private z9x0 zzl = AbstractC2222p5.m13172w();
    private String zzm = "";
    private z9x0 zzp = AbstractC2222p5.m13172w();
    private String zzq = "";
    private zzgyl zzt = zzgyl.zzb;
    private String zzw = "";
    private z9x0 zzx = AbstractC2222p5.m13172w();
    private z9x0 zzy = AbstractC2222p5.m13172w();
    private z9x0 zzA = AbstractC2222p5.m13172w();
    private String zzC = "";
    private z9x0 zzE = AbstractC2222p5.m13172w();
    private z9x0 zzH = AbstractC2222p5.m13172w();
    private z9x0 zzI = AbstractC2222p5.m13172w();

    static {
        C2271v6 c2271v6 = new C2271v6();
        zzb = c2271v6;
        AbstractC2222p5.m13159C(C2271v6.class, c2271v6);
    }

    /* JADX INFO: renamed from: L */
    public static vdx0 m13384L() {
        return (vdx0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m13386Q(C2271v6 c2271v6, String str) {
        str.getClass();
        c2271v6.zzd |= 4;
        c2271v6.zzg = str;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m13387R(C2271v6 c2271v6, String str) {
        str.getClass();
        c2271v6.zzd |= 8;
        c2271v6.zzh = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13388S(C2271v6 c2271v6, C2127d6 c2127d6) {
        c2127d6.getClass();
        c2271v6.zzj = c2127d6;
        c2271v6.zzd |= 32;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13389T(C2271v6 c2271v6, C2239r6 c2239r6) {
        c2239r6.getClass();
        z9x0 z9x0Var = c2271v6.zzk;
        if (!z9x0Var.zzc()) {
            c2271v6.zzk = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2271v6.zzk.add(c2239r6);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m13390U(C2271v6 c2271v6, String str) {
        c2271v6.zzd |= 64;
        c2271v6.zzm = str;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m13391V(C2271v6 c2271v6) {
        c2271v6.zzd &= -65;
        c2271v6.zzm = zzb.zzm;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m13392W(C2271v6 c2271v6, C2231q6 c2231q6) {
        c2231q6.getClass();
        c2271v6.zzn = c2231q6;
        c2271v6.zzd |= 128;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m13393X(C2271v6 c2271v6, C2247s6 c2247s6) {
        c2247s6.getClass();
        c2271v6.zzu = c2247s6;
        c2271v6.zzd |= 8192;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m13394Y(C2271v6 c2271v6, Iterable iterable) {
        z9x0 z9x0Var = c2271v6.zzx;
        if (!z9x0Var.zzc()) {
            c2271v6.zzx = AbstractC2222p5.m13173x(z9x0Var);
        }
        AbstractC2158h5.m12740f(iterable, c2271v6.zzx);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m13395Z(C2271v6 c2271v6, Iterable iterable) {
        z9x0 z9x0Var = c2271v6.zzy;
        if (!z9x0Var.zzc()) {
            c2271v6.zzy = AbstractC2222p5.m13173x(z9x0Var);
        }
        AbstractC2158h5.m12740f(iterable, c2271v6.zzy);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m13396a0(C2271v6 c2271v6, int i) {
        c2271v6.zze = i - 1;
        c2271v6.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzL);
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001!\u0000\u0001\u0001!!\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", C2239r6.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", vex0.f181233a, "zzf", udx0.f175975a, "zzj", "zzm", "zzn", "zzt", "zzl", C2287x6.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", C2303z6.class, "zzB", "zzC", "zzD", "zzE", C2151g6.class, "zzF", "zzG", cfx0.f80682a, "zzH", C2215o6.class, "zzI", C2223p6.class, "zzJ", "zzK"});
        }
        if (i2 == 3) {
            return new C2271v6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new vdx0(gdx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzL = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final String m13397N() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: O */
    public final String m13398O() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: P */
    public final List m13399P() {
        return this.zzk;
    }
}

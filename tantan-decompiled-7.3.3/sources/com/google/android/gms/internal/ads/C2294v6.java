package com.google.android.gms.internal.ads;

import java.util.List;
import p153l.anx0;
import p153l.bnx0;
import p153l.box0;
import p153l.fjx0;
import p153l.gkx0;
import p153l.iox0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2294v6 extends AbstractC2245p5 implements gkx0 {
    private static final C2294v6 zzb;
    private C2166f6 zzB;
    private C2142c6 zzD;
    private C2230n6 zzF;
    private int zzG;
    private long zzJ;
    private C2286u6 zzK;
    private int zzd;
    private int zze;
    private int zzf;
    private C2150d6 zzj;
    private C2254q6 zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private C2270s6 zzu;
    private boolean zzv;
    private C2278t6 zzz;
    private byte zzL = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private fjx0 zzk = AbstractC2245p5.m13226w();
    private fjx0 zzl = AbstractC2245p5.m13226w();
    private String zzm = "";
    private fjx0 zzp = AbstractC2245p5.m13226w();
    private String zzq = "";
    private zzgyl zzt = zzgyl.zzb;
    private String zzw = "";
    private fjx0 zzx = AbstractC2245p5.m13226w();
    private fjx0 zzy = AbstractC2245p5.m13226w();
    private fjx0 zzA = AbstractC2245p5.m13226w();
    private String zzC = "";
    private fjx0 zzE = AbstractC2245p5.m13226w();
    private fjx0 zzH = AbstractC2245p5.m13226w();
    private fjx0 zzI = AbstractC2245p5.m13226w();

    static {
        C2294v6 c2294v6 = new C2294v6();
        zzb = c2294v6;
        AbstractC2245p5.m13213C(C2294v6.class, c2294v6);
    }

    /* JADX INFO: renamed from: L */
    public static bnx0 m13438L() {
        return (bnx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m13440Q(C2294v6 c2294v6, String str) {
        str.getClass();
        c2294v6.zzd |= 4;
        c2294v6.zzg = str;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m13441R(C2294v6 c2294v6, String str) {
        str.getClass();
        c2294v6.zzd |= 8;
        c2294v6.zzh = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13442S(C2294v6 c2294v6, C2150d6 c2150d6) {
        c2150d6.getClass();
        c2294v6.zzj = c2150d6;
        c2294v6.zzd |= 32;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13443T(C2294v6 c2294v6, C2262r6 c2262r6) {
        c2262r6.getClass();
        fjx0 fjx0Var = c2294v6.zzk;
        if (!fjx0Var.zzc()) {
            c2294v6.zzk = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2294v6.zzk.add(c2262r6);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m13444U(C2294v6 c2294v6, String str) {
        c2294v6.zzd |= 64;
        c2294v6.zzm = str;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m13445V(C2294v6 c2294v6) {
        c2294v6.zzd &= -65;
        c2294v6.zzm = zzb.zzm;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m13446W(C2294v6 c2294v6, C2254q6 c2254q6) {
        c2254q6.getClass();
        c2294v6.zzn = c2254q6;
        c2294v6.zzd |= 128;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m13447X(C2294v6 c2294v6, C2270s6 c2270s6) {
        c2270s6.getClass();
        c2294v6.zzu = c2270s6;
        c2294v6.zzd |= 8192;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m13448Y(C2294v6 c2294v6, Iterable iterable) {
        fjx0 fjx0Var = c2294v6.zzx;
        if (!fjx0Var.zzc()) {
            c2294v6.zzx = AbstractC2245p5.m13227x(fjx0Var);
        }
        AbstractC2181h5.m12794f(iterable, c2294v6.zzx);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m13449Z(C2294v6 c2294v6, Iterable iterable) {
        fjx0 fjx0Var = c2294v6.zzy;
        if (!fjx0Var.zzc()) {
            c2294v6.zzy = AbstractC2245p5.m13227x(fjx0Var);
        }
        AbstractC2181h5.m12794f(iterable, c2294v6.zzy);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m13450a0(C2294v6 c2294v6, int i) {
        c2294v6.zze = i - 1;
        c2294v6.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzL);
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001!\u0000\u0001\u0001!!\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", C2262r6.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", box0.f77705a, "zzf", anx0.f72397a, "zzj", "zzm", "zzn", "zzt", "zzl", C2310x6.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", C2326z6.class, "zzB", "zzC", "zzD", "zzE", C2174g6.class, "zzF", "zzG", iox0.f116228a, "zzH", C2238o6.class, "zzI", C2246p6.class, "zzJ", "zzK"});
        }
        if (i2 == 3) {
            return new C2294v6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new bnx0(mmx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzL = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final String m13451N() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: O */
    public final String m13452O() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: P */
    public final List m13453P() {
        return this.zzk;
    }
}

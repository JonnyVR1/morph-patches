package com.google.android.gms.internal.ads;

import p153l.aix0;
import p153l.dox0;
import p153l.fjx0;
import p153l.fox0;
import p153l.gkx0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2262r6 extends AbstractC2245p5 implements gkx0 {
    private static final C2262r6 zzb;
    private int zzd;
    private int zze;
    private C2198j6 zzg;
    private C2214l6 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private aix0 zzj = AbstractC2245p5.m13222s();
    private String zzk = "";
    private fjx0 zzm = AbstractC2245p5.m13226w();

    static {
        C2262r6 c2262r6 = new C2262r6();
        zzb = c2262r6;
        AbstractC2245p5.m13213C(C2262r6.class, c2262r6);
    }

    /* JADX INFO: renamed from: M */
    public static fox0 m13291M() {
        return (fox0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13293P(C2262r6 c2262r6, int i) {
        c2262r6.zzd |= 1;
        c2262r6.zze = i;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m13294Q(C2262r6 c2262r6, String str) {
        str.getClass();
        c2262r6.zzd |= 2;
        c2262r6.zzf = str;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m13295R(C2262r6 c2262r6, C2198j6 c2198j6) {
        c2198j6.getClass();
        c2262r6.zzg = c2198j6;
        c2262r6.zzd |= 4;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13296S(C2262r6 c2262r6, String str) {
        str.getClass();
        fjx0 fjx0Var = c2262r6.zzm;
        if (!fjx0Var.zzc()) {
            c2262r6.zzm = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2262r6.zzm.add(str);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13297T(C2262r6 c2262r6, int i) {
        c2262r6.zzl = i - 1;
        c2262r6.zzd |= 64;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", dox0.f90015a, "zzm"});
        }
        if (i2 == 3) {
            return new C2262r6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new fox0(mmx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final int m13298L() {
        return this.zzm.size();
    }

    /* JADX INFO: renamed from: O */
    public final String m13299O() {
        return this.zzf;
    }
}

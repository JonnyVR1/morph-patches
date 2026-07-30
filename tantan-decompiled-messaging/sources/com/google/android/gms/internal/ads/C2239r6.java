package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.u8x0;
import p149l.xex0;
import p149l.z9x0;
import p149l.zex0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2239r6 extends AbstractC2222p5 implements abx0 {
    private static final C2239r6 zzb;
    private int zzd;
    private int zze;
    private C2175j6 zzg;
    private C2191l6 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private u8x0 zzj = AbstractC2222p5.m13168s();
    private String zzk = "";
    private z9x0 zzm = AbstractC2222p5.m13172w();

    static {
        C2239r6 c2239r6 = new C2239r6();
        zzb = c2239r6;
        AbstractC2222p5.m13159C(C2239r6.class, c2239r6);
    }

    /* JADX INFO: renamed from: M */
    public static zex0 m13237M() {
        return (zex0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13239P(C2239r6 c2239r6, int i) {
        c2239r6.zzd |= 1;
        c2239r6.zze = i;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m13240Q(C2239r6 c2239r6, String str) {
        str.getClass();
        c2239r6.zzd |= 2;
        c2239r6.zzf = str;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m13241R(C2239r6 c2239r6, C2175j6 c2175j6) {
        c2175j6.getClass();
        c2239r6.zzg = c2175j6;
        c2239r6.zzd |= 4;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13242S(C2239r6 c2239r6, String str) {
        str.getClass();
        z9x0 z9x0Var = c2239r6.zzm;
        if (!z9x0Var.zzc()) {
            c2239r6.zzm = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2239r6.zzm.add(str);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13243T(C2239r6 c2239r6, int i) {
        c2239r6.zzl = i - 1;
        c2239r6.zzd |= 64;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", xex0.f192639a, "zzm"});
        }
        if (i2 == 3) {
            return new C2239r6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new zex0(gdx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* JADX INFO: renamed from: L */
    public final int m13244L() {
        return this.zzm.size();
    }

    /* JADX INFO: renamed from: O */
    public final String m13245O() {
        return this.zzf;
    }
}

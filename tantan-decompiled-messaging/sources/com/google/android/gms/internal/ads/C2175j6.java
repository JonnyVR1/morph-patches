package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.dex0;
import p149l.gdx0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2175j6 extends AbstractC2222p5 implements abx0 {
    private static final C2175j6 zzb;
    private int zzd;
    private C2167i6 zze;
    private zzgyl zzg;
    private zzgyl zzh;
    private int zzi;
    private byte zzj = 2;
    private z9x0 zzf = AbstractC2222p5.m13172w();

    static {
        C2175j6 c2175j6 = new C2175j6();
        zzb = c2175j6;
        AbstractC2222p5.m13159C(C2175j6.class, c2175j6);
    }

    public C2175j6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    /* JADX INFO: renamed from: L */
    public static dex0 m12813L() {
        return (dex0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12815N(C2175j6 c2175j6, C2159h6 c2159h6) {
        c2159h6.getClass();
        z9x0 z9x0Var = c2175j6.zzf;
        if (!z9x0Var.zzc()) {
            c2175j6.zzf = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2175j6.zzf.add(c2159h6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", C2159h6.class, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C2175j6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new dex0(gdx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

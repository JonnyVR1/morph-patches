package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.jnx0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2198j6 extends AbstractC2245p5 implements gkx0 {
    private static final C2198j6 zzb;
    private int zzd;
    private C2190i6 zze;
    private zzgyl zzg;
    private zzgyl zzh;
    private int zzi;
    private byte zzj = 2;
    private fjx0 zzf = AbstractC2245p5.m13226w();

    static {
        C2198j6 c2198j6 = new C2198j6();
        zzb = c2198j6;
        AbstractC2245p5.m13213C(C2198j6.class, c2198j6);
    }

    public C2198j6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    /* JADX INFO: renamed from: L */
    public static jnx0 m12867L() {
        return (jnx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12869N(C2198j6 c2198j6, C2182h6 c2182h6) {
        c2182h6.getClass();
        fjx0 fjx0Var = c2198j6.zzf;
        if (!fjx0Var.zzc()) {
            c2198j6.zzf = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2198j6.zzf.add(c2182h6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", C2182h6.class, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C2198j6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new jnx0(mmx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

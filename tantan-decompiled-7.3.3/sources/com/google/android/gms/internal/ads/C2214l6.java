package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.lnx0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2214l6 extends AbstractC2245p5 implements gkx0 {
    private static final C2214l6 zzb;
    private int zzd;
    private C2206k6 zze;
    private zzgyl zzg;
    private zzgyl zzh;
    private int zzi;
    private zzgyl zzj;
    private byte zzk = 2;
    private fjx0 zzf = AbstractC2245p5.m13226w();

    static {
        C2214l6 c2214l6 = new C2214l6();
        zzb = c2214l6;
        AbstractC2245p5.m13213C(C2214l6.class, c2214l6);
    }

    public C2214l6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
        this.zzj = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", C2182h6.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C2214l6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new lnx0(mmx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

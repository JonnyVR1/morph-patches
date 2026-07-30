package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.q4s0;
import p149l.q5s0;
import p149l.t8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2225q0 extends AbstractC2222p5 implements abx0 {
    private static final C2225q0 zzb;
    private int zzd;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private C2233r0 zzo;

    static {
        C2225q0 c2225q0 = new C2225q0();
        zzb = c2225q0;
        AbstractC2222p5.m13159C(C2225q0.class, c2225q0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            t8x0 t8x0Var = q4s0.f152670a;
            return AbstractC2222p5.m13175z(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", t8x0Var, "zzf", t8x0Var, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new C2225q0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new q5s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

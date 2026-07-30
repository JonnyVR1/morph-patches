package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.v5s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2265v0 extends AbstractC2222p5 implements abx0 {
    private static final C2265v0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C2265v0 c2265v0 = new C2265v0();
        zzb = c2265v0;
        AbstractC2222p5.m13159C(C2265v0.class, c2265v0);
    }

    /* JADX INFO: renamed from: L */
    public static v5s0 m13370L() {
        return (v5s0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13372N(C2265v0 c2265v0, int i) {
        c2265v0.zzd |= 1;
        c2265v0.zze = i;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13373O(C2265v0 c2265v0, int i) {
        c2265v0.zzd |= 2;
        c2265v0.zzf = i;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13374P(C2265v0 c2265v0, int i) {
        c2265v0.zzd |= 4;
        c2265v0.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2265v0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new v5s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.w3s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C2296z extends AbstractC2222p5 implements abx0 {
    private static final C2296z zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        C2296z c2296z = new C2296z();
        zzb = c2296z;
        AbstractC2222p5.m13159C(C2296z.class, c2296z);
    }

    /* JADX INFO: renamed from: L */
    public static w3s0 m13506L() {
        return (w3s0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static C2296z m13508N() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13509O(C2296z c2296z, boolean z) {
        c2296z.zzd |= 1;
        c2296z.zze = z;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13510P(C2296z c2296z, int i) {
        c2296z.zzd |= 2;
        c2296z.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2296z();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new w3s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

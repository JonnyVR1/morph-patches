package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p149l.abx0;
import p149l.d8x0;
import p149l.g4x0;
import p149l.h4x0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2285x4 extends AbstractC2222p5 implements abx0 {
    private static final C2285x4 zzb;
    private int zzd;
    private z9x0 zze = AbstractC2222p5.m13172w();

    static {
        C2285x4 c2285x4 = new C2285x4();
        zzb = c2285x4;
        AbstractC2222p5.m13159C(C2285x4.class, c2285x4);
    }

    /* JADX INFO: renamed from: N */
    public static h4x0 m13452N() {
        return (h4x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: Q */
    public static C2285x4 m13454Q(InputStream inputStream, d8x0 d8x0Var) throws IOException {
        return (C2285x4) AbstractC2222p5.m13166q(zzb, inputStream, d8x0Var);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13456T(C2285x4 c2285x4, C2277w4 c2277w4) {
        c2277w4.getClass();
        z9x0 z9x0Var = c2285x4.zze;
        if (!z9x0Var.zzc()) {
            c2285x4.zze = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2285x4.zze.add(c2277w4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C2277w4.class});
        }
        if (i2 == 3) {
            return new C2285x4();
        }
        g4x0 g4x0Var = null;
        if (i2 == 4) {
            return new h4x0(g4x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13457L() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: M */
    public final int m13458M() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: O */
    public final C2277w4 m13459O(int i) {
        return (C2277w4) this.zze.get(i);
    }

    /* JADX INFO: renamed from: R */
    public final List m13460R() {
        return this.zze;
    }
}

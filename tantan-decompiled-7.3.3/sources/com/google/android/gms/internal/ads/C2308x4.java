package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p153l.fjx0;
import p153l.gkx0;
import p153l.jhx0;
import p153l.mdx0;
import p153l.ndx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2308x4 extends AbstractC2245p5 implements gkx0 {
    private static final C2308x4 zzb;
    private int zzd;
    private fjx0 zze = AbstractC2245p5.m13226w();

    static {
        C2308x4 c2308x4 = new C2308x4();
        zzb = c2308x4;
        AbstractC2245p5.m13213C(C2308x4.class, c2308x4);
    }

    /* JADX INFO: renamed from: N */
    public static ndx0 m13506N() {
        return (ndx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: Q */
    public static C2308x4 m13508Q(InputStream inputStream, jhx0 jhx0Var) throws IOException {
        return (C2308x4) AbstractC2245p5.m13220q(zzb, inputStream, jhx0Var);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13510T(C2308x4 c2308x4, C2300w4 c2300w4) {
        c2300w4.getClass();
        fjx0 fjx0Var = c2308x4.zze;
        if (!fjx0Var.zzc()) {
            c2308x4.zze = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2308x4.zze.add(c2300w4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C2300w4.class});
        }
        if (i2 == 3) {
            return new C2308x4();
        }
        mdx0 mdx0Var = null;
        if (i2 == 4) {
            return new ndx0(mdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13511L() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: M */
    public final int m13512M() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: O */
    public final C2300w4 m13513O(int i) {
        return (C2300w4) this.zze.get(i);
    }

    /* JADX INFO: renamed from: R */
    public final List m13514R() {
        return this.zze;
    }
}

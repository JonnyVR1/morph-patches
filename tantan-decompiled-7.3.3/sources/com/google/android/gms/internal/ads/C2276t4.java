package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.ycx0;
import p153l.zcx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2276t4 extends AbstractC2245p5 implements gkx0 {
    private static final C2276t4 zzb;
    private String zzd = "";
    private zzgyl zze = zzgyl.zzb;
    private int zzf;

    static {
        C2276t4 c2276t4 = new C2276t4();
        zzb = c2276t4;
        AbstractC2245p5.m13213C(C2276t4.class, c2276t4);
    }

    /* JADX INFO: renamed from: L */
    public static zcx0 m13373L() {
        return (zcx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2276t4 m13375O() {
        return zzb;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m13376R(C2276t4 c2276t4, String str) {
        str.getClass();
        c2276t4.zzd = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13377S(C2276t4 c2276t4, zzgyl zzgylVar) {
        zzgylVar.getClass();
        c2276t4.zze = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2276t4();
        }
        ycx0 ycx0Var = null;
        if (i2 == 4) {
            return new zcx0(ycx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: M */
    public final zzgus m13379M() {
        zzgus zzgusVar;
        int i = this.zzf;
        zzgus zzgusVar2 = zzgus.UNKNOWN_KEYMATERIAL;
        if (i == 0) {
            zzgusVar = zzgus.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            zzgusVar = zzgus.SYMMETRIC;
        } else if (i == 2) {
            zzgusVar = zzgus.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            zzgusVar = i != 4 ? null : zzgus.REMOTE;
        } else {
            zzgusVar = zzgus.ASYMMETRIC_PUBLIC;
        }
        return zzgusVar == null ? zzgus.UNRECOGNIZED : zzgusVar;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m13380P() {
        return this.zze;
    }

    /* JADX INFO: renamed from: Q */
    public final String m13381Q() {
        return this.zzd;
    }
}

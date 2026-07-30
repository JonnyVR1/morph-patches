package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.s3x0;
import p149l.t3x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2253t4 extends AbstractC2222p5 implements abx0 {
    private static final C2253t4 zzb;
    private String zzd = "";
    private zzgyl zze = zzgyl.zzb;
    private int zzf;

    static {
        C2253t4 c2253t4 = new C2253t4();
        zzb = c2253t4;
        AbstractC2222p5.m13159C(C2253t4.class, c2253t4);
    }

    /* JADX INFO: renamed from: L */
    public static t3x0 m13319L() {
        return (t3x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2253t4 m13321O() {
        return zzb;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m13322R(C2253t4 c2253t4, String str) {
        str.getClass();
        c2253t4.zzd = str;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m13323S(C2253t4 c2253t4, zzgyl zzgylVar) {
        zzgylVar.getClass();
        c2253t4.zze = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2253t4();
        }
        s3x0 s3x0Var = null;
        if (i2 == 4) {
            return new t3x0(s3x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: M */
    public final zzgus m13325M() {
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
    public final zzgyl m13326P() {
        return this.zze;
    }

    /* JADX INFO: renamed from: Q */
    public final String m13327Q() {
        return this.zzd;
    }
}

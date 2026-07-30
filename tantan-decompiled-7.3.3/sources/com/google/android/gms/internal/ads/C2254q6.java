package com.google.android.gms.internal.ads;

import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.aox0;
import p153l.gkx0;
import p153l.mmx0;
import p153l.znx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2254q6 extends AbstractC2245p5 implements gkx0 {
    private static final C2254q6 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgyl zzg;
    private zzgyl zzh;

    static {
        C2254q6 c2254q6 = new C2254q6();
        zzb = c2254q6;
        AbstractC2245p5.m13213C(C2254q6.class, c2254q6);
    }

    public C2254q6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    /* JADX INFO: renamed from: L */
    public static znx0 m13266L() {
        return (znx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13268N(C2254q6 c2254q6, String str) {
        c2254q6.zzd |= 2;
        c2254q6.zzf = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13269O(C2254q6 c2254q6, zzgyl zzgylVar) {
        zzgylVar.getClass();
        c2254q6.zzd |= 4;
        c2254q6.zzg = zzgylVar;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13270P(C2254q6 c2254q6, int i) {
        c2254q6.zze = 1;
        c2254q6.zzd = 1 | c2254q6.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", aox0.f72656a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2254q6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new znx0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

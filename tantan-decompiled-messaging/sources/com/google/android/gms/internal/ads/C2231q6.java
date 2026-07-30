package com.google.android.gms.internal.ads;

import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.abx0;
import p149l.gdx0;
import p149l.tex0;
import p149l.uex0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2231q6 extends AbstractC2222p5 implements abx0 {
    private static final C2231q6 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgyl zzg;
    private zzgyl zzh;

    static {
        C2231q6 c2231q6 = new C2231q6();
        zzb = c2231q6;
        AbstractC2222p5.m13159C(C2231q6.class, c2231q6);
    }

    public C2231q6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    /* JADX INFO: renamed from: L */
    public static tex0 m13212L() {
        return (tex0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13214N(C2231q6 c2231q6, String str) {
        c2231q6.zzd |= 2;
        c2231q6.zzf = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13215O(C2231q6 c2231q6, zzgyl zzgylVar) {
        zzgylVar.getClass();
        c2231q6.zzd |= 4;
        c2231q6.zzg = zzgylVar;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13216P(C2231q6 c2231q6, int i) {
        c2231q6.zze = 1;
        c2231q6.zzd = 1 | c2231q6.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", uex0.f176214a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2231q6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new tex0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.cex0;
import p149l.gdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2159h6 extends AbstractC2222p5 implements abx0 {
    private static final C2159h6 zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private byte zzg = 2;

    static {
        C2159h6 c2159h6 = new C2159h6();
        zzb = c2159h6;
        AbstractC2222p5.m13159C(C2159h6.class, c2159h6);
    }

    public C2159h6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zze = zzgylVar;
        this.zzf = zzgylVar;
    }

    /* JADX INFO: renamed from: L */
    public static cex0 m12745L() {
        return (cex0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12747N(C2159h6 c2159h6, zzgyl zzgylVar) {
        c2159h6.zzd |= 1;
        c2159h6.zze = zzgylVar;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12748O(C2159h6 c2159h6, zzgyl zzgylVar) {
        c2159h6.zzd |= 2;
        c2159h6.zzf = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2159h6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new cex0(gdx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

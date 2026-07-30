package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.nfx0;
import p149l.ofx0;
import p149l.qfx0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2303z6 extends AbstractC2222p5 implements abx0 {
    private static final C2303z6 zzb;
    private int zzd;
    private boolean zzk;
    private double zzl;
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private String zze = "";
    private String zzf = "";
    private int zzg = 4;
    private z9x0 zzh = AbstractC2222p5.m13172w();
    private String zzi = "";
    private String zzj = "";
    private z9x0 zzm = AbstractC2222p5.m13172w();

    static {
        C2303z6 c2303z6 = new C2303z6();
        zzb = c2303z6;
        AbstractC2222p5.m13159C(C2303z6.class, c2303z6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzd", "zze", "zzg", qfx0.f154296a, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", C2295y6.class, "zzf", "zzn", ofx0.f143763a, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new C2303z6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new nfx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.gms.internal.play_billing;

import p149l.eix0;
import p149l.fxx0;
import p149l.iix0;
import p149l.kxx0;
import p149l.pxx0;
import p149l.wwx0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2406q0 extends AbstractC2380d0 implements xmx0 {
    private static final C2406q0 zzb;
    private int zzd;
    private int zzf;
    private C2402o0 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private eix0 zzg = AbstractC2380d0.m14760o();
    private iix0 zzh = AbstractC2380d0.m14761q();

    static {
        C2406q0 c2406q0 = new C2406q0();
        zzb = c2406q0;
        AbstractC2380d0.m14764v(C2406q0.class, c2406q0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", kxx0.f125233a, "zzg", wwx0.f188411a, "zzh", C2420x0.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C2406q0();
        }
        pxx0 pxx0Var = null;
        if (i2 == 4) {
            return new fxx0(pxx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

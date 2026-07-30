package com.google.android.gms.internal.play_billing;

import p149l.iix0;
import p149l.u3w0;
import p149l.v5w0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C2417w extends AbstractC2380d0 implements xmx0 {
    private static final C2417w zzb;
    private iix0 zzd = AbstractC2380d0.m14761q();

    static {
        C2417w c2417w = new C2417w();
        zzb = c2417w;
        AbstractC2380d0.m14764v(C2417w.class, c2417w);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14949A(C2417w c2417w, Iterable iterable) {
        iix0 iix0Var = c2417w.zzd;
        if (!iix0Var.zzc()) {
            int size = iix0Var.size();
            c2417w.zzd = iix0Var.zzd(size + size);
        }
        AbstractC2421y.m14964c(iterable, c2417w.zzd);
    }

    /* JADX INFO: renamed from: y */
    public static u3w0 m14950y() {
        return (u3w0) zzb.m14771j();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2415v.class});
        }
        if (i2 == 3) {
            return new C2417w();
        }
        v5w0 v5w0Var = null;
        if (i2 == 4) {
            return new u3w0(v5w0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

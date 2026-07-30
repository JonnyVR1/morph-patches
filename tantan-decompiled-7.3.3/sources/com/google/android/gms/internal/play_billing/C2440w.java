package com.google.android.gms.internal.play_billing;

import p153l.adw0;
import p153l.bfw0;
import p153l.dwx0;
import p153l.orx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C2440w extends AbstractC2403d0 implements dwx0 {
    private static final C2440w zzb;
    private orx0 zzd = AbstractC2403d0.m14815q();

    static {
        C2440w c2440w = new C2440w();
        zzb = c2440w;
        AbstractC2403d0.m14818v(C2440w.class, c2440w);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m15003A(C2440w c2440w, Iterable iterable) {
        orx0 orx0Var = c2440w.zzd;
        if (!orx0Var.zzc()) {
            int size = orx0Var.size();
            c2440w.zzd = orx0Var.zzd(size + size);
        }
        AbstractC2444y.m15018c(iterable, c2440w.zzd);
    }

    /* JADX INFO: renamed from: y */
    public static adw0 m15004y() {
        return (adw0) zzb.m14825j();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2438v.class});
        }
        if (i2 == 3) {
            return new C2440w();
        }
        bfw0 bfw0Var = null;
        if (i2 == 4) {
            return new adw0(bfw0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

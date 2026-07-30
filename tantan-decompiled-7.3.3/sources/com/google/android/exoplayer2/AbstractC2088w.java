package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.AbstractC2088w;
import com.google.android.exoplayer2.InterfaceC1886e;
import p153l.bmk0;
import p153l.za50;

/* JADX INFO: renamed from: com.google.android.exoplayer2.w */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC2088w implements InterfaceC1886e {

    /* JADX INFO: renamed from: a */
    public static final String f9668a = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC1886e.a<AbstractC2088w> f9669b = new InterfaceC1886e.a() { // from class: l.jlc0
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return AbstractC2088w.m12258b(bundle);
        }
    };

    /* JADX INFO: renamed from: b */
    public static AbstractC2088w m12258b(Bundle bundle) {
        int i = bundle.getInt(f9668a, -1);
        if (i == 0) {
            return (AbstractC2088w) C1895l.f7834g.mo10034a(bundle);
        }
        if (i == 1) {
            return (AbstractC2088w) C1952r.f8282e.mo10034a(bundle);
        }
        if (i == 2) {
            return (AbstractC2088w) C2091z.f9672g.mo10034a(bundle);
        }
        if (i == 3) {
            return (AbstractC2088w) C1855b0.f7322g.mo10034a(bundle);
        }
        za50.m219101a("Unknown RatingType: ", i);
        return null;
    }
}

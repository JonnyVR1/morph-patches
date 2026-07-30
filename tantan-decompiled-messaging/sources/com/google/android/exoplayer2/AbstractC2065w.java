package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.AbstractC2065w;
import com.google.android.exoplayer2.InterfaceC1863e;
import p149l.k250;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.w */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC2065w implements InterfaceC1863e {

    /* JADX INFO: renamed from: a */
    public static final String f9631a = vck0.m197903z0(0);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC1863e.a<AbstractC2065w> f9632b = new InterfaceC1863e.a() { // from class: l.cdc0
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return AbstractC2065w.m12204b(bundle);
        }
    };

    /* JADX INFO: renamed from: b */
    public static AbstractC2065w m12204b(Bundle bundle) {
        int i = bundle.getInt(f9631a, -1);
        if (i == 0) {
            return (AbstractC2065w) C1872l.f7797g.mo9980a(bundle);
        }
        if (i == 1) {
            return (AbstractC2065w) C1929r.f8245e.mo9980a(bundle);
        }
        if (i == 2) {
            return (AbstractC2065w) C2068z.f9635g.mo9980a(bundle);
        }
        if (i == 3) {
            return (AbstractC2065w) C1832b0.f7285g.mo9980a(bundle);
        }
        k250.m144273a("Unknown RatingType: ", i);
        return null;
    }
}

package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;
import p153l.kzq;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.n */
/* JADX INFO: loaded from: classes.dex */
final class C1087n {

    /* JADX INFO: renamed from: a */
    private final Map<kzq, C1082i<?>> f4555a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<kzq, C1082i<?>> f4556b = new HashMap();

    /* JADX INFO: renamed from: b */
    private Map<kzq, C1082i<?>> m5506b(boolean z) {
        return z ? this.f4556b : this.f4555a;
    }

    /* JADX INFO: renamed from: a */
    public C1082i<?> m5507a(kzq kzqVar, boolean z) {
        return m5506b(z).get(kzqVar);
    }

    /* JADX INFO: renamed from: c */
    public void m5508c(kzq kzqVar, C1082i<?> c1082i) {
        m5506b(c1082i.m5492p()).put(kzqVar, c1082i);
    }

    /* JADX INFO: renamed from: d */
    public void m5509d(kzq kzqVar, C1082i<?> c1082i) {
        Map<kzq, C1082i<?>> mapM5506b = m5506b(c1082i.m5492p());
        if (c1082i.equals(mapM5506b.get(kzqVar))) {
            mapM5506b.remove(kzqVar);
        }
    }
}

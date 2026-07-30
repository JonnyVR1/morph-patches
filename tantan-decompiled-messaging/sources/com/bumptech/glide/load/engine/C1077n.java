package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;
import p149l.kxq;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.n */
/* JADX INFO: loaded from: classes.dex */
final class C1077n {

    /* JADX INFO: renamed from: a */
    private final Map<kxq, C1072i<?>> f4543a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<kxq, C1072i<?>> f4544b = new HashMap();

    /* JADX INFO: renamed from: b */
    private Map<kxq, C1072i<?>> m5480b(boolean z) {
        return z ? this.f4544b : this.f4543a;
    }

    /* JADX INFO: renamed from: a */
    public C1072i<?> m5481a(kxq kxqVar, boolean z) {
        return m5480b(z).get(kxqVar);
    }

    /* JADX INFO: renamed from: c */
    public void m5482c(kxq kxqVar, C1072i<?> c1072i) {
        m5480b(c1072i.m5466p()).put(kxqVar, c1072i);
    }

    /* JADX INFO: renamed from: d */
    public void m5483d(kxq kxqVar, C1072i<?> c1072i) {
        Map<kxq, C1072i<?>> mapM5480b = m5480b(c1072i.m5466p());
        if (c1072i.equals(mapM5480b.get(kxqVar))) {
            mapM5480b.remove(kxqVar);
        }
    }
}

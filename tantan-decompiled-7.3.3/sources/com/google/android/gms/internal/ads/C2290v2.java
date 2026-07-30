package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2290v2 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfzj f10115a;

    public C2290v2(zzfzj zzfzjVar) {
        this.f10115a = zzfzjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f10115a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfzj zzfzjVar = this.f10115a;
        Map mapZzl = zzfzjVar.zzl();
        return mapZzl != null ? mapZzl.values().iterator() : new C2250q2(zzfzjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f10115a.size();
    }
}

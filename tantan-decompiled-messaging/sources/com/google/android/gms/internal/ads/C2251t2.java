package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2251t2 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfzj f10065a;

    public C2251t2(zzfzj zzfzjVar) {
        this.f10065a = zzfzjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10065a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f10065a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfzj zzfzjVar = this.f10065a;
        Map mapZzl = zzfzjVar.zzl();
        return mapZzl != null ? mapZzl.keySet().iterator() : new C2211o2(zzfzjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapZzl = this.f10065a.zzl();
        if (mapZzl != null) {
            return mapZzl.keySet().remove(obj);
        }
        return this.f10065a.zzy(obj) != zzfzj.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10065a.size();
    }
}

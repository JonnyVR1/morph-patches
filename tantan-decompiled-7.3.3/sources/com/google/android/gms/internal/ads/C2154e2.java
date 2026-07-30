package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p153l.asw0;
import p153l.wrw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2154e2 extends asw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfyt f9918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154e2(zzfyt zzfytVar, Map map) {
        super(map);
        this.f9918b = zzfytVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        wrw0.m207709b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f73185a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f73185a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f73185a.keySet().hashCode();
    }

    @Override // p153l.asw0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2146d2(this, this.f73185a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f73185a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f9918b.zzb -= size;
        return size > 0;
    }
}

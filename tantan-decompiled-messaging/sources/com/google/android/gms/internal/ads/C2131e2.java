package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p149l.qiw0;
import p149l.uiw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2131e2 extends uiw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfyt f9881b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2131e2(zzfyt zzfytVar, Map map) {
        super(map);
        this.f9881b = zzfytVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        qiw0.m174921b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f176698a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f176698a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f176698a.keySet().hashCode();
    }

    @Override // p149l.uiw0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2123d2(this, this.f176698a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f176698a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.f9881b.zzb -= size;
        return size > 0;
    }
}

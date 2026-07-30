package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p149l.ggf0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2187l2 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final Object f9968a;

    /* JADX INFO: renamed from: b */
    public Collection f9969b;

    /* JADX INFO: renamed from: c */
    public final C2187l2 f9970c;

    /* JADX INFO: renamed from: d */
    public final Collection f9971d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzfyt f9972e;

    public C2187l2(zzfyt zzfytVar, Object obj, Collection collection, C2187l2 c2187l2) {
        this.f9972e = zzfytVar;
        this.f9968a = obj;
        this.f9969b = collection;
        this.f9970c = c2187l2;
        this.f9971d = c2187l2 == null ? null : c2187l2.f9969b;
    }

    /* JADX INFO: renamed from: a */
    public final void m12864a() {
        C2187l2 c2187l2 = this.f9970c;
        if (c2187l2 != null) {
            c2187l2.m12864a();
            return;
        }
        zzfyt zzfytVar = this.f9972e;
        zzfytVar.zza.put(this.f9968a, this.f9969b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f9969b.isEmpty();
        boolean zAdd = this.f9969b.add(obj);
        if (zAdd) {
            this.f9972e.zzb++;
            if (zIsEmpty) {
                m12864a();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f9969b.addAll(collection);
        if (zAddAll) {
            int size2 = this.f9969b.size();
            this.f9972e.zzb += size2 - size;
            if (size == 0) {
                m12864a();
                return true;
            }
        }
        return zAddAll;
    }

    /* JADX INFO: renamed from: c */
    public final void m12865c() {
        C2187l2 c2187l2 = this.f9970c;
        if (c2187l2 != null) {
            c2187l2.m12865c();
        } else if (this.f9969b.isEmpty()) {
            zzfyt zzfytVar = this.f9972e;
            zzfytVar.zza.remove(this.f9968a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f9969b.clear();
        this.f9972e.zzb -= size;
        m12865c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f9969b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f9969b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f9969b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f9969b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C2179k2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f9969b.remove(obj);
        if (zRemove) {
            this.f9972e.zzb--;
            m12865c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f9969b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f9969b.size();
            this.f9972e.zzb += size2 - size;
            m12865c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f9969b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f9969b.size();
            this.f9972e.zzb += size2 - size;
            m12865c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f9969b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f9969b.toString();
    }

    public final void zzb() {
        C2187l2 c2187l2 = this.f9970c;
        if (c2187l2 != null) {
            c2187l2.zzb();
            C2187l2 c2187l3 = this.f9970c;
            if (c2187l3.f9969b == this.f9971d) {
                return;
            }
            ggf0.m125962a();
            return;
        }
        if (this.f9969b.isEmpty()) {
            zzfyt zzfytVar = this.f9972e;
            Collection collection = (Collection) zzfytVar.zza.get(this.f9968a);
            if (collection != null) {
                this.f9969b = collection;
            }
        }
    }
}

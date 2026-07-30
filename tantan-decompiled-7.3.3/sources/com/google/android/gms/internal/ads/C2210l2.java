package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p153l.nof0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2210l2 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final Object f10005a;

    /* JADX INFO: renamed from: b */
    public Collection f10006b;

    /* JADX INFO: renamed from: c */
    public final C2210l2 f10007c;

    /* JADX INFO: renamed from: d */
    public final Collection f10008d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzfyt f10009e;

    public C2210l2(zzfyt zzfytVar, Object obj, Collection collection, C2210l2 c2210l2) {
        this.f10009e = zzfytVar;
        this.f10005a = obj;
        this.f10006b = collection;
        this.f10007c = c2210l2;
        this.f10008d = c2210l2 == null ? null : c2210l2.f10006b;
    }

    /* JADX INFO: renamed from: a */
    public final void m12918a() {
        C2210l2 c2210l2 = this.f10007c;
        if (c2210l2 != null) {
            c2210l2.m12918a();
            return;
        }
        zzfyt zzfytVar = this.f10009e;
        zzfytVar.zza.put(this.f10005a, this.f10006b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f10006b.isEmpty();
        boolean zAdd = this.f10006b.add(obj);
        if (zAdd) {
            this.f10009e.zzb++;
            if (zIsEmpty) {
                m12918a();
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
        boolean zAddAll = this.f10006b.addAll(collection);
        if (zAddAll) {
            int size2 = this.f10006b.size();
            this.f10009e.zzb += size2 - size;
            if (size == 0) {
                m12918a();
                return true;
            }
        }
        return zAddAll;
    }

    /* JADX INFO: renamed from: c */
    public final void m12919c() {
        C2210l2 c2210l2 = this.f10007c;
        if (c2210l2 != null) {
            c2210l2.m12919c();
        } else if (this.f10006b.isEmpty()) {
            zzfyt zzfytVar = this.f10009e;
            zzfytVar.zza.remove(this.f10005a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f10006b.clear();
        this.f10009e.zzb -= size;
        m12919c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f10006b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f10006b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f10006b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f10006b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C2202k2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f10006b.remove(obj);
        if (zRemove) {
            this.f10009e.zzb--;
            m12919c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f10006b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f10006b.size();
            this.f10009e.zzb += size2 - size;
            m12919c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f10006b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f10006b.size();
            this.f10009e.zzb += size2 - size;
            m12919c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f10006b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f10006b.toString();
    }

    public final void zzb() {
        C2210l2 c2210l2 = this.f10007c;
        if (c2210l2 != null) {
            c2210l2.zzb();
            C2210l2 c2210l3 = this.f10007c;
            if (c2210l3.f10006b == this.f10008d) {
                return;
            }
            nof0.m164126a();
            return;
        }
        if (this.f10006b.isEmpty()) {
            zzfyt zzfytVar = this.f10009e;
            Collection collection = (Collection) zzfytVar.zza.get(this.f10005a);
            if (collection != null) {
                this.f10006b = collection;
            }
        }
    }
}

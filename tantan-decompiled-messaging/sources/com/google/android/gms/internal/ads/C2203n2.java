package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2203n2 extends C2187l2 implements List {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzfyt f9997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2203n2(zzfyt zzfytVar, Object obj, List list, C2187l2 c2187l2) {
        super(zzfytVar, obj, list, c2187l2);
        this.f9997f = zzfytVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean zIsEmpty = this.f9969b.isEmpty();
        ((List) this.f9969b).add(i, obj);
        this.f9997f.zzb++;
        if (zIsEmpty) {
            m12864a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f9969b).addAll(i, collection);
        if (zAddAll) {
            int size2 = this.f9969b.size();
            this.f9997f.zzb += size2 - size;
            if (size == 0) {
                m12864a();
                return true;
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f9969b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f9969b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f9969b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C2195m2(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.f9969b).remove(i);
        this.f9997f.zzb--;
        m12865c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f9969b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List listSubList = ((List) this.f9969b).subList(i, i2);
        C2187l2 c2187l2 = this.f9970c;
        if (c2187l2 == null) {
            c2187l2 = this;
        }
        return this.f9997f.zzh(this.f9968a, listSubList, c2187l2);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new C2195m2(this, i);
    }
}

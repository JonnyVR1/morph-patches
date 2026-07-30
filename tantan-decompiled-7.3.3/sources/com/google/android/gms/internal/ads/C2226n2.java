package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2226n2 extends C2210l2 implements List {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzfyt f10034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2226n2(zzfyt zzfytVar, Object obj, List list, C2210l2 c2210l2) {
        super(zzfytVar, obj, list, c2210l2);
        this.f10034f = zzfytVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean zIsEmpty = this.f10006b.isEmpty();
        ((List) this.f10006b).add(i, obj);
        this.f10034f.zzb++;
        if (zIsEmpty) {
            m12918a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f10006b).addAll(i, collection);
        if (zAddAll) {
            int size2 = this.f10006b.size();
            this.f10034f.zzb += size2 - size;
            if (size == 0) {
                m12918a();
                return true;
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f10006b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f10006b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f10006b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C2218m2(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object objRemove = ((List) this.f10006b).remove(i);
        this.f10034f.zzb--;
        m12919c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f10006b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List listSubList = ((List) this.f10006b).subList(i, i2);
        C2210l2 c2210l2 = this.f10007c;
        if (c2210l2 == null) {
            c2210l2 = this;
        }
        return this.f10034f.zzh(this.f10005a, listSubList, c2210l2);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new C2218m2(this, i);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import p149l.qiw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2147g2 extends C2171j2 implements NavigableSet {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfyt f9891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2147g2(zzfyt zzfytVar, NavigableMap navigableMap) {
        super(zzfytVar, navigableMap);
        this.f9891d = zzfytVar;
    }

    @Override // com.google.android.gms.internal.ads.C2171j2
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SortedMap mo12714a() {
        return (NavigableMap) ((SortedMap) this.f176698a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f176698a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C2147g2(this.f9891d, ((NavigableMap) ((SortedMap) this.f176698a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f176698a)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C2147g2(this.f9891d, ((NavigableMap) ((SortedMap) this.f176698a)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f176698a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f176698a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return qiw0.m174920a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return qiw0.m174920a(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C2147g2(this.f9891d, ((NavigableMap) ((SortedMap) this.f176698a)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C2147g2(this.f9891d, ((NavigableMap) ((SortedMap) this.f176698a)).tailMap(obj, z));
    }

    @Override // com.google.android.gms.internal.ads.C2171j2, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // com.google.android.gms.internal.ads.C2171j2, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C2171j2, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import p153l.wrw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2170g2 extends C2194j2 implements NavigableSet {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfyt f9928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2170g2(zzfyt zzfytVar, NavigableMap navigableMap) {
        super(zzfytVar, navigableMap);
        this.f9928d = zzfytVar;
    }

    @Override // com.google.android.gms.internal.ads.C2194j2
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SortedMap mo12768a() {
        return (NavigableMap) ((SortedMap) this.f73185a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f73185a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C2170g2(this.f9928d, ((NavigableMap) ((SortedMap) this.f73185a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f73185a)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C2170g2(this.f9928d, ((NavigableMap) ((SortedMap) this.f73185a)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f73185a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f73185a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return wrw0.m207708a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return wrw0.m207708a(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C2170g2(this.f9928d, ((NavigableMap) ((SortedMap) this.f73185a)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C2170g2(this.f9928d, ((NavigableMap) ((SortedMap) this.f73185a)).tailMap(obj, z));
    }

    @Override // com.google.android.gms.internal.ads.C2194j2, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // com.google.android.gms.internal.ads.C2194j2, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C2194j2, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}

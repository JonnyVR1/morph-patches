package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2194j2 extends C2154e2 implements SortedSet {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfyt f9980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194j2(zzfyt zzfytVar, SortedMap sortedMap) {
        super(zzfytVar, sortedMap);
        this.f9980c = zzfytVar;
    }

    /* JADX INFO: renamed from: a */
    public SortedMap mo12768a() {
        return (SortedMap) this.f73185a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return mo12768a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return mo12768a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C2194j2(this.f9980c, mo12768a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return mo12768a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C2194j2(this.f9980c, mo12768a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C2194j2(this.f9980c, mo12768a().tailMap(obj));
    }
}

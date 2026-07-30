package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2186i2 extends C2129b2 implements SortedMap {

    /* JADX INFO: renamed from: e */
    public SortedSet f9969e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzfyt f9970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2186i2(zzfyt zzfytVar, SortedMap sortedMap) {
        super(zzfytVar, sortedMap);
        this.f9970f = zzfytVar;
    }

    /* JADX INFO: renamed from: c */
    public SortedMap mo12743c() {
        return (SortedMap) this.f9867c;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo12743c().comparator();
    }

    /* JADX INFO: renamed from: d */
    public SortedSet mo12744d() {
        return new C2194j2(this.f9970f, mo12743c());
    }

    @Override // com.google.android.gms.internal.ads.C2129b2, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f9969e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo12744d = mo12744d();
        this.f9969e = sortedSetMo12744d;
        return sortedSetMo12744d;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo12743c().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C2186i2(this.f9970f, mo12743c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo12743c().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C2186i2(this.f9970f, mo12743c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C2186i2(this.f9970f, mo12743c().tailMap(obj));
    }
}

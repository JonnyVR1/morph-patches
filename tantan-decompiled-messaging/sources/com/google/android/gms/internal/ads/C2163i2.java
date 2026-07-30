package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2163i2 extends C2106b2 implements SortedMap {

    /* JADX INFO: renamed from: e */
    public SortedSet f9932e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzfyt f9933f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2163i2(zzfyt zzfytVar, SortedMap sortedMap) {
        super(zzfytVar, sortedMap);
        this.f9933f = zzfytVar;
    }

    /* JADX INFO: renamed from: c */
    public SortedMap mo12689c() {
        return (SortedMap) this.f9830c;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo12689c().comparator();
    }

    /* JADX INFO: renamed from: d */
    public SortedSet mo12690d() {
        return new C2171j2(this.f9933f, mo12689c());
    }

    @Override // com.google.android.gms.internal.ads.C2106b2, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f9932e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetMo12690d = mo12690d();
        this.f9932e = sortedSetMo12690d;
        return sortedSetMo12690d;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo12689c().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C2163i2(this.f9933f, mo12689c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo12689c().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C2163i2(this.f9933f, mo12689c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C2163i2(this.f9933f, mo12689c().tailMap(obj));
    }
}

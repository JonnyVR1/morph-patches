package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2162f2 extends C2186i2 implements NavigableMap {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zzfyt f9923g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2162f2(zzfyt zzfytVar, NavigableMap navigableMap) {
        super(zzfytVar, navigableMap);
        this.f9923g = zzfytVar;
    }

    @Override // com.google.android.gms.internal.ads.C2186i2
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SortedMap mo12743c() {
        return (NavigableMap) ((SortedMap) this.f9867c);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f9867c)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m12586b(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f9867c)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C2162f2(this.f9923g, ((NavigableMap) ((SortedMap) this.f9867c)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.C2186i2
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    /* JADX INFO: renamed from: f */
    public final Map.Entry m12746f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionZza = this.f9923g.zza();
        collectionZza.addAll((Collection) entry.getValue());
        it.remove();
        return new zzfzw(entry.getKey(), this.f9923g.zzb(collectionZza));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f9867c)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m12586b(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f9867c)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m12586b(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f9867c)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C2186i2
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableSet mo12744d() {
        return new C2170g2(this.f9923g, (NavigableMap) ((SortedMap) this.f9867c));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C2162f2(this.f9923g, ((NavigableMap) ((SortedMap) this.f9867c)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f9867c)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m12586b(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f9867c)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C2186i2, com.google.android.gms.internal.ads.C2129b2, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f9867c)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m12586b(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f9867c)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m12586b(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f9867c)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m12746f(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m12746f(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C2162f2(this.f9923g, ((NavigableMap) ((SortedMap) this.f9867c)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C2162f2(this.f9923g, ((NavigableMap) ((SortedMap) this.f9867c)).tailMap(obj, z));
    }

    @Override // com.google.android.gms.internal.ads.C2186i2, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // com.google.android.gms.internal.ads.C2186i2, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C2186i2, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p153l.csw0;
import p153l.dsw0;
import p153l.wrw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2129b2 extends csw0 {

    /* JADX INFO: renamed from: c */
    public final transient Map f9867c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfyt f9868d;

    public C2129b2(zzfyt zzfytVar, Map map) {
        this.f9868d = zzfytVar;
        this.f9867c = map;
    }

    @Override // p153l.csw0
    /* JADX INFO: renamed from: a */
    public final Set mo12585a() {
        return new C2321z1(this);
    }

    /* JADX INFO: renamed from: b */
    public final Map.Entry m12586b(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfzw(key, this.f9868d.zzc(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzfyt zzfytVar = this.f9868d;
        if (this.f9867c == zzfytVar.zza) {
            zzfytVar.zzp();
        } else {
            wrw0.m207709b(new C2120a2(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f9867c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f9867c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) dsw0.m117779a(this.f9867c, obj);
        if (collection == null) {
            return null;
        }
        return this.f9868d.zzc(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f9867c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f9868d.zzt();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f9867c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionZza = this.f9868d.zza();
        collectionZza.addAll(collection);
        this.f9868d.zzb -= collection.size();
        collection.clear();
        return collectionZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9867c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f9867c.toString();
    }
}

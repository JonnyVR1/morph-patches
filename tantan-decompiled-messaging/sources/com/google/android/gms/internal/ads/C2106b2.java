package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p149l.qiw0;
import p149l.wiw0;
import p149l.xiw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b2 */
/* JADX INFO: loaded from: classes6.dex */
public class C2106b2 extends wiw0 {

    /* JADX INFO: renamed from: c */
    public final transient Map f9830c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzfyt f9831d;

    public C2106b2(zzfyt zzfytVar, Map map) {
        this.f9831d = zzfytVar;
        this.f9830c = map;
    }

    @Override // p149l.wiw0
    /* JADX INFO: renamed from: a */
    public final Set mo12531a() {
        return new C2298z1(this);
    }

    /* JADX INFO: renamed from: b */
    public final Map.Entry m12532b(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfzw(key, this.f9831d.zzc(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzfyt zzfytVar = this.f9831d;
        if (this.f9830c == zzfytVar.zza) {
            zzfytVar.zzp();
        } else {
            qiw0.m174921b(new C2097a2(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f9830c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f9830c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) xiw0.m209680a(this.f9830c, obj);
        if (collection == null) {
            return null;
        }
        return this.f9831d.zzc(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f9830c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f9831d.zzt();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f9830c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionZza = this.f9831d.zza();
        collectionZza.addAll(collection);
        this.f9831d.zzb -= collection.size();
        collection.clear();
        return collectionZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9830c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f9830c.toString();
    }
}

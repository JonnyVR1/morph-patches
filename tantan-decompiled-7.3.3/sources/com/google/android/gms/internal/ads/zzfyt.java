package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import p153l.gig0;
import p153l.qpw0;
import p153l.rpw0;
import p153l.tow0;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzfyt extends rpw0 implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfyt(Map map) {
        tow0.m192090e(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfyt zzfytVar, Object obj) {
        Object objRemove;
        try {
            objRemove = zzfytVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfytVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // p153l.esw0
    public final int zze() {
        return this.zzb;
    }

    @Override // p153l.rpw0
    public final Collection zzf() {
        return new qpw0(this);
    }

    @Override // p153l.rpw0
    public final Iterator zzg() {
        return new C2313y1(this);
    }

    public final List zzh(Object obj, List list, C2210l2 c2210l2) {
        return list instanceof RandomAccess ? new C2178h2(this, obj, list, c2210l2) : new C2226n2(this, obj, list, c2210l2);
    }

    @Override // p153l.rpw0
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new C2162f2(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C2186i2(this, (SortedMap) map) : new C2129b2(this, map);
    }

    @Override // p153l.rpw0
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new C2170g2(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C2194j2(this, (SortedMap) map) : new C2154e2(this, map);
    }

    @Override // p153l.esw0
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // p153l.rpw0, p153l.esw0
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            gig0.m130323a("New Collection violated the Collection spec");
            return false;
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}

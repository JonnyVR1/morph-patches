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
import p149l.kgw0;
import p149l.lgw0;
import p149l.nfw0;
import p149l.y9g0;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzfyt extends lgw0 implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfyt(Map map) {
        nfw0.m159283e(map.isEmpty());
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

    @Override // p149l.yiw0
    public final int zze() {
        return this.zzb;
    }

    @Override // p149l.lgw0
    public final Collection zzf() {
        return new kgw0(this);
    }

    @Override // p149l.lgw0
    public final Iterator zzg() {
        return new C2290y1(this);
    }

    public final List zzh(Object obj, List list, C2187l2 c2187l2) {
        return list instanceof RandomAccess ? new C2155h2(this, obj, list, c2187l2) : new C2203n2(this, obj, list, c2187l2);
    }

    @Override // p149l.lgw0
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new C2139f2(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C2163i2(this, (SortedMap) map) : new C2106b2(this, map);
    }

    @Override // p149l.lgw0
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new C2147g2(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C2171j2(this, (SortedMap) map) : new C2131e2(this, map);
    }

    @Override // p149l.yiw0
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // p149l.lgw0, p149l.yiw0
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
            y9g0.m213537a("New Collection violated the Collection spec");
            return false;
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}

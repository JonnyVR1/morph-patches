package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzbpd {
    final boolean zza;
    final List zzb;
    final Collection zzc;
    final Collection zzd;
    final int zze;
    final zzbpm zzf;
    final boolean zzg;
    final boolean zzh;

    public zzbpd(List list, Collection collection, Collection collection2, zzbpm zzbpmVar, boolean z, boolean z2, boolean z3, int i) {
        this.zzb = list;
        zzmt.zzc(collection, "drainedSubstreams");
        this.zzc = collection;
        this.zzf = zzbpmVar;
        this.zzd = collection2;
        this.zzg = z;
        this.zza = z2;
        this.zzh = z3;
        this.zze = i;
        zzmt.zzp(!z2 || list == null, "passThrough should imply buffer is null");
        zzmt.zzp((z2 && zzbpmVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        zzmt.zzp(!z2 || (collection.size() == 1 && collection.contains(zzbpmVar)) || (collection.size() == 0 && zzbpmVar.zzb), "passThrough should imply winningSubstream is drained");
        zzmt.zzp((z && zzbpmVar == null) ? false : true, "cancelled should imply committed");
    }

    public final zzbpd zza(zzbpm zzbpmVar) {
        Collection collectionUnmodifiableCollection;
        zzmt.zzp(!this.zzh, "hedging frozen");
        zzmt.zzp(this.zzf == null, "already committed");
        Collection collection = this.zzd;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(zzbpmVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(zzbpmVar);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new zzbpd(this.zzb, this.zzc, collectionUnmodifiableCollection, this.zzf, this.zzg, this.zza, this.zzh, this.zze + 1);
    }

    public final zzbpd zzb() {
        return this.zzh ? this : new zzbpd(this.zzb, this.zzc, this.zzd, this.zzf, this.zzg, this.zza, true, this.zze);
    }

    public final zzbpd zzc(zzbpm zzbpmVar) {
        zzmt.zzp(!this.zza, "Already passThrough");
        boolean z = zzbpmVar.zzb;
        Collection collectionUnmodifiableCollection = this.zzc;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(zzbpmVar);
            } else {
                ArrayList arrayList = new ArrayList(this.zzc);
                arrayList.add(zzbpmVar);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        zzbpm zzbpmVar2 = this.zzf;
        boolean z2 = zzbpmVar2 != null;
        List list = this.zzb;
        if (z2) {
            zzmt.zzp(zzbpmVar2 == zzbpmVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new zzbpd(list, collection, this.zzd, this.zzf, this.zzg, z2, this.zzh, this.zze);
    }
}

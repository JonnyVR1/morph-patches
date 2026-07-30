package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zznz {
    Object[] zza;
    int zzb;
    zzny zzc;

    public zznz(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzns.zzd(length, i2));
        }
    }

    public final zznz zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zznj.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zznz zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzoa zzc() {
        zzny zznyVar = this.zzc;
        if (zznyVar != null) {
            throw zznyVar.zza();
        }
        zzor zzorVarZzh = zzor.zzh(this.zzb, this.zza, this);
        zzny zznyVar2 = this.zzc;
        if (zznyVar2 == null) {
            return zzorVarZzh;
        }
        throw zznyVar2.zza();
    }

    public zznz() {
        this(4);
    }
}

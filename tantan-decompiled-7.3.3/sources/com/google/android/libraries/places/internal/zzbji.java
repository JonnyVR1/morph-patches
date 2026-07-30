package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzbji {
    private final Set zza = Collections.newSetFromMap(new IdentityHashMap());

    public abstract void zza();

    public abstract void zzb();

    public final void zzc(Object obj, boolean z) {
        int size = this.zza.size();
        Set set = this.zza;
        if (z) {
            set.add(obj);
            if (size == 0) {
                zza();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            zzb();
        }
    }

    public final boolean zzd(Object... objArr) {
        for (int i = 0; i < 2; i++) {
            if (this.zza.contains(objArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final boolean zze() {
        return !this.zza.isEmpty();
    }
}

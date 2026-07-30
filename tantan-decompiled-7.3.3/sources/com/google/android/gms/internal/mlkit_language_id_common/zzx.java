package com.google.android.gms.internal.mlkit_language_id_common;

import java.util.Set;
import p153l.cir0;
import p153l.qgr0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzx extends zzq implements Set {
    private transient zzu zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return qgr0.m176504a(this);
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_common.zzq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: zzd */
    public abstract cir0 iterator();

    public final zzu zzf() {
        zzu zzuVar = this.zza;
        if (zzuVar != null) {
            return zzuVar;
        }
        zzu zzuVarZzg = zzg();
        this.zza = zzuVarZzg;
        return zzuVarZzg;
    }

    public zzu zzg() {
        return zzu.zzg(toArray());
    }
}

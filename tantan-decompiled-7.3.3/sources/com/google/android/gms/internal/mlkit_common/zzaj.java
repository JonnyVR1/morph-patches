package com.google.android.gms.internal.mlkit_common;

import java.util.Set;
import p153l.qxr0;
import p153l.wyr0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzaj extends zzab implements Set {
    private transient zzaf zza;

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
        return qxr0.m178616a(this);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract wyr0 iterator();

    public final zzaf zzf() {
        zzaf zzafVar = this.zza;
        if (zzafVar != null) {
            return zzafVar;
        }
        zzaf zzafVarZzg = zzg();
        this.zza = zzafVarZzg;
        return zzafVarZzg;
    }

    public zzaf zzg() {
        Object[] array = toArray();
        int i = zzaf.zzd;
        return zzaf.zzg(array, array.length);
    }
}

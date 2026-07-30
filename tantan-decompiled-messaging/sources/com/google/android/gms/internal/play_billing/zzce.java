package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzce implements Comparable, Serializable {
    final Comparable zza = "";

    public zzce(Comparable comparable) {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzce) {
            try {
                if (compareTo((zzce) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzce zzceVar) {
        if (zzceVar == zzcd.zzb) {
            return 1;
        }
        if (zzceVar == zzcb.zzb) {
            return -1;
        }
        Comparable comparable = zzceVar.zza;
        int i = zzdh.zzc;
        int iCompareTo = "".compareTo("");
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof zzcc, zzceVar instanceof zzcc);
    }

    public abstract void zzc(StringBuilder sb);

    public abstract void zzd(StringBuilder sb);
}

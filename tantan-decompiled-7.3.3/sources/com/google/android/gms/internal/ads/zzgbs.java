package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
final class zzgbs extends AbstractC2139c3 implements Serializable {
    final AbstractC2139c3 zza;

    public zzgbs(AbstractC2139c3 abstractC2139c3) {
        this.zza = abstractC2139c3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2139c3, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgbs) {
            return this.zza.equals(((zzgbs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2139c3
    public final AbstractC2139c3 zza() {
        return this.zza;
    }
}

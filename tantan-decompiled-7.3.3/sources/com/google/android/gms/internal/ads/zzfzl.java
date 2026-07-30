package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzfzl extends AbstractC2139c3 implements Serializable {
    final Comparator zza;

    public zzfzl(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2139c3, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfzl) {
            return this.zza.equals(((zzfzl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}

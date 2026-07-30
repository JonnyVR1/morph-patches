package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
final class zzgbr extends AbstractC2139c3 implements Serializable {
    static final zzgbr zza = new zzgbr();

    private zzgbr() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2139c3, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2139c3
    public final AbstractC2139c3 zza() {
        return zzgbh.zza;
    }
}

package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
final class zzgbh extends AbstractC2139c3 implements Serializable {
    static final zzgbh zza = new zzgbh();

    private zzgbh() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2139c3, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2139c3
    public final AbstractC2139c3 zza() {
        return zzgbr.zza;
    }
}

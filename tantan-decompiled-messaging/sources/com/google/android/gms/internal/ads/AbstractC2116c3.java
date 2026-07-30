package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2116c3 implements Comparator {
    public static AbstractC2116c3 zzb(Comparator comparator) {
        return comparator instanceof AbstractC2116c3 ? (AbstractC2116c3) comparator : new zzfzl(comparator);
    }

    public static AbstractC2116c3 zzc() {
        return zzgbh.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public AbstractC2116c3 zza() {
        return new zzgbs(this);
    }
}

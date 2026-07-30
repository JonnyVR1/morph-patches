package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import p149l.d1u0;

/* JADX INFO: loaded from: classes6.dex */
final class zzdc extends d1u0 implements Serializable {
    static final zzdc zza = new zzdc();

    private zzdc() {
    }

    @Override // java.util.Comparator
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
}

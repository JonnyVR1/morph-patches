package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.SortedSet;
import p149l.xku0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C2379d {
    /* JADX INFO: renamed from: a */
    public static boolean m14756a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zzdc.zza;
            }
        } else {
            if (!(iterable instanceof xku0)) {
                return false;
            }
            comparator2 = ((xku0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}

package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class zzot {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}

package com.google.android.libraries.places.internal;

import p153l.iuw0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzajs {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!iuw0.m142236a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}

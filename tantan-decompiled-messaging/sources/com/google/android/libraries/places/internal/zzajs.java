package com.google.android.libraries.places.internal;

import p149l.clw0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzajs {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!clw0.m107580a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}

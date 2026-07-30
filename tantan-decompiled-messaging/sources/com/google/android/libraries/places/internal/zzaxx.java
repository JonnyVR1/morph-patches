package com.google.android.libraries.places.internal;

import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaxx {
    public static Object zza(Object obj) {
        if (obj != null) {
            return obj;
        }
        jfd0.m141176a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public static void zzb(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        qkq0.m175383a(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}

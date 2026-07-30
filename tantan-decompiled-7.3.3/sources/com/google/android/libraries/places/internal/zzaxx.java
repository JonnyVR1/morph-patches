package com.google.android.libraries.places.internal;

import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaxx {
    public static Object zza(Object obj) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public static void zzb(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        wtq0.m207906a(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}

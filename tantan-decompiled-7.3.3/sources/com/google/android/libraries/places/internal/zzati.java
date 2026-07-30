package com.google.android.libraries.places.internal;

import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzati {
    private static final zzatg zza = new zzath();
    private static final zzatg zzb;

    static {
        zzatg zzatgVar = null;
        try {
            zzatgVar = (zzatg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzatgVar;
    }

    public static zzatg zza() {
        zzatg zzatgVar = zzb;
        if (zzatgVar != null) {
            return zzatgVar;
        }
        wtq0.m207906a("Protobuf runtime is not correctly loaded.");
        return null;
    }

    public static zzatg zzb() {
        return zza;
    }
}

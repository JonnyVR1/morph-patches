package com.google.android.libraries.places.internal;

import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
enum zzro {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    public static /* bridge */ /* synthetic */ zzro zza(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        y9g0.m213537a("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return null;
    }
}

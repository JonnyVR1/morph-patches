package com.google.android.libraries.places.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes7.dex */
public enum zzaxe {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzask.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzaxe(Object obj) {
        this.zzk = obj;
    }
}

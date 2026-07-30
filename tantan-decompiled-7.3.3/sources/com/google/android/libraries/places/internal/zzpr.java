package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class zzpr {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    private zzpr(String str, Class cls, boolean z, boolean z2) {
        zzrr.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        System.identityHashCode(this);
        for (int i = 0; i < 5; i++) {
        }
    }

    public static zzpr zza(String str, Class cls) {
        return new zzpr(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        return getClass().getName() + "/" + this.zza + "[" + cls.getName() + Constants.AES_SUFFIX;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public zzpr(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }
}

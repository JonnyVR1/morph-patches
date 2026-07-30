package com.google.android.libraries.places.internal;

import p149l.ig3;
import p149l.pkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzatn implements zzavd {
    private static final zzatn zza = new zzatn();

    private zzatn() {
    }

    public static zzatn zza() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzavd
    public final zzavc zzb(Class cls) {
        if (!zzatu.class.isAssignableFrom(cls)) {
            ig3.m135964a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zzavc) zzatu.zzas(cls.asSubclass(zzatu.class)).zzb(3, null, null);
        } catch (Exception e) {
            pkq0.m170054a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzavd
    public final boolean zzc(Class cls) {
        return zzatu.class.isAssignableFrom(cls);
    }
}

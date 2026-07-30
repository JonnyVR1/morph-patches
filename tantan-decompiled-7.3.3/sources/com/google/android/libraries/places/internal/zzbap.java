package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbap {
    private static final AtomicLong zza = new AtomicLong();
    private final String zzb;
    private final String zzc;
    private final long zzd;

    public zzbap(String str, String str2, long j) {
        zzmt.zzc(str, "typeName");
        zzmt.zzf(!str.isEmpty(), "empty type");
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
    }

    public static zzbap zzb(Class cls, String str) {
        zzmt.zzc(cls, "type");
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return zzc(simpleName, str);
    }

    public static zzbap zzc(String str, String str2) {
        return new zzbap(str, str2, zza.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb + "<" + this.zzd + ">");
        if (this.zzc != null) {
            sb.append(": (");
            sb.append(this.zzc);
            sb.append(')');
        }
        return sb.toString();
    }

    public final long zza() {
        return this.zzd;
    }
}

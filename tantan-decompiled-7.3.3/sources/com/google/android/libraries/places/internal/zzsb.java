package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzsb {
    public static final zzsb zza = new zzsb("about:invalid#zGuavaz");
    private final String zzb;

    public zzsb(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzsb) {
            return this.zzb.equals(((zzsb) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ 18288376;
    }

    public final String toString() {
        return "SafeUrl{" + this.zzb + "}";
    }

    public final String zza() {
        return this.zzb;
    }
}

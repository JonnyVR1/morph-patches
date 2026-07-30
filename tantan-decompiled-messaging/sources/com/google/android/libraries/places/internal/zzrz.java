package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzrz {
    public static final zzrz zza = new zzrz("");
    public static final zzrz zzb = new zzrz("<br>");
    public static final zzrz zzc = new zzrz("<!DOCTYPE html>");
    private final String zzd;

    public zzrz(String str) {
        this.zzd = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzrz) {
            return this.zzd.equals(((zzrz) obj).zzd);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode() ^ 867184553;
    }

    public final String toString() {
        return "SafeHtml{" + this.zzd + "}";
    }

    public final String zza() {
        return this.zzd;
    }
}

package com.google.android.libraries.places.internal;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class zzef {
    private final String zza;

    private zzef(String str) {
        this.zza = str;
    }

    public static zzef zza(zzef zzefVar, zzef... zzefVarArr) {
        return new zzef(zzefVar.zza.concat(zzmh.zzc("").zzf(zzoh.zza(Arrays.asList(zzefVarArr), new zzmd() { // from class: com.google.android.libraries.places.internal.zzee
        }))));
    }

    public static zzef zzb(String str) {
        return new zzef(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzef) {
            return this.zza.equals(((zzef) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}

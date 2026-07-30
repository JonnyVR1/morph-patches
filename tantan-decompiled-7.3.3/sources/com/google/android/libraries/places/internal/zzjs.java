package com.google.android.libraries.places.internal;

import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class zzjs {

    @Nullable
    private volatile String zza;

    @Nullable
    private volatile Locale zzb;
    private volatile boolean zzc;
    private volatile boolean zzd;

    public final synchronized String zza() {
        zzmt.zzp(zzg(), "ApiConfig must be initialized.");
        if (this.zza == null) {
            throw null;
        }
        return this.zza;
    }

    public final synchronized Locale zzb() {
        try {
            zzmt.zzp(zzg(), "ApiConfig must be initialized.");
        } catch (Throwable th) {
            throw th;
        }
        return this.zzb == null ? Locale.getDefault() : this.zzb;
    }

    public final synchronized void zzc() {
        this.zza = null;
        this.zzb = null;
        this.zzd = false;
    }

    public final synchronized void zzd(String str, @Nullable Locale locale, boolean z) {
        zzmt.zzc(str, "API Key must not be null.");
        zzmt.zzf(!str.isEmpty(), "API Key must not be empty.");
        this.zza = str;
        this.zzb = locale;
        this.zzc = false;
        this.zzd = false;
    }

    public final synchronized void zze(String str, @Nullable Locale locale, boolean z) {
        zzd(str, locale, false);
        this.zzd = true;
    }

    public final boolean zzf() {
        return false;
    }

    public final synchronized boolean zzg() {
        return this.zza != null;
    }

    public final boolean zzh() {
        return this.zzd;
    }
}

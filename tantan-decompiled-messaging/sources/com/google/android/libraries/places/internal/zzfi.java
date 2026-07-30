package com.google.android.libraries.places.internal;

import androidx.annotation.Nullable;
import java.util.Map;
import p149l.hf4;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzfi {
    private final zzjt zza;

    public zzfi(zzjt zzjtVar) {
        this.zza = zzjtVar;
    }

    @Nullable
    public final hf4 zza() {
        return this.zza.getCancellationToken();
    }

    public final zzjt zzb() {
        return this.zza;
    }

    public abstract String zzc();

    public abstract Map zzd();
}

package com.google.android.libraries.places.internal;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes7.dex */
public final class zzjw {
    private final Context zza;

    @VisibleForTesting
    public zzjw(Context context) {
        this.zza = context;
    }

    public final zzbcf zza(String str, String str2) {
        zzbcf zzbcfVar = new zzbcf();
        if (!str.isEmpty()) {
            zzbcfVar.zzf(zzbca.zzc("X-Goog-FieldMask", zzbcf.zzb), str);
        }
        zzbbx zzbbxVar = zzbcf.zzb;
        zzbcfVar.zzf(zzbca.zzc("X-Goog-Api-Key", zzbbxVar), str2);
        Context context = this.zza;
        String strZza = zzju.zza(context.getPackageManager(), context.getPackageName());
        if (!TextUtils.isEmpty(strZza)) {
            zzbcfVar.zzf(zzbca.zzc("X-Android-Package", zzbbxVar), this.zza.getPackageName());
            zzbcfVar.zzf(zzbca.zzc("X-Android-Cert", zzbbxVar), strZza);
        }
        return zzbcfVar;
    }
}

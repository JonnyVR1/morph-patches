package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzkb {
    public static zzka zzd(Context context) {
        String packageName = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zzjx zzjxVar = new zzjx();
        zzjxVar.zza(packageName);
        zzjxVar.zzb(i);
        zzjxVar.zzd(1);
        return zzjxVar;
    }

    public abstract int zza();

    public abstract String zzb();

    public abstract int zzc();
}

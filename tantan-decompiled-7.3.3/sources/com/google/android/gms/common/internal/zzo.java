package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class zzo {
    private static final Uri zza = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    @Nullable
    private final String zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public zzo(String str, String str2, int i, boolean z) {
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = 4225;
        this.zzf = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        return Objects.equal(this.zzb, zzoVar.zzb) && Objects.equal(this.zzc, zzoVar.zzc) && Objects.equal(this.zzd, zzoVar.zzd) && this.zzf == zzoVar.zzf;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, this.zzd, 4225, Boolean.valueOf(this.zzf));
    }

    public final String toString() {
        String str = this.zzb;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.zzd);
        return this.zzd.flattenToString();
    }

    @Nullable
    public final ComponentName zza() {
        return this.zzd;
    }

    public final Intent zzb(Context context) {
        Bundle bundleCall;
        if (this.zzb == null) {
            return new Intent().setComponent(this.zzd);
        }
        Intent intent = null;
        if (this.zzf) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.zzb);
            try {
                bundleCall = context.getContentResolver().call(zza, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.zzb));
            }
        }
        return intent == null ? new Intent(this.zzb).setPackage(this.zzc) : intent;
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    public zzo(String str, int i, boolean z) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public zzo(ComponentName componentName, int i) {
        this.zzb = null;
        this.zzc = null;
        Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = 4225;
        this.zzf = false;
    }
}

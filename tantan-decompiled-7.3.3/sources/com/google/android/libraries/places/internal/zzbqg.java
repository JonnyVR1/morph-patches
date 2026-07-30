package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbqg {
    final zzbbo zza;
    final Object zzb;

    public zzbqg(zzbbo zzbboVar, Object obj) {
        this.zza = zzbboVar;
        this.zzb = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbqg.class == obj.getClass()) {
            zzbqg zzbqgVar = (zzbqg) obj;
            if (zzmo.zza(this.zza, zzbqgVar.zza) && zzmo.zza(this.zzb, zzbqgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        zzmm zzmmVarZzb = zzmn.zzb(this);
        zzmmVarZzb.zzd("provider", this.zza);
        zzmmVarZzb.zzd(Constants.KEY_CONFIG, this.zzb);
        return zzmmVarZzb.toString();
    }
}

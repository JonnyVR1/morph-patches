package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class zzbrf extends zzbrl {
    final /* synthetic */ zzbri zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbrf(zzbri zzbriVar, zzbts zzbtsVar) {
        super(zzbtsVar);
        this.zza = zzbriVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbrl, com.google.android.libraries.places.internal.zzbts
    public final void zza(zzbue zzbueVar) throws IOException {
        this.zza.zzk++;
        super.zza(zzbueVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrl, com.google.android.libraries.places.internal.zzbts
    public final void zzb(boolean z, int i, int i2) throws IOException {
        if (z) {
            this.zza.zzk++;
        }
        super.zzb(z, i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbrl, com.google.android.libraries.places.internal.zzbts
    public final void zzc(int i, zzbtp zzbtpVar) throws IOException {
        this.zza.zzk++;
        super.zzc(i, zzbtpVar);
    }
}

package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbfk extends zzbgi {
    final /* synthetic */ zzbvq zza;
    final /* synthetic */ zzbcf zzb;
    final /* synthetic */ zzbfo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbfk(zzbfo zzbfoVar, zzbvq zzbvqVar, zzbcf zzbcfVar) {
        super(zzbfoVar.zza.zzi);
        this.zza = zzbvqVar;
        this.zzb = zzbcfVar;
        this.zzc = zzbfoVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbgi
    public final void zza() {
        int i = zzbvr.zza;
        zzbfo zzbfoVar = this.zzc;
        if (zzbfoVar.zzc != null) {
            return;
        }
        try {
            zzbfoVar.zzb.zzb(this.zzb);
        } catch (Throwable th) {
            zzbfo.zzc(this.zzc, zzbdo.zzb.zzf(th).zzg("Failed to read headers"));
        }
    }
}

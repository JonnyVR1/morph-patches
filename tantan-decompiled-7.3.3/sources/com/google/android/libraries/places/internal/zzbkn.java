package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbkn extends zzbbk {
    final /* synthetic */ Throwable zza;
    private final zzbbe zzb;

    public zzbkn(zzbma zzbmaVar, Throwable th) {
        this.zza = th;
        this.zzb = zzbbe.zza(zzbdo.zzo.zzg("Panic! This is a bug!").zzf(th));
    }

    public final String toString() {
        zzmm zzmmVarZza = zzmn.zza(zzbkn.class);
        zzmmVarZza.zzd("panicPickResult", this.zzb);
        return zzmmVarZza.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbbk
    public final zzbbe zza(zzbbf zzbbfVar) {
        return this.zzb;
    }
}

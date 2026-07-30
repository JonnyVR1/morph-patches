package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzblk extends zzayk {
    final /* synthetic */ zzbls zza;

    public zzblk(zzbls zzblsVar) {
        this.zza = zzblsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzayk
    public final zzayo zza(zzbcl zzbclVar, zzayj zzayjVar) {
        zzbma zzbmaVar = this.zza.zza;
        zzbfq zzbfqVar = new zzbfq(zzbclVar, zzbma.zzJ(zzbmaVar, zzayjVar), zzayjVar, zzbmaVar.zzai, zzbmaVar.zzR ? null : this.zza.zza.zzq.zzb(), this.zza.zza.zzU, null);
        zzbfqVar.zzn(this.zza.zza.zzx);
        zzbfqVar.zzm(this.zza.zza.zzy);
        return zzbfqVar;
    }

    @Override // com.google.android.libraries.places.internal.zzayk
    public final String zzb() {
        return this.zza.zzc;
    }
}
